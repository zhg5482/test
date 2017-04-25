import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhg-pc on 17/4/20.
 */
public class PatternTest {
    public static void main(String []args){
        PatternTest t1 = new PatternTest();
        t1.RegexExample1();
        System.out.println("====================");
        t1.RegexMatches();
        System.out.println("====================");
        t1.RegexMatches2();
        System.out.println("====================");
        t1.RegexMatches3();
        System.out.println("====================");
        t1.RegexMatches4();
        System.out.println("====================");
        t1.RegexMatches5();
        System.out.println("====================");
    }

    public void RegexExample1(){
        String content = "I am noob " +
                "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
    }

    public void RegexMatches(){
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }

    public void RegexMatches2(){
        //下面是一个对单词 "cat" 出现在输入字符串中出现次数进行计数的例子：
        Pattern p = Pattern.compile("\\bcat\\b");
        Matcher m = p.matcher("cat cat cat cattie cat"); // 获取 matcher 对象
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }

    public void RegexMatches3(){
        //matches 和 lookingAt 方法都用来尝试匹配一个输入序列模式。它们的不同是 matcher 要求整个序列都匹配，而lookingAt 不要求。
        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("fooooooooooooooooo");

        System.out.println("Current REGEX is: "+"foo");
        System.out.println("Current INPUT is: "+"fooooooooooooooooo");

        System.out.println("lookingAt(): "+matcher.lookingAt());
        System.out.println("matches(): "+matcher.matches());
    }

    public void RegexMatches4(){
        //replaceFirst 和 replaceAll 方法用来替换匹配正则表达式的文本。不同的是，replaceFirst 替换首次匹配，replaceAll 替换所有匹配。
        Pattern p = Pattern.compile("dog");
        // get a matcher object
        Matcher m = p.matcher("The dog says meow. " +
                "All dogs say meow.");
        String INPUT = m.replaceAll("cat");
        System.out.println(INPUT);
    }

    public void RegexMatches5(){
        //Matcher 类也提供了appendReplacement 和 appendTail 方法用于文本替换：
        Pattern p = Pattern.compile("a*b");
        // 获取 matcher 对象
        Matcher m = p.matcher("aabfooaabfooabfoob");
        StringBuffer sb = new StringBuffer();
        while(m.find()){
            m.appendReplacement(sb,"-");
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
