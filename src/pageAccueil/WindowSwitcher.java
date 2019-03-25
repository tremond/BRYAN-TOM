package pageAccueil;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class WindowSwitcher {
	
	private static Stage _stage;
	
	public static void setStage(Stage stage) {
		_stage = stage;
	}
	
	public static void SwitchFenetre(String nomPage) {
		if (nomPage == "pageAcceuil") {
			View vueAcceuil = new View();
			vueAcceuil.init(new Model());
			
			Scene scene = new Scene(vueAcceuil, 800, 600);
			_stage.setScene(scene);
		}
		
		else if(nomPage == "pagePrincipale") {
			/*View vuePrincipale = new View();
			vuePrincipale.init(new Model());*/
		}
	}
}