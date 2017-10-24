package be.vdab.restclients;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Scanner;

public class YahooKoersenClient implements KoersenClient {

	private final URL url;

	public YahooKoersenClient(URL url) {
		this.url = url;
	}

	@Override
	public BigDecimal getDollarKoers(){
		try (Scanner scanner = new Scanner(url.openStream())){
			return new BigDecimal(scanner.nextLine());
		} catch (Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
}
