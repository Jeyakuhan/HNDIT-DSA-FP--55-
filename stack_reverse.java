import java.util.Stack;


public class stack_reverse {static Stack <Integer> Digits = new Stack<>();

    // Function for push
    static void push_digits(int number)
    {
        while(number !=0)
        {
            Digits.push(number % 10);
            number = number / 10 ;
        }
    }
static int reverse_number(int number)
        {

    // Function call to push
            push_digits(number);
            int reverse = 0;
            int i = 1 ;

            //pop the digi
            // the reverse
            while (!Digits.isEmpty())
            {
                reverse = reverse +(Digits.peek() * i) ;
                Digits.pop() ;
                i = i * 10 ;

            }
        // return the revers
            return reverse ;
        }
    // main for test the function
    public static void main (String[]args)
    {
     int number = 4321;

     System.out.println(reverse_number(number));
    }



}
