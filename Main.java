import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt(), y = fs.nextInt(), z = fs.nextInt();
			System.out.println(x * 4 + y * 2);
		}
		fs.close();
	}
}
