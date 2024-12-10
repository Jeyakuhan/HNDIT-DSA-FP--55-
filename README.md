# HNDIT-DSA-FP--55-ReverseDigitsUsingStack


***This repository contains a Java program to reverse a given number using a stack. The program demonstrates the use of stacks in solving problems efficiently and is an excellent example of understanding the Last-In-First-Out (LIFO) property of stacks.***


---

## Features

**Reverses an integer number using a stack.**

**Efficient and simple implementation.**

**Provides step-by-step explanation of the algorithm.**

**Suitable for learning basic stack operations (push and pop).**



---

## How It Works

### Steps:

1. The digits of the number are pushed onto a stack, one at a time.


2. Using the stack's LIFO property, the digits are popped off in reverse order.


3. The reversed digits are combined to form the reversed number.




---

## Example Usage

__Input:__

***4321***

__Output:__

***1234***

### How the Stack Works:

**Initial Number: 4321**

**Stack After Pushing: [1, 2, 3, 4] (from least to most significant digit)**

**Digits Popped: 4 → 3 → 2 → 1**

**Reversed Number: 1234**



---

## Code

**Here is the full implementation:**

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
---
## Screenshots

![image](https://github.com/user-attachments/assets/736179c6-9861-4ff1-ab1a-316d5284b162)
![image](https://github.com/user-attachments/assets/072dbb43-1c94-44a4-8c6c-bd6c3ad922fb)
![image](https://github.com/user-attachments/assets/15a10929-61fd-4998-86e5-76a1c897a7b8)



---

## How to Run

### Follow these steps to run the program:

1. Clone the Repository:

git clone https://github.com/your-username/your-repository.git
cd your-repository


2. Compile the Program:

javac stack_reverse.java


3. Run the Program:

java stack_reverse




---

## Complexity Analysis

### Time Complexity:

-  O(n)

### Space Complexity:

-  O(n)


---

## Notes

__The program assumes the input number is non-negative.__

__To handle negative numbers, additional logic would be required to preserve the sign.__

__This program is a great example of how stacks can be used to solve real-world problems.__



---

## License

**This project is licensed under the MIT License. Feel free to use, modify, and share!**


---

## Author
**S.Jeyakuhan**
