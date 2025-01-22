package enviando.Email;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.Properties;

public class ObejetoEnviaEmail {

	private String userName = "jeruso.nascimento@gmail.com";
	private String senha = "krhh izcu inzf ybcy";

	private String listaDestinatarios;
	private String nomeRemetente;
	private String assuntoEmail;
	private String textoEmail;

	public ObejetoEnviaEmail(String listaDestinatarios, String nomeRemetente, String assuntoEmail, String textoEmail) {
        this.listaDestinatarios = listaDestinatarios;
        this.nomeRemetente = nomeRemetente;
        this.assuntoEmail = assuntoEmail;
        this.textoEmail = textoEmail;
    }

	public void enviarEmail(boolean envioHTML) {
		try {
			// Configure mail server properties
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls.enable", "true");
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", "587");
			properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");

			// Create a session with authentication
			Session session = Session.getInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(userName, senha);
				}
			});

			// Create email message
			Address[] toUser = InternetAddress.parse(listaDestinatarios);
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userName, nomeRemetente, "UTF-8"));
			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject(assuntoEmail);
			
			if(envioHTML) {
				message.setContent(textoEmail, "text/html; charset=utf-8");
			} else {
				message.setText(textoEmail);			
			}

			// Send email
			Transport.send(message);
			System.out.println("Email sent successfully to: " + listaDestinatarios);

		} catch (Exception e) {
			System.err.println("Failed to send email: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
