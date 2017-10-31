package be.vdab.services;

import be.vdab.restclients.DummyKoersenClient;
import be.vdab.restclients.KoersenClient;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class EuroServiceTest {

	private EuroService euroService;

	@Before
	public void setUp() throws Exception {
		KoersenClient koersenClient = new DummyKoersenClient();
		euroService = new EuroService(koersenClient);
	}

	@Test
	public void naarDollar() throws Exception {
	assertEquals(0, BigDecimal.valueOf(3).compareTo(euroService.naarDollar(BigDecimal.valueOf(2))));
	}

}