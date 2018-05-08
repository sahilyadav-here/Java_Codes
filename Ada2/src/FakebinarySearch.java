import java.util.Arrays;
import java.util.Scanner;

public class FakebinarySearch {
	static int binarySearch(int arr[], int n ,int x)
    {
		int low, high, mid=0;
	    low =0;
	    high = n-1;
        while (high>=low)
        {
             mid = (low + high) / 2;
             if( arr[mid] == x) {
                 break;
                 }
             else if (arr[mid] < x){
                 low = mid+1;
                 }
             else {
                 high = mid-1;
             }
        }
         return mid;
             
        }
	static int search(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
  
        return -1;
    }
	static int performswaps(int[] arr,int n,int y,int index_y){
		int low, high, mid=0;
	    low =0;
	    high = n-1;
	    int count=0;
	    while (high>=low)
        {
             mid = (low + high) / 2;
             if(arr[mid]==y) {
            	break;
             }
             else if(arr[mid]>y && index_y<mid) {
            	 int temp=arr[mid];
            	 if(findsmallest(arr,y)==-1) {
            		 return -1;
            	 }else {arr[mid]=arr[findsmallest(arr,y)];
            	 arr[findsmallest(arr,y)]=temp;
            	 count++;
            	 low=mid+1;}
             }
             else if(arr[mid]>y && index_y>mid) {
            	 low=mid+1;
             }
             else if(arr[mid]<y && index_y<mid) {
            	high=mid-1; 
             }
             else if(arr[mid]<y && index_y>mid) {
            	 int temp=arr[mid];
            	 if(findlargest(arr,y)==-1) {
            		 return -1;
            	 }else {  
            		 arr[mid]=arr[findlargest(arr,y)];
            	 
            	 arr[findlargest(arr,y)]=temp;
            	 count++;
            	 high=mid-1;
            	 }
             }
             
        }
		return count;
	}
    public static int findsmallest(int [] arr,int x) {
    	int c=0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]<x) {
    			c=i;
    			break;
    		}
    		if(i==arr.length-1) {
    			c=-1;
    		}
    	}
		return c;
    	
    }
    public static int findlargest(int [] arr,int x) {
    	int c=0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>x) {
    			c=i;
    			break;
    		}
    		if(i==arr.length-1) {
    			c=-1;
    		}
    	}
		return c;
    	
    }
	public static void main(String args[]) {

		int arr[]= {3,1,6,7,2,5,4};
		int x=binarySearch(arr,arr.length,3);
		System.out.println(x);
		
		int y=search(arr,arr.length,3);
		System.out.println("y is "+y);
		
		int z=performswaps(arr,arr.length,3,y);
		System.out.println("swaps are "+ z);
		
	}
}