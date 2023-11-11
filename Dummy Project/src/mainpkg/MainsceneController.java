/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class MainsceneController implements Initializable {

    @FXML
    private TextField hTextField;
    @FXML
    private TextField yTextField;
    @FXML
    private TableView<?> table;
    @FXML
    private TableColumn<?, ?> hello;
    @FXML
    private TableColumn<?, ?> h;
    @FXML
    private TextField zTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
