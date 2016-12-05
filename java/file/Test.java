import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;   
import java.util.regex.Pattern;

public class Test {

	public static String getHtml(String urlString) {
		try {
			StringBuffer html = new StringBuffer();
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			InputStreamReader isr = new InputStreamReader(conn.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String temp;
			while ((temp = br.readLine()) != null) {
				html.append(temp).append("\n");
			}
			br.close();
			isr.close();
			return html.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		String content	=	Test.getHtml("http://test.api.medbanks.cn/patientsedu/patientsEduInfo?id=1");
		Matcher m = Pattern.compile("<title>([\\s\\S]*)</title>").matcher(content);
		while(m.find()){
			String title = m.group(1);
		////////////////	title	=	new String(title.getBytes("ISO-8859-1"),"GBK"); 
			System.out.println(title);
		}
	}

}
