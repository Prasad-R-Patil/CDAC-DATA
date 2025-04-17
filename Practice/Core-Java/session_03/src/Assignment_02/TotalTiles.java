package Assignment_02;
import java.util.Scanner;

public class TotalTiles {
	
	private float ToTiles;
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length of Tile");
		
		float lw=s.nextFloat();
		
		Tile tl=new Tile(lw);
		
		
		System.out.println("Enter Length of Floor :->");
		
		float le=s.nextFloat();
		
		System.out.println("Enter Width of Floor :->");
		
		float wi=s.nextFloat();
		
		Floor fr=new Floor(le,wi);
		
		fr.TotalTiles(tl);
		
		
		
		
	}
	

}
