/*Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
  */

public boolean arrayFront9(int[] nums) {
    boolean flag = false;
    int L = nums.length;
  if(L <4){
    for(int i =0; i<L; i++){
      if(nums[i]==9)
      flag = true;
    }
  }
  if(L>=4){
  for(int i = 0; i<4; i++){
    if(nums[i]==9)
    flag = true;
  }
  }
  return flag;
  
}
