package be.vdab.restclients;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.net.URL;

@Configuration
@PropertySource("classpath:restclients.properties")
public class RestClientsConfig {

	//	@Bean
//	KoersenClient koersenClient(@Value("${ecbKoersenURL}")URL url){
//		return new ECBKoersenClient(url);
//	}

//	@Bean
//	KoersenClient koersenClient(
//			@Value("${yahooKoersenURL}")URL yahooURL,
//			@Value("${ecbKoersenURL}")URL ecbURL){
//		try(InputStream stream = yahooURL.openStream()){
//			return new YahooKoersenClient(yahooURL);
//		} catch (IOException ex){
//			return new ECBKoersenClient(ecbURL);
//		}
//	}

	@Bean
	@Qualifier("Yahoo")
	YahooKoersenClient yahooKoersenClient(@Value("${yahooKoersenURL}") URL url){
		return new YahooKoersenClient(url);
	}

	@Bean
	@Qualifier("ECB")
	ECBKoersenClient ecbKoersenClient(@Value("${ecbKoersenURL}") URL url){
		return new ECBKoersenClient(url);
	}


}
