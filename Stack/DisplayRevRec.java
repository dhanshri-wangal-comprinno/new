//display reverse using recurrsion



import java.util.*;

class DisplayRevRec{
public static void displayRevRec(Stack<Integer> s){
if(s.size()==0) return;
int top = s.pop();
System.out.print(top+" ");
displayRevRec(s);
s.push(top);
}

public static void main(String args[]){
Stack<Integer> st = new Stack<>();
st.push(1);
st.push(2);
st.push(3);
st.push(4);
st.push(5);
displayRevRec(st);
}
}