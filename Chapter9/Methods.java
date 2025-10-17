package Chapter9;

public class Methods {
    public static void main(String[] args) {
        Methods m=new Methods();
        m.display();
        int birthyear=m.birthyear(2025);
        System.out.println("i was born in "+birthyear);
    }
    String name;
    int age;
//    Constructor without argument or default
    Methods(){
        name="ahmed";
        age=20;
    }
//    void method
    void display(){
        System.out.println("my name is " +name+" i'm "+age+"years old");
    }
//    value returning method
    int birthyear(int currentyear){
        return currentyear-age;

    }
}
