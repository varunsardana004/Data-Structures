import java.util.*;

class Stack { 
    int top; 
    char a[]=new char[10];
    
    Stack() 
    { 
        top = -1; 
    } 
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    }
    void push(char x) 
    { 
            a[++top] = x; 
    } 
  
    char pop() 
    { 
        if(top>=0)
        {
            char x = a[top--];
            return x;
        }
        return 0;
    } 
    char peek()
    {
        return(a[top]);
    }
} 

public class Main{

    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPreFix(String expression)
    {

        String result = "";
        String finalresult = "";
        Stack stack = new Stack();
        for (int i =expression.length()-1; i>=0 ; i--) 
        {
            char c = expression.charAt(i);

            if(precedence(c)>0){
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
                    result += stack.pop();
                }
                stack.push(c);
            }
            else if(c==')')
            {
                char x = stack.pop();
                while(x!='(')
                {
                    result += x;
                    x = stack.pop();
                }
            }
            else if(c=='('){
                stack.push(c);
            }else{
                result += c;
            }
        }
            while(stack.top>=0) {
            result += stack.pop();
        }
        for(int i=result.length()-1;i>=0;i--)
        {
             char ch = result.charAt(i);
             finalresult+=ch;
        }
        return finalresult;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        
        System.out.println("Prefix Expression: " + infixToPreFix(s));
    }
}
