/*Algorithm
 * 1> Create an empty stack
 * 2>Read the expression
 * 3>scan the expression from left to right
 *      if scanned char is left parenthesis
 *          push into the stack
 *      if scanned char is right parenthesis
 *          if stack is empty
 *              invalid expression
 *          else pop the char from stack
 *          if scanned char is not matched with poped char
 *              invalid
 *4>After scanning all the symbols
        if stack is empty
            valid expressio
        else 
            invalid expression
 * 
 */


import java.util.Stack;
public class ParenthesisCheck {
   public static void checkExpression(String str) {
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char symbol=str.charAt(i);
            if(symbol=='(' || symbol=='[' || symbol=='{'){
                st.push(symbol);
                continue;
            }
            if(symbol==')' || symbol==']' || symbol=='}'){
                if(st.isEmpty()){
                    System.out.println("Invalid expression");
                    return;
                }
                char item=st.pop();
                if(!match(item,symbol)){
                    System.out.println("Invalid");
                }

            }
        }
        if(st.isEmpty()){
            System.out.println("Valid expression");
        }
        else{
            System.out.println("Invalid expression");
        }
        System.out.println(st);
   }
   public static boolean match(char c, char c1) {
        if(c=='(' && c1==')')
            return true;
        else if(c=='[' && c1==']')
            return true;
        else if(c=='{' && c1=='}')
            return true;
        return false;
        
   }


   public static void main(String[] args) {
    String str="[A/(B-C)*D]";
    checkExpression(str);
   }
}
