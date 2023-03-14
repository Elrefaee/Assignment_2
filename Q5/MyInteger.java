package Q5;

public class MyInteger {
    private int value;
    //constructor
    public  MyInteger(int value){
        this.value = value;
    }
    //getter
    public int getInt(){return value;}
    //Methods
    public boolean isEven(){return value % 2 == 0;}
    public boolean isOdd(){return  value % 2 == 1;}
    public boolean isPrime(){
        for(int i = 2; i <= value / 2 ; i++)
            if(value % i == 0)
                return false;
        return value > 1;
    }
    public boolean equals(int value){return this.value == value;}
    public boolean equals(MyInteger x){return  this.value == x.value;}
    //static Methods
    public static boolean isEven(int value){return value % 2 == 0;}
    public static boolean isOdd(int value){return  value % 2 == 1;}
    public static boolean isPrime(int value) {
        for (int i = 2; i < value / 2; i++)
            if (value % i == 0)
                return false;
        return value > 1;
    }
    public static boolean isEven(MyInteger x){return x.isEven();}
    public static boolean isOdd(MyInteger x){return  x.isOdd();}
    public static boolean isPrime(MyInteger x){return x.isPrime();}
}
