import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListView extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
       
        AnchorPane root = new AnchorPane();
        Scene escena = new Scene(root,400,135);
        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL);
        
        ListView<String> listView = new ListView<String>(FXCollections.observableArrayList("Minions","Elvis","Lightyear","Wakanda por siempre","Calle del terror"));
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView.setFixedCellSize(-1);
        flowPane.getChildren().add(listView);
        root.getChildren().add(flowPane);

        arg0.setTitle("Pelicuals de Cartelera");
        arg0.setScene(escena);
        arg0.show();
    }
}