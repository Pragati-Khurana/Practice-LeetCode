class Solution {
    public boolean rotateString(String s, String goal) {
        String rs = s;
        for(int i=0; i<s.length(); i++) {
            rs = rs.substring(1,s.length()) + rs.charAt(0);
            if(goal.equals(rs))
                return true;
        }
        return false;
    }
}