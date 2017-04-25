import java.util.Scanner;

/**
 * Created by zhg-pc on 17/4/25.
 */
public class ScannerTest {
    public static void main(String []args){
        ScannerTest t1 = new ScannerTest();

        Scanner s = new Scanner(System.in);
        // 从键盘接收数据
        //t1.nextOutPut(s);
        //t1.nextLineOutPut(s);
        //t1.ScannerDemo1(s);
        t1.ScannerDemo2(s);
    }

    public void nextOutPut(Scanner s){
        // next方式接收字符串
        System.out.println("next方式接收: ");
        if (s.hasNext()){
            String str1 = s.next();
            System.out.println("输入的数据为: "+str1);
        }
    }

    public void nextLineOutPut(Scanner s){
        //nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if(s.hasNextLine()){
            String str2 = s.nextLine();
            System.out.println("输入的数据为："+str2);
        }
    }

    public void ScannerDemo1(Scanner s ){
        int i = 0 ;
        float f = 0.0f;
        System.out.print("输入整数：");
        if(s.hasNextInt()){
            //判断输入的是否是整数
            i = s.nextInt();
            //接收整数
            System.out.println("整数数据: " + i);
        }else{
            //输入错误的信息
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数:");
        if(s.hasNextFloat()){
            //判断输入的是否是小数
            f = s.nextFloat();
            //接收小数
            System.out.println("小数数据:" + f);
        }else{
            //输入错误信息
            System.out.println("输入的不是小数！");
        }
    }

    public void ScannerDemo2(Scanner s){
        System.out.print("输入数据(enter分隔/非数字结束)：");
        double sum = 0;
        int m = 0;

        while (s.hasNextDouble())
        {
            double x = s.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值是"+(sum/m));
    }
}
