import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {

			double X = scan.nextDouble();
			double Y = scan.nextDouble();
			double divisao = X / Y;

			if (Y == 0) {
				System.out.println("Divisao impossivel");
			} else {
				System.out.printf("%.1f%n", divisao);
			}

		}

	}

}
