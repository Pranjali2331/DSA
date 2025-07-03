class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("a");
        
        while (str.length() < k) {
            int currentLength = str.length();
            for (int i = 0; i < currentLength; i++) {
                char nextChar = (char)(str.charAt(i) + 1);
                str.append(nextChar);
                if (str.length() >= k) {
                    break;
                }
            }
        }
        
        return str.charAt(k - 1);  // k is 1-indexed, so subtract 1
    }
}