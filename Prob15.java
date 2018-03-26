import java.util.Scanner;
import java.util.Stack;

public class Prob15 {

	public static towerStack pegA;
	public static towerStack pegB;
	public static towerStack pegC;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			int numDisks = scan.nextInt();
			System.out.println(numDisks);
			pegA = new towerStack("A");
			pegB = new towerStack("B");
			pegC = new towerStack("C");

			for (int j = 1; j <= numDisks; j++) {
				pegA.add(i);
			}
			solveTower(numDisks, pegA, pegB, pegC);
		}
	}

	private static void solveTower(int numDisks, towerStack fromPeg, towerStack middlePeg, towerStack toPeg) {
		if (numDisks >= 1) {
			solveTower(numDisks - 1, fromPeg, toPeg, middlePeg);
			toPeg.push(fromPeg.pop());
			System.out.println(fromPeg.label + "->" + toPeg.label);
			solveTower(numDisks - 1, middlePeg, fromPeg, toPeg);
		}
	}

	private static class towerStack extends Stack<Integer> {
		String label;
		public towerStack(String s) {
			this.label = s;
		}
	}
}
