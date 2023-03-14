package Q10;
import java.util.Date;
public class Staff extends Employee{
    private String title;
    public Staff(String name,String address,String phone_num,
                 String email,String office,double salary,
                 Date dateHired,String title)
    {
        super(name,address,phone_num,email,office,salary,dateHired);
        this.title = title;
    }
    @Override
    public String toString() {
        return "Staff:\n name is "+ getName();
    }
}
