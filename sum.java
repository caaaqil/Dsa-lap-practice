public class sum {
    double radius;
    sum(double radius){
        this.radius=radius;
    }
    double getarea(){
        return radius*radius*Math.PI;
    }
    double getinfo(){
        return radius;
    }
}
