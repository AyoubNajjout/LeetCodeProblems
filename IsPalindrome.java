//Given an integer x, return true if x is a
//palindrome
//, and false otherwise.

//Example 1:

//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.

//Example 2:

//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

//Example 3:

//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


import java.util.Arrays;

class Solution2 {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String[] arr = new String[str.length()];
        String[] arr2 = new String[str.length()];

        for(int i=0;i<str.length();i++){
            arr[i] = str.substring(str.length() - i - 1  , str.length() - i);
        }
        for(int i=0;i<str.length();i++){
            arr2[i] = str.substring(i, i+1);
        }
        if(Arrays.equals(arr,arr2)){
            return true;
        }
        else return false;
    }
}