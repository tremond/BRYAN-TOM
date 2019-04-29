package pageAccueil;

import javafx.scene.Scene;
import javafx.stage.Stage;
import pagePrincipale.ViewPrincipale;

public class WindowSwitcher {
	
	private static Stage _stage;
	
	public static void setStage(Stage stage) {
		_stage = stage;
	}
	
	public static void SwitchFenetre(String nomPage) {
		if (nomPage == "pageAcceuil") {
			ViewAcceuil vueAcceuil = new ViewAcceuil();
			vueAcceuil.init(new Model());
			
			Scene scene = new Scene(vueAcceuil, 800, 600);
			_stage.setScene(scene);
		}
		
		if (nomPage == "pagePrincipale") {
			ViewPrincipale vuePrincipale = new ViewPrincipale();
			vuePrincipale.init(new Model());
			
			Scene scene1 = new Scene(vuePrincipale, 800, 600);
			_stage.setScene(scene1);
		}
	}
}