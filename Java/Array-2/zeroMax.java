/*Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is
no odd value to the right of the zero, leave the zero as a zero.


zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
*/

public int[] zeroMax(int[] nums) {
  int maxOdd = 1;
  for(int i = 0; i<nums.length;i++){
    if(nums[i]==0){
      for(int j = i+1; j<nums.length; j++){
        if(nums[j]%2==0){
          continue;
        }
        if(nums[j]%2!=0 && nums[j]>maxOdd){
          maxOdd=nums[j];
        }
      nums[i]=maxOdd;
      }
    }
    maxOdd=1;
  }
  return nums;
}