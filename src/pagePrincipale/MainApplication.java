package pagePrincipale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import pageAccueil.Model;
import pageAccueil.View;

public class MainApplication extends Application {

	@Override
	public void start(Stage primaryStage) {
		View vue = new View();
		Model mdl = new Model();
		
		vue.init(mdl);

		Scene scene = new Scene(vue, Color.WHITE);
		primaryStage.setTitle("Tapas");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);

		primaryStage.show();
	}
	
	public static void main (String[] args) {
		Application.launch(MainApplication.class);
	}
}
