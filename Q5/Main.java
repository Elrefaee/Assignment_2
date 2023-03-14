package Q5;

public class Main {
    public static void main(String[] args)
    {
        MyInteger x = new MyInteger(13);
        System.out.println(x.getInt());
        System.out.println(x.isEven());
        System.out.println(x.isOdd());
        System.out.println(x.isPrime());
        System.out.println(x.equals(13));
        System.out.println(x.equals(new MyInteger(13)));


        System.out.println(MyInteger.isEven(5));
        System.out.println(MyInteger.isOdd(5));
        System.out.println(MyInteger.isPrime(5));

        System.out.println(MyInteger.isEven(x));
        System.out.println(MyInteger.isOdd(x));
        System.out.println(MyInteger.isPrime(x));
    }
}