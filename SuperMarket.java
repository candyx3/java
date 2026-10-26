public class SuperMarket{

static String name = "Muthu";
static int no = 40;

String prodName;
int price;

public static void main(String[] args)
{
    
    SuperMarket product1 = new SuperMarket();
    product1.prodName = "boost";
    product1.price = 200;

    SuperMarket product2 = new SuperMarket();
    product2.prodName = "Horlicks";
    product2.price = 250;

    product1.buy();
    product1.buy();

}

public void buy(){
    System.out.println("buy - method");
}


}
