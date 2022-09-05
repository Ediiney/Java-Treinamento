import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < N; i++) {

			int X = scan.nextInt();

			if (X >= 10 && X <= 20) {

				in += 1;

			} else {
				out += 1;
			}

		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
	}

}
