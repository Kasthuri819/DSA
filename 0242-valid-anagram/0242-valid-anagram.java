class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> map=new HashMap<Character,Integer>();

        if(s.length()!=t.length())
        {
            return false;
        }

        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int j=0;j<t.length();j++)
        {
            map.put(t.charAt(j),map.getOrDefault(t.charAt(j),0)-1);
        }

        for(int value:map.values())
        {
            if(value!=0)
                return false;
        }

        return true;       
        
    }
}