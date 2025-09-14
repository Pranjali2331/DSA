class Solution {
    public boolean isAnagram(String s, String t) {
        s = sortstring(s);
        t = sortstring(t);
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0;i <s.length(); i++){
            
            if(s.charAt(i) != t.charAt(i)){
                return false;              
            }
        }
        return true;
    }
    public static String sortstring(String str){
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        return new String(letters);

    }
}