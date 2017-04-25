/**
 * Created by zhg-pc on 17/4/25.
 */
public class Employee implements java.io.Serializable{
    public String name;
    public String address;
    public transient int SSN; //transient短暂的
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}
