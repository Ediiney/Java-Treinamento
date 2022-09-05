import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int divisor = scan.nextInt();
			
			for (int i = 1; i <= divisor; i++) {
				if (divisor % i == 0) {
					System.out.println(i);
				}
			}
			
	}

}
