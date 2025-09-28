public class Grade {
    String name;
    int age;
    double [] marks;
    Grade(String name,int age,double[] marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    void getinfo(){
        System.out.println(name+"-"+age);
    }
    double calavrg(){
        double sum=0;
        for (double mark:marks){
            sum+=mark;
        }
        return sum/marks.length;
    }
    String checkresul(){
        double avrage=calavrg();
        if (avrage > 50) {

            return "pass✅";
        }else {
            return "fail✖️";
        }
    }

}




