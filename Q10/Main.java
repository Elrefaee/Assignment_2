package Q10;

import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        Person x = new Person("abc", "zzz", "111", "z@gmail.com");
        Student y = new Student("def", "xxx", "000", "w@gmail.com","freshman");
        Employee z = new Employee("ghi","aaa","222","c@gmail.com","bbb",2000f,new Date());
        Faculty X = new Faculty("jkl","bbb","333","v@gmail.com","nnn",1000f,new Date(),"22","Silver");
        Staff Y = new Staff("mno","ddd","444","o@gmail.com","999",5000f,new Date(),"Senior");

        //printing
        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(z.toString());
        System.out.println(X.toString());
        System.out.println(Y.toString());

    }
}
