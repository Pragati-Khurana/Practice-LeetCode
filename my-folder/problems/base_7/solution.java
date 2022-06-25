class Solution {
    public String convertToBase7(int num) {
        int reminder = 0, ans = 0, multiplier = 1, flag = 0;
        if(num < 0) {
            num = Math.abs(num);
            flag = 1;
        }
        while(num>0) {
            reminder = num % 7;
            num = num / 7;
            ans = ans + reminder * multiplier;
            multiplier *= 10;
        }
        String res = String.valueOf(ans);
        if(flag==1) {
            res = '-'+res;
        }
        return res;
    }
}