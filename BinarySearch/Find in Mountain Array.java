//https://leetcode.com/problems/find-in-mountain-array/description/
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int peakIndex(MountainArray arr){
        int start = 0;
        int end = arr.length()-1;
        int mid = 0;
        while(start < end){
            mid = start + (end - start)/2;
            if(arr.get(mid) > arr.get(mid+1))
                end = mid;
            else
                start = mid + 1;
        }
        return end;
    }

    public int findTargetElementIndex(int target, MountainArray arr,int startIndex, int endIndex){
        boolean isAsc = arr.get(startIndex) < arr.get(endIndex);
        int start = startIndex;
        int end = endIndex;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(target == arr.get(mid))
                return mid;
            if(target > arr.get(mid)){
                if(isAsc)
                    start = mid + 1;
                else
                    end = mid -1;
            }
            else{
                if(isAsc)
                    end = mid -1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = peakIndex(mountainArr);
        int ascArrIndex = findTargetElementIndex(target, mountainArr, 0, peakIndex);
        int dscArrIndex = findTargetElementIndex(target, mountainArr, peakIndex+1, mountainArr.length()-1);
        if(ascArrIndex == -1 && dscArrIndex == -1)
            return -1;
        if(ascArrIndex > -1 && dscArrIndex > -1)
            return ascArrIndex < dscArrIndex ? ascArrIndex : dscArrIndex;
        if(ascArrIndex == -1)
            return dscArrIndex;
        else
            return ascArrIndex;
    }
}
