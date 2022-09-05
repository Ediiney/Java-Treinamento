import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int number = scan.nextInt();
		int saida = 0; 
		
		while ( number != 0) {
			saida += number;
			number = scan.nextInt();
		} 
		
		System.out.println(saida);

			
		
			
	}

}
