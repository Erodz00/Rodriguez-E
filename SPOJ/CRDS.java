import java.util.Scanner;

public class Main {
	public static void main(String[] arguments)  {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long modNum = 1000007;
		for (int i = 0; i < n; i++) {
			long m = scan.nextLong();
			long tot = 3 * ((m * (m + 1)) / 2) - m;
			tot = tot % modNum;
			System.out.println(tot);
		}
		scan.close();
	}
}
