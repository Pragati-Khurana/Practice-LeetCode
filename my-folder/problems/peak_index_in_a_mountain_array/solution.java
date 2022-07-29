class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0, h=arr.length-1, mid=0;
        
        while(l<=h) {
            mid = (l+h)/2;
            if(mid>0 && mid<arr.length-1 && arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]) {
                return mid;
            }
            else if(mid<arr.length-1 && arr[mid+1]>arr[mid])
                l = mid + 1;
            else if(mid>0 && arr[mid-1]>arr[mid])
                h = mid - 1;
        }
        return mid;
    }
}