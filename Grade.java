public class Grade {
    String name;
    int age;
    double [] marks;
//    constructor with argument
    Grade(String name,int age,double[] marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
//    method displays name and age of student
    void getinfo(){
        System.out.println(name+"-"+age);
    }
//    Method calculates avarage
    double calavrg(){
        double sum=0;
        for (double mark:marks){
            sum+=mark;
        }
        return sum/marks.length;
    }
//    methods chekcs if student pass or fail
    String checkresul(){
        double avrage=calavrg();
        if (avrage > 50) {

            return "pass✅";
        }else {
            return "fail✖️";
        }
    }

}




