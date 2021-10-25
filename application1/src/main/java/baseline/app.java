package baseline;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Application {

    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Application.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("Addition");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}