class Main
{
  static int evaluatePostfix(CQStack s, String exp)
  {
    int i, op1, op2, answer;
    for (i = 0; i < exp.length(); ++i)
    {
      // If the scanned character is an operand (number here), push it to the stack.
      char c = exp.charAt(i);
      if (Character.isDigit(c))
        s.push(c - '0');

      // If the scanned character is an operator, pop two elements from stack apply the operator
      else
      {
        op2 = s.pop();
        op1 = s.pop();
        switch(c)
        {
          case '+': s.push(op1 + op2); break;
          case '-': s.push(op1 - op2); break;
          case '*': s.push(op1 * op2); break;
          case '/': s.push(op1 / op2); break;
        }
      }
    }
    answer = s.pop();
    return answer;
  }

  public static void main(String[] args)
  {
    CQStack theStack = new CQStack(10); // make new stack
    String exp = "632+7*+";
    System.out.println("Value of " + exp + " postfix expression is " + evaluatePostfix(theStack,exp));
  }
}
