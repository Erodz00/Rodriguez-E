import java.util.Scanner;

public class Theatre_Square {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextInt(),m = scan.nextInt(), a = scan.nextInt();
		System.out.println((long)(Math.ceil(n / a) * Math.ceil(m / a)));
	}
}
