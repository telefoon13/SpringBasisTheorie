package be.vdab.classes;

import be.vdab.interfaces.InterfaceB;

public class ClassB implements InterfaceB {

	private final String telefoonNrHelpDesk;
	private final int aantalPogingenUpdateKlant;

	public ClassB(String telefoonNrHelpDesk, int aantalPogingenUpdateKlant) {
		this.telefoonNrHelpDesk = telefoonNrHelpDesk;
		this.aantalPogingenUpdateKlant = aantalPogingenUpdateKlant;
	}

	public String getTelefoonNrHelpDesk() {
		return telefoonNrHelpDesk;
	}

	public int getAantalPogingenUpdateKlant() {
		return aantalPogingenUpdateKlant;
	}


	@Override
	public String getBoodschap(){
		return "Class B object";
	}

}
