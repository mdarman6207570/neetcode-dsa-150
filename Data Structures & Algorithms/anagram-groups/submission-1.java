class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s:strs){
           char[] arr = s.toCharArray();
           Arrays.sort(arr);
           String sortedString = new String(arr);
           
           
           //map.putIfAbsent(sortedString,new ArrayList<>());
           //map.get(sortedString).add(s);

           
            // This replaces putIfAbsent and get
            map.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
