class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            Character ch1=s.charAt(i);
            arr[ch1-'a']++;

            Character ch2=t.charAt(i);
            arr[ch2-'a']--;
        }    
        
        for(int value:arr){
            if(value!=0)
            return false;
        }
        
        return true;
    }
}
