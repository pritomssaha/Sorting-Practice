

public class Main{
	public static void main(String[] args) {
		int[] nums={1, 0, 1, 0, 1, 0, 0, 1};
		//count #of 0s
		int count_0 = 0;
		int count_1 = 0;
		for(int i=0;i<nums.length;i++){
		    if(nums[i]==0)
		        count_0++;
		    if(nums[i]==1)
		        count_1++;
		}
		System.out.println(count_1);
		
		System.out.println(count_0);
		
		int k=0;
		while(count_0>0){
		    nums[k]=0;
		    k++;
		    count_0--;
		}
		
		while(count_1>0){
		    nums[k]=1;
		    k++;
		    count_1--;
		}
		
    	for(int i:nums)
    	    System.out.print(i+" ");
		
	}
}
