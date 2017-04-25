/**
 * Created by zhg-pc on 17/4/25.
 */
public class ExceptionTest {
    public static void main(String []args){
        ExceptionTest t1 = new ExceptionTest();
        //t1.ExceptionTest1();
        t1.ExceptionTest2();
    }

    public void ExceptionTest1(){
        try{
            int a[] = new int[2];
            System.out.println("Access element three : " + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }

    public void ExceptionTest2(){
        int a[] = new int[2];
        try{
            System.out.println("Access element three : " + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        finally {
            a[0] = 6;
            System.out.println("First element value: " +a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
