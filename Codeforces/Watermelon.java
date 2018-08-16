import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n%2==0 && n!=2) System.out.print("YES");
		else System.out.print("NO");
	}

}
