package com.example.lab2;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
        private StackPane root = new StackPane();
        private Stage stage;

        @Override
        public void init() {
            Button button = new Button("OPEN");
            VBox vBox = new VBox();

            vBox.setSpacing(8);
            vBox.setPadding(new Insets(10, 10, 10, 10));
            TextField nameTextField = new TextField();
            TextField usernameTextField = new TextField();
            PasswordField passwordField = new PasswordField();
            PasswordField confirmPasswordField = new PasswordField();

            // ComboBox for a dropdown list
            ComboBox<String> countryComboBox = new ComboBox<>();
            countryComboBox.getItems().addAll("USA", "Canada", "UK", "Germany", "Other");
            countryComboBox.setPromptText("Select Country");

            // TextArea for additional comments
            TextArea commentsTextArea = new TextArea();
            commentsTextArea.setPromptText("Additional Comments");

            vBox.getChildren().addAll(
                    new Label("Your Name"),
                    nameTextField,
                    new Label("Your Username"),
                    usernameTextField,
                    new Label("Your Password"),
                    passwordField,
                    new Label("Confirm Password"),
                    confirmPasswordField,
                    new Label("Country"),
                    countryComboBox,
                    new Label("Comments"),
                    commentsTextArea,
                    new Button("REGISTER")
            );

            // Register button event handler (similar to the previous code)

            root.getChildren().addAll(vBox);

            button.setOnAction(actionEvent -> {
                if (stage != null) {
                    stage.requestFocus();
                    return;
                }
                stage = new Stage();
                StackPane stackPane = new StackPane();
                stage.setScene(new Scene(stackPane, 200, 200));
                stage.show();
            });
        }

        @Override
        public void start(Stage primaryStage) {
            Scene scene = new Scene(root, 400, 600);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setTitle("Registration Example JavaFX");
            primaryStage.setAlwaysOnTop(true);
        }

        public static void main(String[] args) {
            launch(args);
        }

    }