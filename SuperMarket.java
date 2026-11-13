public class SuperMarket{

static String name = "Muthu";
static int no = 40;

String prodName;
int price;
int discount;

//constructor
public SuperMarket(String prodName, int price){
    System.out.println("Are you constructor?");
    this.prodName = prodName;
    this.price = price;
// this refers to current object
}

//constructor overloading
public SuperMarket(String s, int i,int j){
    System.out.println("Are you constructor?");
    this.prodName = s;
    this.price = i;
    this.discount = j;
// this refers to current object
}

public SuperMarket(){
}

//No return type req
//Same as class name
//Called automatically when object is created
//initializing object specific values


public static void main(String[] args)
{
   
    
    SuperMarket product1 = new SuperMarket("boost",200);
//    product1.prodName = "boost";
//    product1.price = 200;

//    int i = 10;
//    System.out.println(product1.i);

    SuperMarket product2 = new SuperMarket("Horlicks",250);
//    product2.prodName = "Horlicks";
//    product2.price = 250;

    SuperMarket product3 = new SuperMarket("Horlicks",250,10);

    SuperMarket product4 = new SuperMarket();

    product2.buy();
//    product1.buy();
  
}

//this refers to current object
public void buy(){
    System.out.println("buy - method");
    System.out.println("ProdName : "+this.prodName);
    System.out.println("Price : "+this.price);
}


}
