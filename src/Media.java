import java.util.Locale;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}

	}

}
