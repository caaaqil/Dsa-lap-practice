package Chapter9;

public class Product {
    public static void main(String[] args) {
        Product p1 = new Product("P101", "Laptop", 500.0, 10);
        Product p2 = new Product("P102", "Phone", 300.0, 5);

        System.out.println("Products Info:");
        System.out.println("product id "+p1.ID+" product name "+p1.name+" original price "+p1.price+" after discount "+p1.priceAfterDiscount()+" final price "+p1.finalPrice());


    }


    String ID;
    String name;
    double price;
    double discount;
    final double vat=0.15;

    Product (String ID,String name,double price,double discount){
        this.ID=ID;
        this.name=name;
        this.price=price;
        this.discount=discount;

    }
    double priceAfterDiscount(){
        return price - (price*discount/100);//50
    }
    double finalPrice(){
        double discount=priceAfterDiscount();
        return discount+(discount*vat);//67.5
    }


}