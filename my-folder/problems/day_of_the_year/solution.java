class Solution {
    public int dayOfYear(String date) {
        String str[] = date.split("-");
        int m = Integer.parseInt(str[1]);
        int y = Integer.parseInt(str[0]);
        int totDays = Integer.parseInt(str[2]);
        
        for(int i=1;i<m;i++) {
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
                totDays += 31;
            }
            else if(i==4 || i==6 || i==9 || i==11) {
                totDays += 30;
            }
            else if(i==2) {
                if(y%400==0)
                    totDays += 29;
                else if(y%100==0)
                    totDays += 28;
                else if(y%4==0)
                    totDays += 29;
                else
                    totDays += 28;
            }
        }
            
        
        return totDays;      
    }
}