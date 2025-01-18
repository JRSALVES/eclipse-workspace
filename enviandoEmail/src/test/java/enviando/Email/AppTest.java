package enviando.Email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private String userName = "jeruso.nascimento@gmail.com";
	private String senha = "krhh izcu inzf ybcy";

	@org.junit.Test
	public void testeEmail() {
		try {

			/* Olhar as configurações de SMTP de seu email */
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true"); /* Autorização */
			properties.put("mail.smtp.starttls", "true"); /* Autenticação */
			properties.put("mail.smtp.host", "smtp.gmail.com"); /* Servidor gmail google */
			properties.put("mail.smtp.port", "465"); /* prota do servidor */
			properties.put("mail.smtp.socketFactory.port", "465"); /* Porta usada pelo Socket */
			properties.put("mail.smtp.socketFactory.class",
					"javax.net.ssl.SSLSocketFactory"); /* Classe de socket de conexão SMTP */

			Session session = Session.getDefaultInstance(properties, new Authenticator() {

				@Override
				protected PasswordAuthentication getPasswordAuthentication() {

					return new PasswordAuthentication(userName, senha);
				}
			});

			Address[] toUser = InternetAddress.parse("jerusoalves0@gmail.com, jeruso.nascimento@gmail.com");
			
			Message message = new MimeMessage(session);
			
			message.setFrom(new InternetAddress(userName)); /*Quem está enviando*/	
			message.setRecipients(Message.RecipientType.TO, toUser); /*Quem vai receber*/
			message.setSubject("Chegou o email enviado com JAVA");/*Assunto do email*/
			message.setText("Se você recebeu esse email porque está tudo ok");/*Corpo do email*/
			
			Transport.send(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
