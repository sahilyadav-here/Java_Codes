import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class XorPAirs {
	
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			
				int limit = sc.nextInt();
				int T = sc.nextInt();
				Long arr[] = new Long[limit];
				for (int i = 0; i < limit; i++) {
					arr[i] = sc.nextLong();
				
				}
				//System.out.println(Arrays.toString(arr));
				//int c=countXorPair(arr,arr.length,T);
				
				//System.out.println(c);
			
		} catch (Exception e) {
			return;
		}
}
	public static long xoring(long xor,long c){
		return (xor^c);
		}
	/*private static int countXorPair(Long[] arr, int length, int t) {
		int count=0;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(xoring(arr[i],arr[j])>=t) {
					count++;
				}
			}
		}
		return count;
	}*/
	

	
}
