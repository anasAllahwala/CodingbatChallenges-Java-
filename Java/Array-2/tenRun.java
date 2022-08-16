/*For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So 
{2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.


tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
*/

public int[] tenRun(int[] nums) {
  int i = 0;
  int temp = 0;
  while(i<nums.length){
    if(nums[i]%10==0){
      temp = nums[i];
      for(int j = i+1; j<nums.length; j++){
        if(nums[j]%10!=0){
          nums[j]=temp;
        }else{
          break;
        }
      }
    }
    i++;
  }
  return nums;
}
