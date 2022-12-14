/* Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than 
that, the numbers can be in any order. You may modify and return the given array, or make a new array.


evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
*/

public int[] evenOdd(int[] nums) {
  int arr [] = new int [nums.length];
  int i = 0;
  int j = 0;
  while(i<nums.length){
    if(nums[i]%2==0){
      arr[j]=nums[i];
      j++;
    }
    i++;
  }
  int x = 0;
  while(x<nums.length){
    if(nums[x]%2!=0){
      arr[j]=nums[x];
      j++;
    }
    x++;
  }
  return arr;
}
