package email;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
/**
 * Created by zhg-pc on 17/4/28.
 */
public class SendFileEmail {
    public static void main(String [] args)
    {
        String to   = "1581992170@qq.com";   //收件人电子邮箱
        String from = "zhg5482482@163.com";   //发件人电子邮箱
        String password = "zg8826841221";   //密码
        String host = "smtp.163.com"; //指定发送邮件的主机为localhost

        Properties properties = System.getProperties(); //获得系统属性
        properties.setProperty("mail.smtp.host",host); //设置邮件服务器
        properties.put("mail.smtp.auth", "true");

        MyAuthenticator myauth = new MyAuthenticator(from, password);
        Session session = Session.getDefaultInstance(properties,myauth);  //获取默认session对象

        try{
            // 创建默认的 MimeMessage 对象。
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: 头字段
            message.setSubject("This is the Subject Line!");

            // 创建消息部分
            BodyPart messageBodyPart = new MimeBodyPart();

            // 消息
            messageBodyPart.setText("This is message body");

            // 创建多重消息
            Multipart multipart = new MimeMultipart();

            // 设置文本消息部分
            multipart.addBodyPart(messageBodyPart);

            // 附件部分
            messageBodyPart = new MimeBodyPart();
            String filename = "file.txt";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);

            // 发送完整消息
            message.setContent(multipart );

            //   发送消息
            Transport.send(message);
            System.out.println("Sent message successfully....");
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
