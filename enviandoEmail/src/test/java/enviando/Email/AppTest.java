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
	public void testeEmail() throws Exception {

		/*Nesse teste os parametros são destinatário, Nome de quem está enviando, assunto e mensagem*/
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("jerusoalves0@gmail.com", "Jeruso Alves",
				"Testando Email", "Esse é apenas um teste de email");
		
		enviaEmail.enviarEmail();
		/*
		 * caso de erro no envio coloque tempo na Thread --> descomente a linha abaixo
		 */
		Thread.sleep(1000);
	}

}
