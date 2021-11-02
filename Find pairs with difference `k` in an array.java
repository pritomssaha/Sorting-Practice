
import java.util.*;
public class Main{
	public static void main(String[] args) {
		int[] nums={1, 5, 2, 5, 5, 4};
		int diff=3;
		HashMap<Integer, Integer> lookup=new HashMap<>();
		for(int i=0;i<nums.length;i++){
		    if( lookup.containsKey(nums[i]+diff)){
		        System.out.println("pair found "+nums[i]+" "+nums[lookup.get(nums[i]+diff)]);
		        
		    }
		    else if (lookup.containsKey(nums[i]-diff)){
		        System.out.println("pair found "+nums[i]+" "+nums[lookup.get(nums[i]-diff)]);
		       }
		    else
		        lookup.put(nums[i],i);
		    
		}
		
		
	}
}
