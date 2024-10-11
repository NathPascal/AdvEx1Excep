package fr.fms.ExceptionCity;

//exception personnalisée pour signaler des erreurs spécifiques liées à la population 

public class ExceptionPopulation extends Exception{
	private static final long serialVersionUID = 1L;
	
	public ExceptionPopulation(String msg) {
		super(msg);
	}
	
	public ExceptionPopulation() {
		super("Il y a un problème démographique");
	}
}
