import Model.Produto;
import dao.ProdutoDao;

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

public class MenuProd_controller implements javafx.fxml.Initializable {

    @FXML
    private Button adicionarPro;

    @FXML
    private TextField campo_idPro;

    @FXML
    private TextField campo_idPro1;

    @FXML
    private Button deletarPro;

    @FXML
    private TableColumn<Produto, String> descricaoPro;

    @FXML
    private Button editarpro;

    @FXML
    private TableColumn<Produto, Double> estoquePro;

    @FXML
    private TableColumn<Produto, Integer> idPro;

    @FXML
    private TableView<Produto> listar_prod;

    @FXML
    private TableColumn<Produto, String> nomePro;

    @FXML
    private TableColumn<Produto, Double> precoPro;

    @FXML
    private Button voltarMenu;
        public void initialize(URL location, ResourceBundle resources) {
        carregarProduto();
    }

    private void carregarProduto() {
        System.out.println("Carregando Produto...");
        ProdutoDao dao = new ProdutoDao();
        List<Produto> produtos = dao.listarProd();  
        
        ObservableList<Produto> lista = FXCollections.observableArrayList(produtos);

        // Ligando as colunas com os atributos
        
        idPro.setCellValueFactory(new PropertyValueFactory<>("idPr"));
        nomePro.setCellValueFactory(new PropertyValueFactory<>("namePr"));
        descricaoPro.setCellValueFactory(new PropertyValueFactory<>("descriptionPr"));
        precoPro.setCellValueFactory(new PropertyValueFactory<>("pricePr"));
        estoquePro.setCellValueFactory(new PropertyValueFactory<>("stockPr"));

        //mostrar na tabela
        listar_prod.setItems(lista);

    }

    @FXML
    void adicionar_Prod(ActionEvent event) {

    }

    @FXML
    void del_pro(ActionEvent event) {

    }

    @FXML
    void editar_prod(ActionEvent event) {

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
