/*
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.


lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
*/

public boolean lessBy10(int a, int b, int c) {
  int A = Math.abs(a-b);
  int B = Math.abs(a-c);
  int C = Math.abs(b-c);
  
  if(A>=10 || B>=10 || C>=10){
    return true;
  }
  return false;
}

