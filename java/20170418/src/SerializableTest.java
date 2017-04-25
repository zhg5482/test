import java.io.*;

/**
 * Created by zhg-pc on 17/4/25.
 */
public class SerializableTest {
    public static void main(String []args){
        SerializableTest t1 = new SerializableTest();
        //t1.Serializable1();
        t1.Serializable2();
    }

    /*
    序列化对象
        ObjectOutputStream 类用来序列化一个对象，如下的 SerializeDemo
            例子实例化了一个 Employee 对象，并将该对象序列化到一个文件中。
        该程序执行后，就创建了一个名为 employee.ser 文件。
            该程序没有任何输出，但是你可以通过代码研读来理解程序的作用。
        注意： 当序列化一个对象到文件时， 按照 Java 的标准约定是给文件一个 .ser 扩展名。
     */
    public void Serializable1()
    {
        Employee e = new Employee();
        e.name     = "Reyan Ali";
        e.address  = "Phokka Kuan, Ambehta Peer";
        e.SSN      = 11122333;
        e.number   = 101;
        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }

    /*
    反序列化对象
     */
    public void Serializable2()
    {
        Employee e = null;
        try
        {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i)
        {
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c)
        {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }

    /*
    这里要注意以下要点：
    readObject() 方法中的 try/catch代码块尝试捕获 ClassNotFoundException 异常。
        对于 JVM 可以反序列化对象，它必须是能够找到字节码的类。
        如果JVM在反序列化对象的过程中找不到该类，则抛出一个 ClassNotFoundException 异常。
    注意，readObject() 方法的返回值被转化成 Employee 引用。
    当对象被序列化时，属性 SSN 的值为 111222333，但是因为该属性是短暂的，
        该值没有被发送到输出流。所以反序列化后 Employee 对象的 SSN 属性为 0。
     */
}
