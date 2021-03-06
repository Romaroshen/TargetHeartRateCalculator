import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TargetHeartRatesMainApp extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TargetHeartRatesCalculator.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setTitle("Target Heart Rates Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

}
