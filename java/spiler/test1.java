
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
public static void main(String[] args) throws IOException {
URL url = new URL("https://www.douban.com/group/topic/8845032/"); 
URLConnection conn = url.openConnection(); 
conn.setConnectTimeout(1000 * 10); 
BufferedReader bufr = new BufferedReader(new InputStreamReader(conn.getInputStream())); 
String line = null; 
String regex = "[a-zA-Z0-9_-]+@\\w+\\.[a-z]+(\\.[a-z]+)?";
Pattern p = Pattern.compile(regex); 
while((line = bufr.readLine()) != null) { 
Matcher m = p.matcher(line); 
while(m.find()) { 
System.out.println(m.group());
} 
} 
}
}
