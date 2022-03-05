import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Interface.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Scene tela = new Scene(root);
            
            primaryStage.setTitle("Calculator by Geovani Debastiani");
            primaryStage.setScene(tela);
            primaryStage.show();        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}