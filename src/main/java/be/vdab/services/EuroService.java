package be.vdab.services;

import be.vdab.restclients.KoersenClient;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class EuroService {

	private final KoersenClient koersenClient;

	public EuroService( KoersenClient koersenClient) {
		this.koersenClient = koersenClient;
	}


	public BigDecimal naarDollar(BigDecimal euro){
		return euro.multiply(koersenClient.getDollarKoers()).setScale(2, RoundingMode.HALF_UP);
	}
}
