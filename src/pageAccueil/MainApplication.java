package pageAccueil;

import javafx.application.Application;
import javafx.stage.Stage;
import metier.Client;
import session.SessionManager;

public class MainApplication extends Application
{
	public void start(Stage primaryStage)
	{
		WindowSwitcher.setStage(primaryStage);
		WindowSwitcher.SwitchFenetre("pageAcceuil");
		primaryStage.setTitle("Tapas");

		primaryStage.show();
	}

    public static void main(String[] args)
    {
    	Application.launch(MainApplication.class, args);
    }
}