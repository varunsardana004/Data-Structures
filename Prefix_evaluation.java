class Main
{
  static int evaluatePrefix(CQStack s, String exp)
  {
    int i, op1, op2, answer;
    for (i = exp.length()-1; i >= 0 ; i--)
    {
      
      char c = exp.charAt(i);
      if (Character.isDigit(c))
        s.push(c - '0');

    
      else
      {
        op1 = s.pop();
        op2 = s.pop();
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
    CQStack theStack = new CQStack(10);
    String exp = "+6*+237";
    System.out.println("Value of " + exp + " prefix expression is " + evaluatePrefix(theStack,exp));
  }
}
