package Others;
import java.util.Scanner;

public class HNtower {
    public static Scanner in = new Scanner(System.in);
	static void towerOfHanoi(int n, char from, char to, char aux)
	{
		if (n == 0) {
			return;
		}
		towerOfHanoi(n - 1, from, aux, to);
		System.out.println("Disk " + n + " from "+ from + " to "+ to);
		towerOfHanoi(n - 1, aux, to, from);
	}

	public static void main(String args[])
	{
		int n = in.nextInt();
		towerOfHanoi(n, 'A', 'C', 'B');
	}
}

