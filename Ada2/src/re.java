import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class re {
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for (int j = 0; j < T; j++) {
				int limit = sc.nextInt();
				int arr[] = new int[limit];
				for (int i = 0; i < limit; i++) {
					arr[i] = sc.nextInt();
				}
				Integer[] arr_2 = dup(arr);
				System.out.println(gcdfind(arr_2, arr_2.length) );
			}
		} catch (Exception e) {
			return;
		}

	}

	public static Integer[] dup(int[] arr) {

		Arrays.sort(arr);
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] == arr[i - 1]) {
				// System.out.println("Duplicate: " + arr[i]);
				continue;
			} else {
				arr2.add(arr[i]);
			}
		}
		Integer[] arr_2 = new Integer[arr2.size()];
		arr_2 = arr2.toArray(arr_2);
		return arr_2;

	}

	static int gcd(int a, int b) {// by euclidean method
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static int gcdfind(Integer arr_2[], int n) {
		int count=0;
		//System.out.println(Arrays.toString(arr_2));
		int maxgcd = arr_2[0];
		if(arr_2[0]==0) {
			count++;
		}
		for (int i = 1; i < n; i++) {
			
			maxgcd = gcd(maxgcd, arr_2[i]);

			if (maxgcd == 1)
				//System.out.println("curr "+count);
				return (count+(arr_2.length-n));
		}

		return -1;
	}
}