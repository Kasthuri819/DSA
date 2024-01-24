class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n=nums.length,count0=0,count1=0;
        int element1=Integer.MIN_VALUE,element2=Integer.MIN_VALUE;
        int min=(n/3)+1;
        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<n;i++)
        {
            if(count0==0 && element2!=nums[i])
            {
                count0=1;
                element1=nums[i];
            }
            else if(count1==0 && element1!=nums[i])
            {
                count1=1;
                element2=nums[i];
            }
            else if(element1==nums[i])
            {
                count0++;
            }
            else if(element2==nums[i])
            {
                count1++;
            }
            else 
            {
                count0--;
                count1--;
            }
        }

        count0=0;count1=0;

        for(int i=0;i<n;i++)
        {
            if(element1==nums[i])
            {
                count0++;
            }
            if(element2==nums[i])
            {
                count1++;
            }
        }

        if(count0>=min)
        {
            list.add(element1);

        }
        if(count1>=min)
        {
            list.add(element2);
        }

        return list;        
    }
}