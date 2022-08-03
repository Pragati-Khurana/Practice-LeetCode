class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int res[] = new int[2];
        int l=0, h=numbers.length-1, mid;
        
        while(l <= h) {
            mid = h + (l-h)/2;
            int sum = numbers[l] + numbers[h];
            if(target == sum)
                return new int[] {l+1, h+1};
            else if(target > sum) {
                if(numbers[mid] + numbers[h] < target)
                    l = mid+1;
                else
                    l++;
            }
            else {
                if(numbers[mid] + numbers[l] > target)
                    h = mid-1;
                else
                    h--;
            }
        }
        return new int[] {-1, -1};
    }
}