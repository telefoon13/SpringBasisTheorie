package be.vdab.services;

import be.vdab.restclients.ECBKoersenClient;
import be.vdab.restclients.KoersenClient;
import be.vdab.restclients.YahooKoersenClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ServicesConfig {


	@Bean
	EuroService euroService(@Qualifier("Yahoo") KoersenClient koersenClient){
		return new EuroService(koersenClient);
	}
}
