import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter time = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
		System.out.println("Début du programme le " + time.format(LocalDateTime.now()));
		
		
		Dessin dessin = new Dessin();
		System.out.println(FigureUtil.genere(10));
		
		
		
	
		
		
		System.out.println("Fin du programme le " + time.format(LocalDateTime.of(2019, 12, 25, 12, 30)));
	      
	   }
	
	
	

}
