package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner inputobject=new Scanner(System.in);
        System.out.println("enter strings to reverse");
        String input=inputobject.nextLine();
        ReverseStrings test=new ReverseStrings();
        String result=test.reverse(input);
        System.out.println(result);
    }

        String reverse(String input){
            Stack<Character> s1=new Stack<>();
            for (int i=0;i<input.length();i++)
                s1.push(input.charAt(i));
            String reversed="";
            while (!s1.empty())
                reversed+=s1.pop();
            return reversed;

        }

    }


