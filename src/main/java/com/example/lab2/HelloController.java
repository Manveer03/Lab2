package com.example.lab2;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private ComboBox<String> genderComboBox;

    @FXML
    private ComboBox<String> countryComboBox;

    @FXML
    private void handleSubmitButtonAction() {
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        String gender = genderComboBox.getValue();
        String country = countryComboBox.getValue();

        // You can perform validation and further processing here
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Country: " + country);
    }
}
