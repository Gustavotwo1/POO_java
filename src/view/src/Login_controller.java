import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Login_controller{

    @FXML
    private Button botaoEntrar;

    @FXML
    private TextField campoSenha;

    @FXML
    private TextField campoUSuario;

    @FXML
    void fazerLogin(ActionEvent event) {
        String usuario = campoUSuario.getText();
        String senha = campoSenha.getText();

        if(usuario.equals("gustavo") && senha.equals("1234")){
            System.out.println("login feito com sucesso!!");

        }else{
            System.out.println("usuario ou senha incorretos");

        }
    }

}
