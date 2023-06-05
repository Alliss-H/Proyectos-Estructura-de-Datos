import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Menu extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {

        AnchorPane root = new AnchorPane();
        Scene escena = new Scene(root, 450, 200);

        Menu menu = new Menu("Game");
        MenuItem itmenuFile1 = new MenuItem("New");
        MenuItem itmenuFile2 = new MenuItem("Pause");
        MenuItem itmenuFile3 = new MenuItem("Play");
        MenuItem itmenuFile4 = new MenuItem("Exit");
        Menu menu2 = new Menu("Options");
        MenuItem itmenuEdit1 = new MenuItem("Undo");
        MenuItem itmenuEdit2 = new MenuItem("Redo");
        Menu menu3 = new Menu("View");
        Menu subAperiencia = new Menu("Apparence");
        RadioMenuItem ligth = new RadioMenuItem("Ligth mode");
        RadioMenuItem dark = new RadioMenuItem("Dark mode");
        ToggleGroup toggle1 = new ToggleGroup();
        Menu font = new Menu("Font");
        CheckMenuItem bold = new CheckMenuItem("Bold");
        CheckMenuItem italic = new CheckMenuItem("Italic");
        CheckMenuItem underline = new CheckMenuItem("Underline");

        MenuBar mainbar = new MenuBar();
        
        menu.getItems().addAll(itmenuFile1,itmenuFile2,itmenuFile3,itmenuFile4);
        menu2.getItems().addAll(itmenuEdit1,itmenuEdit2,font);
        ligth.setToggleGroup(toggle1);
        ligth.setSelected(true);
        dark.setToggleGroup(toggle1);
        font.getItems().addAll(bold,italic,underline);
        menu3.getItems().add(subAperiencia);
        subAperiencia.getItems().addAll(ligth,dark);
        mainbar.getMenus().addAll(menu,menu2,menu3);
        root.getChildren().add(mainbar);


        arg0.setTitle("Menu Test_Allisson");
        arg0.setScene(escena);
        arg0.show();
    }
    
}