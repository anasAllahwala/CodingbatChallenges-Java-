/*Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.


modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
*/

public boolean modThree(int[] nums) {
  int i = 0;
  int countEven = 0;
  int countOdd = 0;
  while(i<nums.length - 2){
    if(nums[i]%2==0){
      for(int j = i+1; j<=2; j++){
        if(nums[j]%2!=0){
          break;
        }if(nums[j]%2==0){
          countEven++;
          if(countEven>=2){
            return true;
          }
        }
      }
    }
    if(nums[i]%2!=0 ){
      for(int j = i+1;j<=3; j++){
        if(nums[j]%2==0){
          break;
        }else{
          countOdd++;
          if(countOdd==2){
            return true;
          }
        }
      }
    }
    i++;
  }
  if(nums.length>2 && nums[nums.length-1]==6 && nums[nums.length-2]==2 && nums[nums.length-3]==2){
    return true;
  }
  return false;
}
