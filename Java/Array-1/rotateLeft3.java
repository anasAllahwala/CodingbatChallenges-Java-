/*Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7] */

public int[] rotateLeft3(int[] nums) {
  int temp0 = nums[0];
  int temp1 = nums[1];
  int temp2 = nums[2];
  
  nums[0]= temp1;
  nums[1]= temp2;
  nums[2]= temp0;
  
  return nums;

}
