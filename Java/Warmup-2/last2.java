/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2

*/

public int last2(String str) {
  int count = 0;
  for(int i =0; i<str.length(); i++){
    if(i+2<str.length() && str.charAt(i)==str.charAt(str.length()-2) && str.charAt(i+1)==str.charAt(str.length()-1)){
      count = count +1;
    }
  }
  return count ;
}
