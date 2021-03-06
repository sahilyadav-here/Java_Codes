
import java.util.Scanner;

public class sah {
 
    public static int findPattern(int[] input, int n, int[] lisLength, int[] ldsLength) {
         
        if(input == null || input.length == 0) {
            return 0;
        }
        
        int maxLength = 1;

        lisLength[0] = 1;
        int i =1;
        int j =1;
        while(i < n) {
            lisLength[i] = 1;
            j = 0;
            while(j < i) {
                if (!(input[i] > input[j] && lisLength[i] < lisLength[j] + 1)) {
                }
                else{
                    lisLength[i] = lisLength[j] + 1;
                }
                j++;
            }
            i++;
        }
 
        ldsLength[n-1] = 1;
        i =n-2;
        while( i >= 0) {
            ldsLength[i] = 1;
            j =n-1;
            while( j > i) {
                if (!(input[i] > input[j] && ldsLength[i] < ldsLength[j] + 1)) {
                }
                else{
                    ldsLength[i] = ldsLength[j] + 1;
                }
                j--;
            }
            i--;
        }

        i =1;
        while( i < n) {
            if (maxLength < lisLength[i] + ldsLength[i] - 1){
                maxLength = lisLength[i] + ldsLength[i] - 1;
            }

            i++;
        }
 
        return maxLength;
    }
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int days = sc.nextInt();
    	int[] array = new int[days];
    	for(int i =0;i<days;i++){
    		array[i] = sc.nextInt();
    	}
        int[] lisLength = new int[days];
        int[] ldsLength = new int[days];
        System.out.println(findPattern(array,days,lisLength,ldsLength));
    }
}