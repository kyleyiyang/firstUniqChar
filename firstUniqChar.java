class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i=0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
       //System.out.println(map);
        for (char k:map.keySet()) {
            if (map.get(k)==1) {
                return s.indexOf(k);
            }
        }
        
        return -1;
    }
}
