class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        List list = new ArrayList<Character>();
        List list2 = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
            list2.add(t.charAt(i));
        }
        Collections.sort(list);
        Collections.sort(list2);
        if(list.equals(list2))
            return true;
        return false;
    }
}