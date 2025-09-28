public class Circle {
    double radius;
    Circle(double r){
        radius=r;
    }
    double getarea(){
        return radius*radius*Math.PI;
    }
    double getinfo(){
        return radius;
    }
}



