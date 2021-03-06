import java.io.*;
import java.util.*;

public class BinShuffle {
private static void check( long a, long b,long s_a,long s_b) {
	long d = s_b - s_a + 1 ;  
    if (a==b){ 
        System.out.println(0);
        
    }
    else if(a>0 && b==1) {
    	System.out.println(-1);
    }
    else if (b==0 && a>0){
        System.out.println(-1);
        
    }
    else if (a==1 && b==0){
        System.out.println(1);
        
    }
    
   else{
    	
  
        if (d <= 0){
            System.out.println(2);
        }
        else {
            System.out.println(d);
        }
    }
}

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			Reader.init(System.in);
			int T=Reader.nextInt();
			
			for(int i=0;i<T;i++) {
				long s_a=0;long s_b=0;
				long a=Reader.nextLong();
				long b=Reader.nextLong();
				
			
				String arr[] = new String[2];
				arr[0]= Long.toBinaryString(a);
				arr[1]= Long.toBinaryString(b-1);
				
				 for (int j=0;j<arr[1].length();j++){
		                if(arr[1].charAt(j)=='1'){
		                    s_b++;
		                }
		            }
				
	            for (int k=0;k<arr[0].length();k++){
	                if(arr[0].charAt(k)=='1'){
	                    s_a++;
	                }
	            }
	           
	            
	         check(a,b,s_a,s_b);
				
			}
	
}
}

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
        	
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}