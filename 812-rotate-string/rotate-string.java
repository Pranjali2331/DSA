class Solution {
    public boolean rotateString(String s, String goal) {
        String conc = s + s;
        if(conc.contains(goal) && s.length() == goal.length()){
            return true;
        }else{
            return false;
        }
        
    }
}