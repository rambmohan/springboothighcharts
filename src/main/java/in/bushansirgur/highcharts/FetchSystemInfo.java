package in.bushansirgur.highcharts;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.sun.management.OperatingSystemMXBean;
import in.bushansirgur.highcharts.model.Data;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.lang.management.ManagementFactory;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class FetchSystemInfo {

    public static Queue<String> queue = new LinkedList<>();

    List<Data> dataList = new ArrayList<>();

    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy

    /*int max = 100;
    int min = 1;
    int range = max - min + 1;*/

    @Scheduled(fixedRate = 3000)
    public void fetchSystemInfo(){
        System.out.println("##### fetchSystemInfo #######");

        //if(queue.size()<=10) {

            List<Data> dataList = getDataDAO();
            JsonArray jsonArrayCategory = new JsonArray();
            JsonArray jsonArraySeries = new JsonArray();
            JsonObject jsonObject = new JsonObject();
            dataList.forEach(data->{
                jsonArrayCategory.add(data.getCategory());
                jsonArraySeries.add(data.getSeries());
            });
            jsonObject.add("categories", jsonArrayCategory);
            jsonObject.add("series", jsonArraySeries);

            queue.add(jsonObject.toString());
        //}
        System.out.println("Queue Size="+queue.size());
    }

    private List<Data> getDataDAO() {

        OperatingSystemMXBean bean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        //System.out.println("Name="+bean.getName());
        //System.out.println("Process="+bean.getAvailableProcessors());
        //System.out.println("arch="+bean.getArch());
        //System.out.println("version="+bean.getVersion());
        System.out.println("System load Avg="+bean.getSystemLoadAverage());

        //OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        //System.out.println((osBean.getSystemCpuLoad() * 100) + "%");

        //int rand = (int)(Math.random() * range) + min;
        Double cpuAvg = (bean.getSystemLoadAverage()*100);
        System.out.println("cpuAvg="+cpuAvg.intValue());

        //System.out.println("Random value of type double between "+min+" to "+max+ ":");
        //Double a = Math.random()*(max-min+1)+min;
        //System.out.println(a);

        Data data = new Data();
        data.setId(10);
        data.setCategory(sdfDate.format(new Date()));
        data.setSeries(cpuAvg);
        dataList.add(data);

        return dataList;
    }
}
