package wordgraph;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author qiusuo
 */
public class WordGraph extends Application {
    @Override
    /**
     * .
     */
    public void start(final Stage stage) throws Exception {
        final Parent root = FXMLLoader.load(
            getClass().getResource("FXMLDocument.fxml"));
        final Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        launch(args);
    }
}
