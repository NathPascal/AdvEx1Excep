import java.util.Date; //1.1

public class FoundException { 
	public static void main(String[] args){
		Date date = null;
		Date today = new Date();
		
		try {
		System.out.println(date.getClass().getName()); //date = null Cannot invoke "Object.getClass()"
			// appelle méthode getter class objet date et today (?)
		}
		
		catch(NullPointerException e){
			System.out.println("Pokémon exception capturée");
		}
		finally {
			System.out.println(today.getClass().getName()); // je l'ai déplacé sinon s'arrête à l'exception
		}
		
	}
}
