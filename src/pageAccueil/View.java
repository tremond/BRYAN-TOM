package pageAccueil;

import javafx.event.ActionEvent;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.event.*;

public class View extends VBox
{
	private Model _model;
	private VBox vboxUsers;
	private HBox Title;
 
	public View()
	{
		Text testtext = new Text("Ceci n'est pas un macdo");
		Text nbUsersText = new Text("Nombre de personnes :");
		Text convive = new Text("Convive n°");
		TextField name = new TextField();
		this.setStyle("-fx-background-color: #fff;");
		HBox nbUsers = new HBox();
		
		final ColorPicker colorPicker = new ColorPicker();
        colorPicker.setValue(Color.RED);
 
        final Circle circle = new Circle(50);
        circle.setFill(colorPicker.getValue());
 
        colorPicker.setOnAction(new EventHandler<ActionEvent>() {
        	
        	@Override
            public void handle(ActionEvent event) {
                circle.setFill(colorPicker.getValue());
            }
        });
		
		
		Title = new HBox();
		Title.getChildren().add(testtext);
		this.getChildren().add(Title);
		
		vboxUsers = new VBox();
		
		
		final Spinner<Integer> spinner = new Spinner<Integer>();
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 4) {
			 @Override
             public void decrement(int steps) {
                 
             }

             @Override
             public void increment(int steps) {
	            	 HBox users = new HBox();
	            	 users.getChildren().add(convive);
	            	 users.getChildren().add(name);
	            	 users.getChildren().add(circle);
	            	 users.getChildren().add(colorPicker);
	            	 vboxUsers.getChildren().add(users);
             }
		};
		spinner.setValueFactory(valueFactory);
		nbUsers.getChildren().add(nbUsersText);
		nbUsers.getChildren().add(spinner);
		this.getChildren().add(nbUsers);
		
		this.getChildren().add(vboxUsers);
		
		
	}
	
	public void init(Model mdl)
	{
		_model = mdl;
	}
}
