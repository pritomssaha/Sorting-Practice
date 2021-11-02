
import java.util.*;
public class Main{
	public static void main(String[] args) {
		int[] nums={-12, -3, 5, 6, -2};
		int n=nums.length;
		Arrays.sort(nums);
		if(nums[0]*nums[1]>nums[n-1]*nums[n-2]){
		    System.out.println("maximum product is "+nums[0]+" "+nums[1]);
		}
		else
		    System.out.println("maximum product is "+nums[n-1]+" "+nums[n-2]);
		
	}
}
