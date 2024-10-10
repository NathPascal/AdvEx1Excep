package fr.fms.ExceptionCity;

public class ExceptionPopulation extends Exception{
	private static final long serialVersionUID = 1L;
	
	public ExceptionPopulation(String msg) {
		super(msg);
	}
	
	public ExceptionPopulation() {
		super("Il y a un problème démographique");
	}
}
