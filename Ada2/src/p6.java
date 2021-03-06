import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p6 {
	
		 public static void main (String[] args) throws IOException
		    {
			 Reader.init(System.in);
			 int t=Reader.nextInt();
			 int[] arr=new int[t];
			 for(int i=0;i<t;i++) {
				 arr[i]=Reader.nextInt();
			 }int n=arr.length;
			
			    
			        int i, j;
			 
			        int[] lis = new int[n];  int[] lds = new int [n];
			        for (i = 0; i < n; i++) {
			            lis[i] = 1;
			            lds[i] = 1;}
			       
			 i=1;
			        while (i < n) {
			            for (j = 0; j < i; j++) {
			                if ( lis[i] < lis[j] + 1 && arr[j] < arr[i]  ) {
			                    lis[i] = lis[j] + 1;}
			                }i++;
			        }
			      
			 
			        i=n-2;
			        while ( i >= 0) {
			            for (j = n-1; j > i; j--) {
			                if (arr[i] > arr[j] && lds[i] < lds[j] + 1) {
			                    lds[i] = lds[j] + 1;}
			            }
			            i--;
			        }
			 
			        int max = lis[0] + lds[0] - 1;
			        i=1;
			        while ( i < n) {
			            if (lis[i] + lds[i] - 1 > max)
			                max = lis[i] + lds[i] - 1;
			 i++;}
			        System.out.println(max); ;
			    
			 
		    }
	

}
class Reader {
	static BufferedReader reader;
	static StringTokenizer tokenizer;

	/** call this method to initialize reader for InputStream */
	static void init(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}

	/** get next word */
	static String next() throws IOException {
		while (!tokenizer.hasMoreTokens()) {

			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
}
