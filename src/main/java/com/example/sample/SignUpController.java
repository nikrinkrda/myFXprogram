package com.example.sample;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.sample.animations.Shake;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private TextField password_field;

    @FXML
    private Button signUpButton;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private TextField signUpCountry;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField signUpName;

    @FXML
    void initialize() {
        DatabaseHandler dbHander = new DatabaseHandler();

        signUpButton.setOnAction(event -> {
            signUpNewUser();

        });
    }

    private void signUpNewUser() {
        DatabaseHandler dbHander = new DatabaseHandler();

        String firstname = signUpName.getText();
        String lastname = signUpLastName.getText();
        String username = login_field.getText();
        String password = password_field.getText();
        String location = signUpCountry.getText();
        String gender = "";
        if(signUpCheckBoxMale.isSelected()){
            gender = "Мужской";
        }else
            gender = "Женский";
        User user = new User(firstname, lastname, username, password, location, gender);

        Shake sAB = new Shake(signUpButton);
        sAB.playAnim();

        dbHander.signUpUser(user);
    }

}
