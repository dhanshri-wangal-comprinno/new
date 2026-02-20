//Find the minimum number of bracket that we need to remove to make the given bracket sequence balanced

import java.util.*;
class BalancedBMin{
public static int minRemoval(String str){
Stack<Character> st = new Stack<>();
int invalidClosed = 0;
int n= str.length();

for(int i=0;i<n;i++){
char ch = str.charAt(i);
if(ch=='('){
st.push(ch);
}
else{
if(!st.isEmpty()){
st.pop();
}
else{
invalidClosed++;
}
}
}
int invalidOpen = st.size();

return invalidOpen+ invalidClosed;
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
System.out.println(minRemoval(str));}
}