package be.vdab.classes;

class Teller {

	private int teller;

	public  Teller(){
		System.out.println("Teller constructor : " + teller);
	}

	public void verhoog(){
		++teller;
		System.out.println("Teller verhoogd naar : " + teller);
	}
}
