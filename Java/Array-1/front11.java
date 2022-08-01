/*Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1] */


public int[] front11(int[] a, int[] b) {
  
  if(a.length>=1 && b.length>=1){
    int [] nums = new int [2];
    nums[0]=a[0];
    nums[1]=b[0];
    return nums;
  }
  if(a.length==0 && b.length ==0){
    int [] nums1 = new int [0];
    return nums1;
  }
  if(a.length<1 && b.length>=1){
    int [] nums2 = new int [1];
    nums2[0]=b[0];
    return nums2;
  }
    int[] nums3 = new int [1] ;
    nums3[0]=a[0];
    return nums3;
  
}
