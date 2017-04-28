package email;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

/**
 * Created by zhg-pc on 17/4/28.
 */
public class SendEmail
{
    /*
    如果你想发送一封e-mail给多个收件人，那么使用下面的方法来指定多个收件人ID：
    void addRecipients(Message.RecipientType type,
                       Address[] addresses)
    throws MessagingException
    下面是对于参数的描述：
        type:要被设置为 TO, CC 或者 BCC，这里 CC 代表抄送、BCC 代表秘密抄送。
        举例：Message.RecipientType.TO
        addresses: 这是 email ID 的数组。
        在指定电子邮件 ID 时，你将需要使用 InternetAddress() 方法。

     */
    public static void main(String []args)
    {
        String to   = "1581992170@qq.com";   //收件人电子邮箱
        String from = "zhg5482482@163.com";   //发件人电子邮箱
        String password = "zg8826841221";   //密码
        String host = "smtp.163.com"; //指定发送邮件的主机为localhost

        Properties properties = System.getProperties(); //获得系统属性
        properties.setProperty("mail.smtp.host",host); //设置邮件服务器
        properties.put("mail.smtp.auth", "true");

        MyAuthenticator myauth = new MyAuthenticator(from, password);

        /*
        props.put("mail.smtp.host" , "smtp.gmail.com");
        props.put("mail.stmp.user" , "username");

        //To use TLS
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.password", "password");
        //To use SSL
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
            "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
         */
        Session session = Session.getDefaultInstance(properties,myauth);  //获取默认session对象

        try{
            MimeMessage message = new MimeMessage(session); //创建默认的 MimeMessage 对象
            message.setFrom(new InternetAddress(from)); //Set From:头部头字段
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to)); //Set To 头部头字段
            message.setSubject("This is the Subject Line!");  //Set Subject: 头部头字段
            message.setText("This is actual message");  //设置消息体
            Transport.send(message);  //发送消息
            System.out.println("Sent message successfully...");

        }catch (MessagingException mex){
            mex.printStackTrace();
        }
    }
}
