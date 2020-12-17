/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author FP Mañana A
 */
public class TablasFX extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox v=new VBox(10);
        TableView<Persona> tabla=new TableView();
        TableColumn<Persona,String> colum_nombre=new TableColumn<>("Nombre");
        TableColumn<Persona,String> colum_apellido=new TableColumn<>("Apellio");
        tabla.getColumns().addAll(colum_nombre,colum_apellido);
        colum_nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colum_apellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        
        Persona p1 = new Persona("Juan", "Perez");
        Persona p2 = new Persona("Maria", "Loza");
        Persona p3 = new Persona("Adriana", "Mendez");
        tabla.getItems().addAll(p1,p2,p3);
        v.getChildren().addAll(tabla);
        Scene sc=new Scene(v,200,200);
        stage.setScene(sc);
        stage.show();
    }
    
}
