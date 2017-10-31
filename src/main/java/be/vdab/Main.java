package be.vdab;

import be.vdab.gaming.GamingConfig;
import be.vdab.gaming.Spelletje;
import be.vdab.restclients.RestClientsConfig;
import be.vdab.services.EuroService;
import be.vdab.services.ServicesConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

class Main {
	public static void main(String[] args){
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServicesConfig.class, RestClientsConfig.class, GamingConfig.class)){

//			ClassA objectA = context.getBean(ClassA.class);
//			System.out.print(
//					objectA.getKoersenURL() +
//					"\n" +
//					objectA.getDefaultTaalEnLand().getDisplayName() +
//					"\n" +
//					"Bestand bestaat : " + objectA.getImportData().exists() +
//					"\n" +
//					objectA.getDefaultBladRichting() +
//					"\n" +
//					objectA.getEmailAdres() +
//					"\n" +
//					objectA.getWebsiteGestart() +
//					"\n"
//			);
//
//			ClassB objectB = context.getBean(ClassB.class);
//			System.out.print(
//					objectB.getTelefoonNrHelpDesk() +
//							"\t Aantal : " +
//					objectB.getAantalPogingenUpdateKlant() +
//							"\n"
//			);
//
//			System.out.println(context.getBean(HelpDeskMedewerkers.class));
//
//			context.getBean("teller1", Teller.class).verhoog();
//			context.getBean("teller1", Teller.class).verhoog();
//			Teller teller2 = context.getBean("teller2",Teller.class);
//			teller2.verhoog();
//			context.getBean("teller2",Teller.class).verhoog();

			//System.out.println(context.getBean(EuroService.class).naarDollar(BigDecimal.valueOf(2)));

			System.out.println(context.getBean(Spelletje.class).getAantalVijanden());
		}
	}
}
