class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch1=s.charAt(i);
            map.put(ch1,map.getOrDefault(ch1,0)+1);

            Character ch2=t.charAt(i);
            map.put(ch2,map.getOrDefault(ch2,0)-1);
        }    
        
        for(int num:map.values()){
            if(num!=0)
            return false;
        }
        
        
        return true;
    }
}
