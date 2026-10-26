public class Shop
{
// static refers to class specific information
    static String name;
    static int age = 10;
    
// non-static refers to object specifi information
    String prodName = "abc";
    int price;

    String prodName2 = "bcd";
    int price2 = 500;

public static void main(String[] args){

//    int i;  
    System.out.println(name);
    

    System.out.println(Shop.name);
    System.out.println(Shop.age);
    
    Shop product1 = new Shop();
    Shop product2 = new Shop();

    System.out.println(product2.prodName2);
    System.out.println(product2.price);
    
}



}
