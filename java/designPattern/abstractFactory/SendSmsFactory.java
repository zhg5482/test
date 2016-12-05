/**
 *抽象工厂模式
 */
public class SendSmsFactory implements Provider{
	public Sender produce(){
		return new SmsSender(); 
	}
}
