public class Main {
    public static void main(String[] args) {
//        GRADE

        double mark1[]={10,9,70};
        Grade g=new Grade("ahmed",20,mark1);
        g.getinfo();
        System.out.println(g.calavrg());
        System.out.println(g.checkresul());

//        CIRCLE
        Circle c=new Circle(5);
        double area=c.getarea();
        System.out.println(area);
        System.out.println(c.getinfo());

}
}
