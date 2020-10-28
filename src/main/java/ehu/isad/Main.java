package ehu.isad;

import ehu.isad.controller.ui.StudentsController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

  private Parent studentsControllerUI;
  private StudentsController studentsControllerKud;
  private Scene scene;
  private Stage stage;

  @Override
  public void start(Stage primaryStage) throws Exception {

    stage = primaryStage;
    pantailakKargatu();

    stage.setTitle("Argazki Backup");
    stage.setScene(scene);
    stage.show();
  }

  private void pantailakKargatu() throws IOException {
    FXMLLoader loaderKautotu = new FXMLLoader(getClass().getResource("/taula.fxml"));
    studentsControllerUI = (Parent) loaderKautotu.load();
    studentsControllerKud = loaderKautotu.getController();
    studentsControllerKud.setMainApp(this);
    scene=new Scene(studentsControllerUI);
  }


  public static void main(String[] args) {
    launch(args);
  }

}
