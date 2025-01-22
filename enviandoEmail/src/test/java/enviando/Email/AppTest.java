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
        	
        	StringBuilder stringBuilderTextoEmail = new StringBuilder();
        	
        	stringBuilderTextoEmail.append("Olá <br/><br/>");
        	stringBuilderTextoEmail.append("Você está recebendo o seu acesso do seu curso de JAVA <br/><br/>");
        	stringBuilderTextoEmail.append("Para ter acesso click no botão abaixo<br/><br/>");
        	
        	stringBuilderTextoEmail.append("<a traget=\"_blanck\" href=\"https://projetojavaweb.com/certificado-aluno/login\">Acessar Portal do aluno</a>");
        	
        	
        	String destinatarios = "jerusoalves0@gmail.com, jeruso.nascimento@gmail.com";
        	
        	ObejetoEnviaEmail enviaEmail = new ObejetoEnviaEmail(
                    destinatarios, 
                    "Jeruso Alves Java", 
                    "Email enviado com JAVA", 
                    stringBuilderTextoEmail.toString()
            );

            enviaEmail.enviarEmail(true);

            // Simple assertion for demonstration (add meaningful assertions as needed)
            Assert.assertTrue("Email was sent successfully!", true);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Email sending failed: " + e.getMessage());
        }
    }
}
