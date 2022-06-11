class Solution {
    public int maximum69Number (int num) {
        String sNum = String.valueOf(num);
        char[] numArr = sNum.toCharArray();
        int flag=0;
        
        for(int i=0;i<numArr.length;i++) {
            if(numArr[i]=='6' && flag==0) {
                numArr[i] = '9';
                flag=1;
            }
        }
        
        sNum = String.valueOf(numArr);
        return Integer.parseInt(sNum);
    }
}