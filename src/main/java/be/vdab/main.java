package be.vdab;

import be.vdab.classes.ClassA;
import be.vdab.classes.ClassB;
import be.vdab.classes.HelpDeskMedewerkers;
import be.vdab.classes.Teller;
import be.vdab.services.EuroService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class main {
	public static void main(String[] args){
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("restclients.xml","services.xml","container.xml")){

			ClassA objectA = context.getBean(ClassA.class);
			System.out.print(
					objectA.getKoersenURL() +
					"\n" +
					objectA.getDefaultTaalEnLand().getDisplayName() +
					"\n" +
					"Bestand bestaat : " + objectA.getImportData().exists() +
					"\n" +
					objectA.getDefaultBladRichting() +
					"\n" +
					objectA.getEmailAdres() +
					"\n" +
					objectA.getWebsiteGestart() +
					"\n"
			);

			ClassB objectB = context.getBean(ClassB.class);
			System.out.print(
					objectB.getTelefoonNrHelpDesk() +
							"\t Aantal : " +
					objectB.getAantalPogingenUpdateKlant() +
							"\n"
			);

			System.out.println(context.getBean(HelpDeskMedewerkers.class));

			context.getBean("teller1", Teller.class).verhoog();
			context.getBean("teller1", Teller.class).verhoog();
			Teller teller2 = context.getBean("teller2",Teller.class);
			teller2.verhoog();
			context.getBean("teller2",Teller.class).verhoog();

			System.out.println(context.getBean(EuroService.class).naarDollar(BigDecimal.valueOf(2)));
		}
	}
}
