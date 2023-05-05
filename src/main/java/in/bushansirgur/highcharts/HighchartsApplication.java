package in.bushansirgur.highcharts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HighchartsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HighchartsApplication.class, args);
	}

}
