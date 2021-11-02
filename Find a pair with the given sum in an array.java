
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] nums={8, 7, 2, 5, 3, 1};
		int target=10;
		
		//O(n) spaceo(n)
		HashMap<Integer, Integer> lookup=new HashMap<>();
		for(int i=0;i<nums.length;i++){
		    int compliment=target-nums[i];
		    if(lookup.containsKey(compliment)){
		        System.out.println("Pair found  "+nums[i]+" "+nums[lookup.get(compliment)]);
		       break;
		    }
		    else
		        lookup.put(nums[i],i);
		    
		}
		Arrays.sort(nums);
		int low=0;
		int high=nums.length-1;
		while(low<high){
		    if(nums[low]+nums[high]==target){
		        System.out.println("Pair found  "+nums[low]+" "+nums[high]);
		        return;
		    }
		    else if (nums[low]+nums[high]<target)
		        low++;
		    else
		        high--;
		       
		        
		}
	}
}
