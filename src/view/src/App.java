import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    //referencia a janela principal
    private static Stage stage;
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/loginPrincipal.fxml"));
        primaryStage.setTitle("Tela de Login");

        //definindo e exibindo o layout carregado
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    /*trocando a tela com o parametro */
    public static void trocarTela(String fxml)throws Exception{
        Parent pane = FXMLLoader.load(App.class.getResource(fxml));
        stage.setScene(new Scene(pane));

    }
}
