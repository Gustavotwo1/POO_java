import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class MenuComp_controller {

    @FXML
    private Button menuCli;

    @FXML
    private Button menuPro;

    @FXML
    private void entrar_menuCli(ActionEvent event){
        try{

            App.trocarTela("menuCliente.fxml");

        }catch (Exception e) {

            e.printStackTrace();

        }  
    };

    @FXML
    private void entrar_menuPro(ActionEvent event){
        try{

            App.trocarTela("menuProduto.fxml");

        }catch (Exception e) {

            e.printStackTrace();

        }
    };


}