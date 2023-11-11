/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class MainSceneController implements Initializable {

    @FXML
    private ComboBox<?> selectProductComboBox;
    @FXML
    private ComboBox<?> quantityComboBox;
    @FXML
    private TextField maximumProductCostTextField;
    @FXML
    private ComboBox<?> selectVatComboBox;
    @FXML
    private Label totalVatAmountOutputLabel;
    @FXML
    private Label unitPriceLabel;
    @FXML
    private Label predefinedVatLabel;
    @FXML
    private TableView<?> cartItemsTableView;
    @FXML
    private TableColumn<?, ?> productCol;
    @FXML
    private TableColumn<?, ?> unitCol;
    @FXML
    private TableColumn<?, ?> quantityCol;
    @FXML
    private TableColumn<?, ?> vatCol;
    @FXML
    private TableColumn<?, ?> vatAmountCol;
    @FXML
    private TableColumn<?, ?> totallAmountCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void selectProductComboBoxOnItemSelected(ActionEvent event) {
    }

    @FXML
    private void addProductToCartButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void checkOutAndShowBillButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void showTotalVatForQualifiedProductsButtonOnClick(ActionEvent event) {
    }
    
}
