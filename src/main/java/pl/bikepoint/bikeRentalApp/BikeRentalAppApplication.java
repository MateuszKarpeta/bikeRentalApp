package pl.bikepoint.bikeRentalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
		/*(exclude = {
		DataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class,
		//HibernateJpaAutoConfiguration.class
})*/
		//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
// DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})

public class BikeRentalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikeRentalAppApplication.class, args);
	}

}