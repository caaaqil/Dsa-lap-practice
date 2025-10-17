package Chapter9;

public class Circle {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        double area=c.getarea();
        System.out.println("total area is "+area);
        System.out.println("number of radius is "+c.getinfo());
    }
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



