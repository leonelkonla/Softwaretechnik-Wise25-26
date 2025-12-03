package view;
import controller.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.RED;


public class LoginView extends Application {

    @Override
    public void start(Stage stage){

        Image backgroundImage = new Image(getClass().getResource("/loginimg.jpg").toExternalForm());
        ImageView backgroundView = new ImageView(backgroundImage);

        Label title = new Label("Login");

        TextField usernameField = new TextField();
        usernameField.setMaxWidth(200);
        usernameField.setPromptText("Benutzername");

        PasswordField passwordField = new PasswordField();
        passwordField.setMaxWidth(200);
        passwordField.setPromptText("Passwort");

        Button loginButton = new Button("Login");
        loginButton.setMaxWidth(200);

        Label falsch = new Label("Nutzername oder Passwort falsch!");
        falsch.setTextFill(RED);
        falsch.setVisible(false);

        AuthController controller = new AuthController();

        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if(controller.inputVal(username, password)){

                controller.navigateToMainMenu(stage);

            }else{
                falsch.setVisible(true);
            }
        });



        VBox layoutV = new VBox(10);
        layoutV.getChildren().addAll(title, usernameField, passwordField, loginButton, falsch);
        layoutV.setAlignment(Pos.CENTER);


        StackPane root = new StackPane();

        root.getChildren().addAll(backgroundView, layoutV);


        Scene scene = new Scene(root, 900, 600);



        stage.setTitle("Anmeldung FitnessTracker");
        stage.setScene(scene);
        stage.show();
    }
}
