class Solution {
    public List<List<Integer>> generate(int numRows) {

        int ans=1;
        List<List<Integer>> result=new ArrayList<>();

        for(int row=1;row<=numRows;row++)
        {
            result.add(generateRows(row));
        }

        return result;        
    }

    static ArrayList<Integer> generateRows(int row)
    {
        long res=1;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);

        for(int col=1;col<row;col++)
        {
            res=res*(row-col);
            res=res/col;
            ans.add((int)res);
        }

        return ans;
    }
}