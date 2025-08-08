import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class clienteController {

    @FXML
    private TextField NomeCli;

    @FXML
    private TextField TelefoneCli;

    @FXML
    private TextField EnderecoCli;

    @FXML
    private TextField EmailCli;

    @FXML
    private Button salvarCLien;

    @FXML
    private Button cancelarCli;

    @FXML
    private Button voltar_menu;

    @FXML
    private void SalvarCliente(ActionEvent event) {
        // Aqui você pode fazer a lógica para salvar o cliente
        System.out.println("Cliente salvo:");
        System.out.println("Nome: " + NomeCli.getText());
        System.out.println("Telefone: " + TelefoneCli.getText());
        System.out.println("Endereço: " + EnderecoCli.getText());
        System.out.println("Email: " + EmailCli.getText());
    }

    @FXML
    private void cancelar_cadCliente(ActionEvent event) {
        System.out.println("Cadastro cancelado.");
        // aqui poderia limpar os campos, por exemplo
    }

    @FXML
    private void voltar_Menu(ActionEvent event) {
        System.out.println("Voltando ao menu...");
        // aqui pode chamar outra tela, se for o caso
    }
}
