package w18comp1011s1apr5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class AnonymousInnerClassExample extends Application
{
    
    @Override
    public void start(Stage primaryStage)
    {
        Button btn = new Button();
        String btnMessage = "Say 'Hello World'";
        btn.setText(btnMessage);
        
//        CustomButtonHandler cbh = new CustomButtonHandler();
//        btn.setOnAction(cbh);
     
                
        btn.setOnAction(new EventHandler<ActionEvent>()
        {       
            @Override
            public void handle(ActionEvent event)
            {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
