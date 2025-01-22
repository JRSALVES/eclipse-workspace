package enviando.Email;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for the ObjetoEnviaEmail class.
 */
public class AppTest {

	@Test
	public void testeEmail() {
		try {

			//Creating the email body message
			StringBuilder stringBuilderTextoEmail = new StringBuilder();

			stringBuilderTextoEmail.append("Olá <br/><br/>");//Email body
			stringBuilderTextoEmail.append("Você está recebendo o seu acesso do seu curso Preparatórios para Polícia Civil do Estado de São Paulo <br/><br/>");//Email body
			stringBuilderTextoEmail.append("Para ter acesso click no botão abaixo<br/><br/>");//Email body
			
			stringBuilderTextoEmail.append("<b>Login:<b/> jeruso@gmail.com<br/>");
			stringBuilderTextoEmail.append("<b>Senha:<b/> irgteb65&<br/><br/>");


			//Creating and formatting the button with a link to the desired page
			stringBuilderTextoEmail.append(
					"<a traget=\"_blanck\" href=\"https://projetojavaweb.com/certificado-aluno/login\" style=\"color:#2525a7; padding: 14px 25px; text-align:center; text-decoration: none; display:inline-block; border-radius: 30px; font-size: 20px; font-family: courrier; border:3px solid green; background-color: #99DA39;\">Acessar Portal do aluno</a><br/><br/>");

			stringBuilderTextoEmail.append("<span style=\"font-size: 10px\">Ass.: Jeruso A. Nascimento</span>");

			String destinatarios = "jerusoalves0@gmail.com, jeruso.nascimento@gmail.com"; //Field to enter recipients

			//Creating issuer name and subject
			ObejetoEnviaEmail enviaEmail = new ObejetoEnviaEmail(destinatarios, "Jeruso Curso Java",
					"Teste envio e-mail com Java", stringBuilderTextoEmail.toString());

			enviaEmail.enviarEmail(true);

			// Simple assertion for demonstration (add meaningful assertions as needed)
			Assert.assertTrue("Email was sent successfully!", true);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Email sending failed: " + e.getMessage());
		}
	}
}
