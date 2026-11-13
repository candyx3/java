public class Calculator
{

public static void main(String[] args)
{
    Calculator casio = new Calculator();
    int result =  casio.add(10,45);
    int result2 = casio.add(5,3,2);
    System.out.println("=======> "+result2);
    System.out.println("result => "+result);
    casio.add();
    casio.add(10);
    casio.add("hello");
    casio.add(10,"abc");
    casio.add("abc",10);

    System.out.println(10);
    System.out.println(10.5);
    System.out.println(15.4f);
    System.out.println("abc");
    System.out.println();
    System.out.println(true);
   
   
}
public void add(String s, int i){}
public void add(int i,String s){}
public void add(String str){
}
public void add(int i){
}

public void add(){

}


//method overloading - compile time polymorphism
//same method name with dif no of arguments or diff type of arguements
public int add(int no1,int no2){
    int result = no1+no2;
    System.out.println(result);
    return result;
}

public int add(int no1,int no2,int no3){
    int result = no1+no2+no3;
    System.out.println(result);
    return result;

}

}
