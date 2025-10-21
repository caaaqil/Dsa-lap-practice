package Stack;

import java.util.Scanner;
import java.util.Stack;

public class checkequel {
    public static void main(String[] args) {
        Scanner inputobject=new Scanner(System.in);
        System.out.println("enter strings to check palindrome");
        String input=inputobject.nextLine();
        checkequel test=new checkequel();
        test.equel(input);

    }
    void equel(String word){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<word.length();i++)
            stack.push(word.charAt(i));
        String reversed="";
        while (!stack.empty())
            reversed+=stack.pop();
        if (word.equalsIgnoreCase(reversed))
            System.out.println(word+" is palindrome");
        else System.out.println("is not palindrome");


    }
}

