class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        //Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i=0;i<s.length();i++) {
            arr[s.charAt(i)-'a']++;
        }
       
        int ind=s.length();
        for (int j=0;j<26;j++) {
            if (arr[j]==1 && s.indexOf(j+'a')<=ind) {
                ind = s.indexOf(j+'a');
            }
        }
        //System.out.println(ind);
        return ind==s.length()?-1:ind;
    }
}
