import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.image.Image;

public class App extends Application {
    public static void main(String[] args) throws Exception {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            primaryStage.initStyle(StageStyle.UNDECORATED);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Interface.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Scene tela = new Scene(root);
            tela.getStylesheets().add("styles.css");

            primaryStage.setTitle("Calculator by Geovani Debastiani");
            primaryStage.setScene(tela);
            primaryStage.show();        

            Image imagem = new Image("Calculadora.png");

            primaryStage.getIcons().add(imagem);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
