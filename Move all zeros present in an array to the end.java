
import java.util.*;
public class Main{
	public static void main(String[] args) {
		int[] nums={6, 0, 8, 2, 3, 0, 4, 0, 1 };
		int k=0;
		for (int i=0;i<nums.length;i++){
		    if(nums[i]!=0){
		        nums[k]=nums[i];
		        k++;
		    }
		        
		}
		for(int i=k;i<nums.length;i++){
		    nums[k]=0;
		    k++;
		}
		
		
		for(int i=0;i<nums.length;i++){
		    System.out.print(nums[i]+" ");
		    
		}
		
	}
}
