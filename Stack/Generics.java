package Stack;

import java.util.Scanner;

public class Generics<T> {
    public static void main(String[] args) {
        Generics<Integer> g1=new Generics<>(20);
        g1.diplay();
        Generics <String> g2=new Generics<>("hello");
        g2.diplay();
    }
    T num;
    Generics(T num){
        this.num=num;
    }
    void diplay(){
        System.out.println(num);
    }

}
