package be.vdab.gaming;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:spelletje.properties")
public class GamingConfig {

	@Bean
	Spelletje spelletje(@Value("#{${minAantalVijanden} + new java.util.Random().nextInt(4)}")int aantalvijanden){
		return new Spelletje(aantalvijanden);
	}
}
