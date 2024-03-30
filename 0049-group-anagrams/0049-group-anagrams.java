class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> groupingAnagrams=new HashMap<>();
        for(String word:strs)
        {
            char wordCharArray[]=word.toCharArray();
            Arrays.sort(wordCharArray);
            String sortedArray=new String(wordCharArray);

            groupingAnagrams.putIfAbsent(sortedArray,new ArrayList<>());

            groupingAnagrams.get(sortedArray).add(word);

        }

        return new ArrayList<>(groupingAnagrams.values());
        
    }
}