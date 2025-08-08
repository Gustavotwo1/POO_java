import Model.Cliente;
import dao.ClienteDao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MenuClien_controller implements javafx.fxml.Initializable{
    
    @FXML
    private Button adicionarCli;

    @FXML
    private Button deletarCli;

    @FXML
    private Button editarCli;
    
    @FXML
    private TextField campo_idClien;

    @FXML
    private TextField campo_idClien1;

    @FXML
    private TableColumn<Cliente, String> emailCli;

    @FXML
    private TableColumn<Cliente, String> endereco;

    @FXML
    private TableColumn<Cliente, Integer> idClien;

    @FXML
    private TableView<Cliente> listarClientes;

    @FXML
    private TableColumn<Cliente, String> nomeCli;

    @FXML
    private TableColumn<Cliente, String> telefoneCli;

    @FXML
    private Button voltarMenu;

    public void initialize(URL location, ResourceBundle resources) {
        carregarClientes();
        
    }

    private void carregarClientes() {
        System.out.println("Carregando clientes...");
        ClienteDao dao = new ClienteDao();
        List<Cliente> clientes = dao.listarCli();      

        ObservableList<Cliente> lista = FXCollections.observableArrayList(clientes);

        //Ligando as colunas com os atributos
        idClien.setCellValueFactory(new PropertyValueFactory<>("idCl"));
        nomeCli.setCellValueFactory(new PropertyValueFactory<>("nameCl"));
        emailCli.setCellValueFactory(new PropertyValueFactory<>("emailCl"));
        endereco.setCellValueFactory(new PropertyValueFactory<>("addressCl"));
        telefoneCli.setCellValueFactory(new PropertyValueFactory<>("phoneCl"));

        //mostrando a lista 
        listarClientes.setItems(lista);
    }

    @FXML
    void adicionar_client(ActionEvent event) {
        try{

            App.trocarTela("clienteCadastro.fxml");

        }catch (Exception e) {

            e.printStackTrace();

        }   

    }

    @FXML
    void del_cliente(ActionEvent event) {
        String idCLien = campo_idClien.getText();


    }

    @FXML
    void editar_client(ActionEvent event) {
        String idCLien = campo_idClien1.getText();

    }

    @FXML
    void voltar_Menu(ActionEvent event) {
        try{

            App.trocarTela("menuCompleto.fxml");

        }catch (Exception e) {

            e.printStackTrace();

        }  

    }

}
