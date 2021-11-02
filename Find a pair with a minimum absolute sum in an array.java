
import java.util.*;
public class Main{
	public static void main(String[] args) {
		int[] nums={-6, -5, -3, 0, 2, 4, 9};
		
		int n=nums.length;
		
		int low=0;
		int high=n-1;
		int i=0, j=0;
		Arrays.sort(nums);
		int min=Integer.MAX_VALUE;
		while(low<high){
		    if (min>Math.abs(nums[low]+nums[high])){
		        min=Math.abs(nums[low]+nums[high]);
		         i=low;
		         j=high;
		    }
		    if(min==0)
		        break;
		    if(nums[low]+nums[high]>0)
		        high--;
		    else
		        low++;
		  
		    
		}
		System.out.println(nums[i]+" "+nums[j]);
	
	
	}
}
