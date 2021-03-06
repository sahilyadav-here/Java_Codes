import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SHKSTR {
	 static int LCSubStr(char X[], char Y[], int m, int n) 
	    {
	        int LCStuff[][] = new int[m + 1][n + 1];
	        int result = 0; 
	        for (int i = 0; i <= m; i++) 
	        {
	            for (int j = 0; j <= n; j++) 
	            {
	                if (i == 0 || j == 0)
	                    LCStuff[i][j] = 0;
	                else if (X[i - 1] == Y[j - 1])
	                {
	                    LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
	                    result = Integer.max(result, LCStuff[i][j]);
	                } 
	                else
	                    LCStuff[i][j] = 0;
	            }
	        }
	        return result;
	    }

		// TODO Auto-generated method stub
		public static void main(String[] args)throws IOException{

			Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		String arr[]=new String[n];
		for(int j=0;j<n;j++){
			arr[j]=sc.next();
	}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int q=sc.nextInt();
		for(int j=0;j<q;j++) {
			int q2=sc.nextInt();
			String x=sc.next();
			int max_len=-1;
			char[] xx=x.toCharArray();
			int y=xx.length;
			for(int i=0;i<q2;i++ ) {
			int r=	LCSubStr(arr[i].toCharArray(),xx,arr[i].toCharArray().length,y);
			if(r>max_len) {
				max_len=r;
			}
			if(max_len==y) {
				System.out.println(arr[i]);
			}
			else {
				
				
			}
			}
			
		}
	}

}
