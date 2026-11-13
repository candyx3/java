public class Customer
{

public static void main(String[] args)
{
    GRT obj = new GRT();
    int price = obj.getPrice();
    System.out.println(price);

    obj.setPrice(12999);

    price = obj.getPrice();
    System.out.println(price);
}
    
}
