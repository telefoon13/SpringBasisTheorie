package be.vdab.classes;

import java.util.Properties;

 class HelpDeskMedewerkers {

	private final Properties medewerkers;

	public HelpDeskMedewerkers(Properties medewerkers) {
		this.medewerkers = medewerkers;
	}

	public Properties getMedewerkers() {
		return medewerkers;
	}

	@Override
	public String toString() {
		return medewerkers.toString();
	}
}
