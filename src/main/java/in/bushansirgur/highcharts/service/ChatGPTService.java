package in.bushansirgur.highcharts.service;

import com.google.gson.Gson;
import in.bushansirgur.highcharts.model.ChatGPTRequest;
import in.bushansirgur.highcharts.model.ChatGPTResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ChatGPTService {

    @Value("${OPEN_API_URL}")
    private String OPEN_API_URL;

    @Value("${OPEN_AI_KEY}")
    private String OPEN_AI_KEY;


    public String  processSearch(String query){

        ChatGPTRequest chatGPTRequest = new ChatGPTRequest();
        chatGPTRequest.setPrompt(query);
        String url = OPEN_API_URL;

        HttpPost post = new HttpPost(url);
        post.addHeader("content-type","application/json");
        post.addHeader("Authorization","Bearer "+OPEN_AI_KEY);

        try{
            Gson gson= new Gson();
        String body = gson.toJson(chatGPTRequest);
        System.out.println("body request="+body);
        final StringEntity entity = new StringEntity(body);
        post.setEntity(entity);

        try(CloseableHttpClient httpClient = HttpClients.custom().build();
            CloseableHttpResponse response = httpClient.execute(post)){
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("responseBody="+responseBody);
            ChatGPTResponse chatGPTResponse = gson.fromJson(responseBody,ChatGPTResponse.class);
            return chatGPTResponse.getChoices().get(0).getText();
        }
        catch(Exception e ){
            return "failed";
        }
        }catch(Exception e){
            return "failed";
        }
    }
}
