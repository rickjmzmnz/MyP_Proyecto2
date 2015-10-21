/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.sql.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;

/**
 *
 * @author ricardo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Hyperlink salir;
    @FXML
    private Hyperlink juguete;
    @FXML
    private AnchorPane principal;
    @FXML
    private AnchorPane anchorJuguete;
    @FXML
    private TableView<ObservableList<String>> tablaJuguete;
    
    @FXML
    private void muestraJuguete(ActionEvent e) throws SQLException {
        
        principal.setVisible(false);
        principal.setDisable(false);
        anchorJuguete.setVisible(true);
        anchorJuguete.setDisable(false);
        agregaTabla(tablaJuguete,Juguete.selecciona());
        
    }
    
    @FXML
    private void salir(ActionEvent e) {
        Conexion.cerrar();
        System.exit(0);
    }
    
   /*private static void mostrarTabla(TableView<ObservableList<String>> tabla, ResultSet resultado) {
        
    }*/
     protected static void agregaTabla(TableView<ObservableList<String>> tabla, ResultSet resultado) throws SQLException {
        tabla.getColumns().clear();
        tabla.getItems().clear();
        final ResultSetMetaData datosResultado = resultado.getMetaData();
        List<String> columnas = new ArrayList<String>();
        for (int i = 1; i <= datosResultado.getColumnCount(); i++) {
            columnas.add(datosResultado.getColumnName(i).toUpperCase());
        }

        for (int i = 0; i < columnas.size(); i++) {
            final int j = i;
            final TableColumn<ObservableList<String>,String> col = new TableColumn<ObservableList<String>,String>(columnas.get(i));
            col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList<String>, String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<ObservableList<String>, String> param) {
                    return new SimpleStringProperty(param.getValue().get(j).toString());
                }
            });
            col.setMinWidth(150);
            tabla.getColumns().add(col);
            //tabla.getColumns().add(col);
        }

        ObservableList<String> colum;
        while (resultado.next()) {
            colum = FXCollections.observableArrayList();
            for (int j = 1; j <= columnas.size(); j++) {
                if (datosResultado.getColumnType(j) == Types.INTEGER) {
                    Integer entero = resultado.getInt(j);
                    colum.add(entero.toString());
                } else {
                    colum.add(resultado.getString(j));
                }
            }
            tabla.getItems().add(colum);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO 
    /**  Connection c = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:./lib/ricardo.db");
      String cadena = "INSERT INTO tabla (id_t) VALUES (1)";
      Statement est = c.createStatement();
      est.executeUpdate(cadena);
      est.close();
      //c.commit();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
  }*/
    }    
}

