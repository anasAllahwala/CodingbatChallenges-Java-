/*Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
  */
  
 public String stringX(String str) {
  if(str.length()<=1){
    return str;
  }
  String result = str.substring(0,1);
  for(int i = 1; i<str.length(); i++){
    if(str.charAt(i)!='x'){
      result = result + str.charAt(i);
    }
  }
  if(str.charAt(str.length()-1)=='x'){
    result = result + str.charAt(str.length()-1);
  }
  return result;
}
