import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {

      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter number of elements to be stored in array:");
      int num = s.nextInt(); 

      int array[] = new int[num];

      System.out.println("Enter array value");
      
      for (int i = 0;i< num;i++)
          array[i] = s.nextInt();

      System.out.println("Enter the value to search:");
      
      int item = s.nextInt();
      int first = 0;
      int last = num - 1;
     int  mid = (first + last)/2;

      while( first <= last )
      {
         if ( array[mid] < item )
           first = mid + 1;
         else if ( array[mid] == item )
         {
           System.out.println(item + " found at location " + (mid + 1));
           break;
         }
         else
         {
             last = mid - 1;
         }
         mid = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " is not found.\n");
   }
}
