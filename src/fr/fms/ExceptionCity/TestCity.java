package fr.fms.ExceptionCity;

public class TestCity {

	public static void main(String[] args) {
		
		City toulouse = new City("Toulouse","France",450000);
		System.out.println(toulouse);
		
		try {
		toulouse.setNbInhabitants(-150);}
		catch (Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(toulouse);
	}

}
