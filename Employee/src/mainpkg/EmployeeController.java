/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class EmployeeController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField salaryTextField;
    @FXML
    private RadioButton maleRadionButton;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private ComboBox<String> designationComboBox;
    @FXML
    private ComboBox<String> deptComboBox;
    @FXML
    private DatePicker dobDatePicker;
    @FXML
    private DatePicker dojDatePicker;
    @FXML
    private TextArea showResultTextArea;
    @FXML
    private Label countResultLabel;
    @FXML
    private ComboBox<String> searchDeptComboBox;
    @FXML
    private TextField lowerBoundSalaryTextField;
    @FXML
    private TextField upperBoundSalaryTextField;
    @FXML
    private TextArea showAvgSalaryTextField;

    /**
     * Initializes the controller class.
     */
    private ArrayList<Employee> emp;
    ToggleGroup tg;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        emp = new ArrayList<Employee>();
        
        designationComboBox.getItems().addAll("Executive", "Junior Officer", "Senior Officer", "Accountant","HR Manager", "Director", "Engineer");
        designationComboBox.setValue("Select Designation");
        deptComboBox.getItems().addAll("Accounts", "HR", "Admin", "Sales", "Production");
         deptComboBox.setValue("Select Department");   
        searchDeptComboBox.getItems().addAll("Accounts", "HR", "Admin", "Sales", "Production");
        searchDeptComboBox.setValue("Select Department");
        
        tg = new ToggleGroup();
        maleRadionButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);
        
    }    

    @FXML
    private void addNewEmployeeButtonOnClicked(ActionEvent event) {
        
        
        for(Employee empy : emp){
            if (empy.getId() == Integer.parseInt(idTextField.getText())){
            
               Alert a = new Alert(Alert.AlertType.ERROR) ;
               a.setContentText("Alert !Duplicate Id , Try again with proper ID");
               a.showAndWait();
               
                idTextField.clear();
                nameTextField.clear();
                salaryTextField.clear();
                designationComboBox.setValue("Select Designation");
                deptComboBox.setValue("Select Department"); 
                
                return ;
               
            }
        
        }
        
        Employee employee =new Employee(Integer.parseInt(idTextField.getText()),
                                         nameTextField.getText(),
                                         maleRadionButton.isSelected()? "Male":"Female",
                                         deptComboBox.getValue(),
                                        Float.parseFloat(salaryTextField.getText()),
                                        designationComboBox.getValue(),
                                        dobDatePicker.getValue(),
                                        dojDatePicker.getValue());
        
        
        emp.add(employee);
        countResultLabel.setText("After Addition there are TOTAL " + emp.size() + " Employees as shown Below");
        
        for(Employee e : emp){
        showResultTextArea.appendText(e.toString());
        
        }
        
        idTextField.clear();
        nameTextField.clear();
        salaryTextField.clear();
        

    }

    @FXML
    private void showAvgSalaryButtonOnClicked(ActionEvent event) {
        
        
        
        
    }
    
}
