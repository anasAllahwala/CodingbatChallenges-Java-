/* Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/

public String seeColor(String str) {
 if(str.length()==3 && str == "red"){
   return str;
 }
 if(str.length()>3){
 String a = str.substring(0,4);
 if(a.substring(0,3).equals("red")){
   return a.substring(0,3);
 }
 if(a.substring(0,4).equals("blue")){
   return a.substring(0,4);
 }
 return "";
}
return "";
}
