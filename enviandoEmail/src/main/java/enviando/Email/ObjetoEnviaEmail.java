package enviando.Email;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ObjetoEnviaEmail {

	private String userName = "jeruso.nascimento@gmail.com";
	private String senha = "krhh izcu inzf ybcy";
	
	private String listaDestinatarios = "";
	private String nomeRemetente="";
	private String assuntoEmail= "";
	private String textoEmail = "";
	
	public ObjetoEnviaEmail(String listaDestinatario, String nomeRemetente, String assuntoEmail, String textoEmail ) {
		this.listaDestinatarios = listaDestinatario;
		this.nomeRemetente = nomeRemetente;
		this.assuntoEmail = assuntoEmail;
		this.textoEmail = textoEmail;		
	}

	public void enviarEmail() throws UnsupportedEncodingException, MessagingException {

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

		Address[] toUser = InternetAddress
				.parse(listaDestinatarios);

		Message message = new MimeMessage(session);

		message.setFrom(new InternetAddress(userName,nomeRemetente)); /* Quem está enviando */
		message.setRecipients(Message.RecipientType.TO, toUser); /* Quem vai receber */
		message.setSubject(assuntoEmail);/* Assunto do email */
		message.setText(textoEmail);/* Corpo do email */

		Transport.send(message);
	}

}
