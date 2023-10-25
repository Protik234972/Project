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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class IrasController implements Initializable {

    @FXML
    private CheckBox hasScholarshipCheckBox;
    @FXML
    private TextField scholarshipTextField;
    @FXML
    private TextField studentIdTextField;
    @FXML
    private ComboBox<String> courseComboBox;
    @FXML
    private ComboBox<Integer> sectionComboBox;
    @FXML
    private TextField creditTextField;
    @FXML
    private TextArea resultTextArea;

    int credit[] = {3, 1, 3, 1, 3, 1, 3, 1, 3};
    ArrayList<Registration> register;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        scholarshipTextField.setDisable(true);
        hasScholarshipCheckBox.setDisable(true);
        register = new ArrayList<Registration>();

        courseComboBox.getItems().addAll("CSC101",
                "CSC101L",
                "CSE203",
                "CSE203L",
                "CSE213",
                "CSE213L",
                "CSE211",
                "CSE211L",
                "MAT203");

        sectionComboBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9);

    }

    @FXML
    private void courseRegisterButtonOnClicked(ActionEvent event) {

        if (hasScholarshipCheckBox.isSelected()) {
            register.add(
                    new Registration(
                            courseComboBox.getValue(),
                            sectionComboBox.getValue(),
                            credit[courseComboBox.getItems().indexOf(courseComboBox.getValue())],
                            Integer.parseInt(scholarshipTextField.getText())
                    ));
        } else if (femaleRadioButton.isSelected()) {
            register.add(
                    new Registration(
                            courseComboBox.getValue(),
                            sectionComboBox.getValue(),
                            credit[courseComboBox.getItems().indexOf(courseComboBox.getValue())],
                            Integer.parseInt(scholarshipTextField.getText())
                    )
            );

        } else {
            register.add(
                    new Registration(
                            courseComboBox.getValue(),
                            sectionComboBox.getValue(),
                            credit[courseComboBox.getItems().indexOf(courseComboBox.getValue())]
                    )
            );

        }

    }

    @FXML
    private void proceedRegisterButtonOnClicked(ActionEvent event) {
        resultTextArea.setText("");
        resultTextArea.appendText("Student ID  :   " + studentIdTextField.getText() + "  Scholarship :  " + hasScholarshipCheckBox.isSelected() + "  Per Credit Fee = 6000 Tk " + '\n');
        resultTextArea.appendText("Registerd Courses " + '\n');

        float total = 0;
        for (Registration eachItem : register) {
            resultTextArea.appendText(eachItem.toString() + '\n');
            total += eachItem.getAmount();
        }
        resultTextArea.appendText("\nTotal amount: " + total + " Tk");
    }

    @FXML
    private void selectCourseOnClicked(ActionEvent event) {
        String course = courseComboBox.getValue();

        creditTextField.setText(Integer.toString(credit[courseComboBox.getItems().indexOf(course)]));
    }

    @FXML
    private void hasScholarshipButtonOnClicked(ActionEvent event) {
        if (hasScholarshipCheckBox.isSelected()) {
            scholarshipTextField.setDisable(false);
            scholarshipTextField.clear();
        } else {
            if (femaleRadioButton.isSelected()) {
                scholarshipTextField.setText("20");
            }
            scholarshipTextField.setDisable(true);

        }
    }

    @FXML
    private void maleRadioButtonOnClicked(ActionEvent event) {
        femaleRadioButton.setSelected(false);
        scholarshipTextField.clear();
        hasScholarshipCheckBox.setDisable(false);

    }

    @FXML
    private void femaleRadioButtonOnClicked(ActionEvent event) {
        maleRadioButton.setSelected(false);
        scholarshipTextField.setText("20");
        hasScholarshipCheckBox.setDisable(false);

    }

    @FXML
    private void dropCourseOnClicked(ActionEvent event) {
        String selectedCourse = courseComboBox.getValue();
        int selectedSection = sectionComboBox.getValue();

        Registration registrationToRemove = null;
        for (Registration registration : register) {
            if (registration.getCourseTitle().equals(selectedCourse) && registration.getCourseSection() == selectedSection) {
                registrationToRemove = registration;
                break;
            }
        }

        if (registrationToRemove != null) {
            register.remove(registrationToRemove);
        }
    }

    @FXML
    private void resetButtonOnClicked(ActionEvent event) {

    }

}
