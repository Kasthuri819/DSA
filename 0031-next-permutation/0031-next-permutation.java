class Solution {
    public void nextPermutation(int[] nums) {

        int n=nums.length,index=-1;

        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }

        if(index == -1)
        {
            swap(nums,0,n-1);
            return;
        }

        for(int j=n-1;j>index;j--)
        {
            if(nums[j]>nums[index])
            {
                int temp=nums[j];
                nums[j]=nums[index];
                nums[index]=temp;
                break;
            }
        }

        swap(nums,index+1,n-1);
    }

    static void swap(int arr[],int start,int end)
    {
        while(start < end)
        {
            int tempVal=arr[start];
            arr[start]=arr[end];
            arr[end]=tempVal;
            start++;
            end--;
        }
    }
}