package Q10;

public class Person {
    private String  name,address,phone_num,email;
    //constructor
    public Person(String name,String address,String phone_num,String email){
        this.name = name;
        this.address = address;
        this.phone_num = phone_num;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "Person:\n name is "+ getName();
    }
}
