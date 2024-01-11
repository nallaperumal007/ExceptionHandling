import java.util.*;

class AllException 
{
    public static void handleArithmeticException() 
    {
        try
         {
            int a,b;
            System.out.println("Enter the value A:");
            a=Integer.parseInt(System.console().readLine());
            System.out.println("Enter the value B:");
            b=Integer.parseInt(System.console().readLine());
            int result = a / b; 
            System.out.println("Result: " + result);
          }
         catch (ArithmeticException e)
          {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
          }
    }

    public static void handleNullPointerException() 
    {
        try 
        {
            String str = null;
            int length = str.length(); 
            System.out.println("Length: " + length);
        } 
        catch (NullPointerException e) 
        {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void handleNumberFormatException() 
    {
        try 
        {
            String str;
            System.out.println("Enter the values:");
            str=System.console().readLine();
            int number = Integer.parseInt(str); 
            System.out.println("Number: " + number);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    public static void handleArrayIndexOutOfBoundsException() 
    {
        try
         {
            int n,i;
            int a[] = new int[2];  
            System.out.println("Enter number of elements:");
            n=Integer.parseInt(System.console().readLine());
            System.out.println("ENter the elements:");
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(System.console().readLine());
            }

         }
          catch (ArrayIndexOutOfBoundsException e) 
          {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
          }
    }


      public static void handleMarkValidation() 
      {
        try
         {
            int mark;
            System.out.print("Enter the mark (0 to 100): ");
            mark=Integer.parseInt(System.console().readLine());
            System.out.println("Your mark " + mark);
            if (mark < 0 || mark > 100) 
            {
            throw new MyException("Invalid mark. Mark should be between 0 and 100.");
            } 
        } 
        catch (MyException e) 
        {
            System.out.println("Caught MyException: " + e.getMessage());
        }
      }

    public static void main(String args[]) 
    {
        int flag = 1, ch;
        while (flag == 1)
         {
            System.out.println("Menu:");
            System.out.println("1. ArithmeticException");
            System.out.println("2. NullPointerException");
            System.out.println("3. NumberFormatException");
            System.out.println("4. ArrayIndexOutOfBoundsException");
            System.out.println("5. Mark Validation");
            System.out.println("Enter your choice:");
            ch = Integer.parseInt(System.console().readLine());
            switch (ch) 
            {
                case 1:
                    handleArithmeticException();
                    break;
                case 2:
                    handleNullPointerException();
                    break;
                case 3:
                    handleNumberFormatException();
                    break;
                case 4:
                    handleArrayIndexOutOfBoundsException();
                    break;
                case 5:
                    handleMarkValidation();
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Press 1 to continue");
            flag = Integer.parseInt(System.console().readLine());
          }
    }

    
   
}


