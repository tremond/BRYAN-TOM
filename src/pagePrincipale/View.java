package pagePrincipale;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import pageAccueil.Model;

public class View extends GridPane {
	
	private Model _model;
	
	
	public void init(Model mdl) {
		_model = mdl;
	}
	
	public View() {
		Text title = new Text("Historique de commandes");
		Tab tab1 = new Tab("Onglet 1");
		Tab tab2 = new Tab("Onglet 2");
		TabPane containerTab = new TabPane();
		containerTab.getTabs().setAll(tab1, tab2);
		
		
		this.add(title, 0, 0);
		this.add(containerTab, 0, 1);
		this.setPrefSize(420, 420);
	
	}
}

