import com.sun.deploy.util.StringUtils;

/**
 * Created by zhg-pc on 17/4/20.
 */
public class StringBufferTest {
    public static void main(String []args){
        StringBufferTest test = new StringBufferTest();
        String s = "我想做个好人";
        String []str = {"好人难做啊","好人不好做"};

        StringBuffer stringBuffer1 = test.append(s,str);
        System.out.println("append ==== "+stringBuffer1);

        StringBuffer stringBuffer2 = test.reverse(s);
        System.out.println("reverse ==== "+stringBuffer2);

        StringBuffer stringBuffer3 = test.delete(s,0,3);
        System.out.println("delete ==== "+stringBuffer3);

        StringBuffer stringBuffer4 = test.insert(s,0,3);
        System.out.println("insert ==== "+stringBuffer4);

        StringBuffer stringBuffer5 = test.replace(s,0,3,"aaa");
        System.out.println("replace ==== "+stringBuffer5);
    }

    //1.public StringBuffer append(String s)将指定的字符串追加到此字符序列。
    public StringBuffer append(String s,String str[]){
        StringBuffer stringBuffer = new StringBuffer(s);
        for (int i = 0 ;i < str.length;i++){
            stringBuffer.append(str[i]);
        }
        return stringBuffer;
    }

    //2.public StringBuffer reverse()将此字符序列用其反转形式取代。
    public StringBuffer reverse(String s){
        StringBuffer stringBuffer = new StringBuffer(s);
        return stringBuffer.reverse();
    }

    //3.public delete(int start, int end)移除此序列的子字符串中的字符。
    public StringBuffer delete(String s,int start, int end){
        StringBuffer stringBuffer = new StringBuffer(s);
        return stringBuffer.delete(start,end);
    }

    //4.public insert(int offset, int i)将 int 参数的字符串表示形式插入此序列中。
    public StringBuffer insert(String s ,int offset, int i){
        StringBuffer stringBuffer = new StringBuffer(s);
        return stringBuffer.insert(offset,i);
    }

    //replace(int start, int end, String str)使用给定 String 中的字符替换此序列的子字符串中的字符。
    public StringBuffer replace(String s,int start, int end, String str){
        StringBuffer stringBuffer = new StringBuffer(s);
        return stringBuffer.replace(start, end, str);
    }
}
