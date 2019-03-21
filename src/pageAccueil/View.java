package pageAccueil;

import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class View extends VBox
{
	private Model _model;
	private VBox VboxUsers;
	private HBox Title;
 
	public View()
	{
		Text testtext = new Text("Ceci n'est pas un macdo");
		Text nbUsersText = new Text("Nombre de personnes :");
		this.setStyle("-fx-background-color: #fff;");
		HBox nbUsers = new HBox();
		
		Title = new HBox();
		Title.getChildren().add(testtext);
		this.getChildren().add(Title);
		
		final Spinner<Integer> spinner = new Spinner<Integer>();
		final int initialValue = 2;
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 4, initialValue);
		spinner.setValueFactory(valueFactory);
		nbUsers.getChildren().add(nbUsersText);
		nbUsers.getChildren().add(spinner);
		this.getChildren().add(nbUsers);
	}
	
	public void init(Model mdl)
	{
		_model = mdl;
	}
}
