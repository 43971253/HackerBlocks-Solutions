import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();

			nextLarger(arr);

			t--;
		}

	}

	// Function to print Next Greater Element for each element of the array
	public static void nextLarger(int[] arr) {

// Write Code here
int next, i, j;
		for (i = 0; i < arr.length; i++) {
			next = -1;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					next = arr[j];
					break;
				}
			}
			System.out.println(arr[i] + "," + next);

	}

	}
}
//4 out of 5 test cases are working :(
