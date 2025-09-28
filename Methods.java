public class Methods {
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
