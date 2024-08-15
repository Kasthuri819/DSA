class Solution {
    public int rob(int[] nums) {
        
        int n=nums.length;

        if(n==1) return nums[0];

        return solver(n,nums);
    }

    private static int solver(int n, int[] a) {
		
		int temp1[]=new int[n-1],temp2[]=new int[n-1];
		
		
		for(int i=0;i<n;i++)
		{
			if(i!=0)
				temp1[i-1]=a[i];
			if(i!=n-1)
				temp2[i]=a[i];
		}
		
		int result1,result2;
		
		result1=houseRobber(temp1.length,temp1);
		result2=houseRobber(temp2.length,temp2);
		
		return Math.max(result1, result2);
	}

	private static int houseRobber(int n, int[] arr) {
		
		int prev1=arr[0],prev2=0,curr=Integer.MIN_VALUE;
		
		for(int i=1;i<n;i++)
		{
			int notTake=prev1;
			int take=arr[i];
			
			if(i>1)
				take+=prev2;
			
			curr=Math.max(notTake, take);
			prev2=prev1;
			prev1=curr;
		}
		
		return prev1;
	}
}