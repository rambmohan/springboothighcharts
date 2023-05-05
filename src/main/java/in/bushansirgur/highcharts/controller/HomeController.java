package in.bushansirgur.highcharts.controller;

import java.text.SimpleDateFormat;
import java.util.*;

import in.bushansirgur.highcharts.FetchSystemInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import in.bushansirgur.highcharts.model.Data;
import in.bushansirgur.highcharts.model.MultipleData;
import in.bushansirgur.highcharts.model.PiechartData;

@Controller
public class HomeController {

	int min = 5;
	int max = 100;
	SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
	List<Data> dataList = new ArrayList<>();

	public static Queue<Integer> queue = new LinkedList<>();

	@RequestMapping("/")
	public String showHome(){
		return "index";
	}
	
	@RequestMapping("/linechartdata")
	@ResponseBody
	public String getDataFromDB(){
		/*List<Data> dataList = getDataDAO();
		JsonArray jsonArrayCategory = new JsonArray();
		JsonArray jsonArraySeries = new JsonArray();
		JsonObject jsonObject = new JsonObject();
		dataList.forEach(data->{
			jsonArrayCategory.add(data.getCategory());
			jsonArraySeries.add(data.getSeries());
		});
		jsonObject.add("categories", jsonArrayCategory);
		jsonObject.add("series", jsonArraySeries);
		return jsonObject.toString();*/
		if(FetchSystemInfo.queue.size()>0) {
			return FetchSystemInfo.queue.remove();
		}else{
			return "0";
		}

	}

	private List<Data> getDataDAO() {

		System.out.println("Random value of type double between "+min+" to "+max+ ":");
		Double a = Math.random()*(max-min+1)+min;
		System.out.println(a);

		Data data1 = new Data();
		data1.setId(10);
		data1.setCategory(sdfDate.format(new Date()));
		data1.setSeries(a);
		dataList.add(data1);

		return dataList;
	}

	@RequestMapping("/multiplelinechartdata")
	public ResponseEntity<?> getDataForMultipleLine() {
		/*List<MultipleData> dataList = multipleDataDAO.findAll();
		Map<String, List<MultipleData>> mappedData = new HashMap<>();
		for(MultipleData data : dataList) {
			
			if(mappedData.containsKey(data.getName())) {
				mappedData.get(data.getName()).add(data);
			}else {
				List<MultipleData> tempList = new ArrayList<MultipleData>();
				tempList.add(data);
				mappedData.put(data.getName(), tempList);
			}
			
		}
		return new ResponseEntity<>(mappedData, HttpStatus.OK);*/
		return null;
	}
	
	@RequestMapping("/piechartdata")
	public ResponseEntity<?> getDataForPiechart(){
		/*List<PiechartData> piechartData = piechartDAO.findAll();
		return new ResponseEntity<>(piechartData, HttpStatus.OK);*/
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
