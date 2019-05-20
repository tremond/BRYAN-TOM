package pageAccueil;

import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import metier.Client;

import com.sun.xml.internal.bind.v2.runtime.Name;

import connexion.pageDeConnexion;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ViewAcceuil extends VBox
{
	private Model _model;
	private VBox vboxUsers;
	private HBox Title;
	private Button valideCommande; 
 
	public ViewAcceuil()
	{
		Text testtext = new Text("Ceci n'est pas un macdo");
		Text nbUsersText = new Text("Nombre de personnes :");
		Button valideCommande = new Button("Valider");

		this.setStyle("-fx-background-color: #fff;");
		HBox nbUsers = new HBox();
		this.setPrefSize(800, 600);
		
		Title = new HBox();
		Title.getChildren().add(testtext);
		this.getChildren().add(Title);
		
		vboxUsers = new VBox();
		
		final Spinner<Integer> spinner = new Spinner<Integer>();
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 4, 1);
		spinner.setValueFactory(valueFactory);
		createConvive();
		
		// When spinner change value.
        spinner.valueProperty().addListener(new ChangeListener<Integer>() {
 
			@Override
			public void changed(ObservableValue<? extends Integer> arg0, Integer oldValue, Integer newValue) {
				if(oldValue < newValue)
				{
					createConvive();
				}
				else
				{
					vboxUsers.getChildren().remove(vboxUsers.getChildren().size()-1);
				}
			}
        });
        
        valideCommande = new Button("Valider");
    	valideCommande.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent arg0) {
    			validationClient();
    			Client.save();
       			//WindowSwitcher.SwitchFenetre("pagePrincipale");
    			
    		}
    	});
        
		nbUsers.getChildren().add(nbUsersText);
		nbUsers.getChildren().add(spinner);
		this.getChildren().add(nbUsers);
		this.getChildren().add(vboxUsers);
		this.getChildren().add(valideCommande);
		
	}
	
	public void init(Model mdl)
	{
		_model = mdl;
	}
	
	public void createConvive()
	{
		HBox users = new HBox();
		final ColorPicker colorPicker = new ColorPicker();
		
		Text convive = new Text("Entrez votre nom : ");
		TextField name = new TextField();
 		
    	users.getChildren().add(convive);
    	users.getChildren().add(name);
    	users.getChildren().add(colorPicker);
    	System.out.println(colorPicker.getValue());
    	vboxUsers.getChildren().add(users);
	}
	
	public void validationClient() {
		for (int i = 0; i < vboxUsers.getChildren().size(); i++ ) {
			
			HBox ligne = (HBox)vboxUsers.getChildren().get(i);
			TextField nom = (TextField)ligne.getChildren().get(1);
			String nomClient = nom.getText();
			
			ColorPicker choixCouleur = (ColorPicker) ligne.getChildren().get(2);
			String couleurClient = Integer.toHexString(choixCouleur.getValue().hashCode());
			
			System.out.println(nomClient);
			System.out.println(couleurClient);
		}
	}
}
