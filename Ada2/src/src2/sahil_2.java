package src2;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class sahil_2 {

	

    public static void main (String[] args) throws IOException
    {

        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
       n= n.add(new BigInteger("1"));
        int k = sc.nextInt();
        while(true)
        {
            String s = n.toString(2);
            int pos = -1,count1=0,count0=0;
            int i=0;
            while(i<s.length()) {
            	if(s.charAt(s.length()-i-1)=='0')
                {
                    count0++;
                    
                }	
            
            else if(s.charAt(s.length()-i-1)=='1')
                {
                    count1++;
                    if(pos==-1)
                        pos=i;
                }
             i++;
            }
            
             if(k-count1>0 && k-count1<=pos)
            {
                BigInteger a = new BigInteger("0");
                i=0;
                while( i<k-count1)
                {
                	BigInteger o=a.multiply(new BigInteger("2"));
                    a = o.add(BigInteger.ONE);
                    i++;
                }
                n = n.add(a);
                System.out.println(n);
                break;

            }
             else if(count1==k)
             {
                 System.out.println(n);
                 break;
             }
            else
            {
                n = n.add(BigInteger.valueOf((long)Math.pow(2,pos)));
            }

        }
    }
}
