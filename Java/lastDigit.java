/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator 
computes the remainder, e.g. 17 % 10 is 7.


lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
*/

public boolean lastDigit(int a, int b, int c) {
  int A = a%10;
  int B = b%10;
  int C = c%10;
  
  if(A==B || A==C || B==C){
    return true;
  }
  return false;
}
