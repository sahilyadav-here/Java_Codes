import java.math.BigInteger;
import java.util.*;
class Marker{
	int index_a;
	int index_b;
	public Marker(int index_a,int index_b) {
		this.index_a=index_a;
		this.index_b=index_b;
	}
	
}

public class FAKEBS {
	private static void check(int left_moves,int b_index ,int right_moves,int right) {
		if(left_moves>b_index ){
	    	System.out.println("-1");
	    }else if( right_moves>right) {
	    	System.out.println("-1");
	    }
	    else{
	    	System.out.println( Math.max(left_moves, right_moves) );
	    }
	}
 private static void makemoves(int[] arr2,ArrayList<Integer> arr,int x,int a,int b_index) {
		int low = 0;
	    int high = arr2.length-1;
	    int left=b_index;
	    int mid =0;
	    int right =arr2.length - b_index-1;
	    int left_moves = 0;
		int right_moves =0;
	    while(low <= high){
	    	mid = (low + high) / 2;
			        if(arr2[mid] ==x){
			            break;
			        }
			        else if(arr2[mid] > x  && a > mid){
			        	
			        	left_moves++;
			        	low = mid+1;
			        }
			        else if(arr2[mid] < x && a > mid){
			            low = mid+1;
			            left--;
			        }
			        
			        else if(arr2[mid] > x  && a < mid){
			            high = mid-1;
			            right--;
			            
			        }
			        else if(arr2[mid] < x && a < mid){
			        	right_moves++;
			        	high = mid-1;
			        }
			       
	    }
	    check(left_moves,left,right_moves,right);
	}
private static int Binarysearch(ArrayList<Integer> arr, int arr2) {
		
	    int low = 0;
	    int high = arr.size()-1;
	    int mid =0;
	    while(low <= high){
	    	mid = (low + high) / 2;
			        if(arr.get(mid) ==arr2){
			            break;
			        }
			        else if(arr.get(mid) >arr2){
			        	high = mid-1;
			            
			        }
			        else{
			        	low = mid+1;
			        }
	    }
	    return mid;
}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int u=0;
		
			while(u<T) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			
			HashMap<Integer,Marker> hashmap = new HashMap<Integer,Marker>();
			int arr2[] = new int[N];
			int i=0;
			while(i<N) {
				int v=sc.nextInt();
				arr.add(v ); 
				arr2[i]=v;
				i++;
			}
			Collections.sort(arr);
		for(int i1 =0;i1<N;i1++){
				int v=Binarysearch(arr,arr2[i1]);
				hashmap.put(arr2[i1], new Marker(i1, v));
			}
			int i1=0;
			
			while(i1<Q){
				int x = sc.nextInt();
				Marker a=hashmap.get(x);
				makemoves(arr2,arr,x,a.index_a,a.index_b);
			i1++;	
			}
		u++;
		}
	}

}
