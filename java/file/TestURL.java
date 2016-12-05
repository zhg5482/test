
import java.io.*; 
import java.net.URL; 
import java.net.URLConnection; 

public class TestURL { 
	
	public static void main(String[] args) throws IOException { 
		test4();		
       	}
        public static void test4() throws IOException { 
	         URL url = new URL("http://test.api.medbanks.cn/patientsedu/patientsEduInfo?id=1"); 
		 Object obj = url.getContent(); 
		 System.out.println(obj.getClass().getName()); 
       	} 
				                                        	
}
