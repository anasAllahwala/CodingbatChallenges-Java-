/*
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)


fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
*/

public String fizzString(String str) {
 boolean f = str.startsWith("f");
 boolean b = str.endsWith("b");
 
 if(f&&b) return "FizzBuzz";
 if(f) return "Fizz";
 if(b) return "Buzz";
 return str;
}
