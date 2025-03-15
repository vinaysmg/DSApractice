//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target >= letters[letters.length-1])
            return letters[0];
        
        int left = 0;
        int right = letters.length-1;
        int mid = 0;

        while(left <= right){
            mid = left + (right - left) / 2;
            if(letters[mid] > target){
                right = mid - 1;
            } else if(letters[mid] <= target){
                left = mid + 1;
            }
        }
        return letters[left];
    }
}
