package in.bushansirgur.highcharts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChatGPTRequest {

    private String model = "text-davinci-003";
    private String prompt;
    private int temperature=1;
    @JsonProperty(value="max_tokens")
    private int max_tokens =100;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public int getMax_tokens() {
        return max_tokens;
    }

    public void setMax_tokens(int max_tokens) {
        this.max_tokens = max_tokens;
    }
}
