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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
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
    private Hyperlink marca;
    @FXML
    private Hyperlink distribuidor;
    @FXML
    private Hyperlink pedido;
    @FXML
    private Hyperlink empleado;
    @FXML
    private Hyperlink sucursal;
    @FXML
    private Hyperlink direccionSucursal;
    @FXML
    private Hyperlink cliente;
    @FXML
    private Hyperlink direccionCliente;
    @FXML
    private AnchorPane principal;
    @FXML
    private AnchorPane anchorJuguete;
    @FXML
    private AnchorPane anchorMarca;
    @FXML
    private AnchorPane anchorDistribuidor;
    @FXML
    private AnchorPane anchorPedido;
    @FXML
    private AnchorPane anchorEmpleado;
    @FXML
    private AnchorPane anchorSucursal;
    @FXML
    private AnchorPane anchorDireccionSucursal;
    @FXML
    private AnchorPane anchorCliente;
    @FXML
    private AnchorPane anchorDireccionCliente;
    @FXML
    private TableView<ObservableList<String>> tablaJuguete;
    @FXML
    private TableView<ObservableList<String>> tablaMarca;
    @FXML
    private TableView<ObservableList<String>> tablaDistribuidor;
    @FXML
    private TableView<ObservableList<String>> tablaPedido;
    @FXML
    private TableView<ObservableList<String>> tablaEmpleado;
    @FXML
    private TableView<ObservableList<String>> tablaSucursal;
    @FXML
    private TableView<ObservableList<String>> tablaCliente;
    @FXML
    private Button regresarJuguete;

    @FXML
    private void muestraJuguete(ActionEvent e) throws SQLException {

        juguete.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorJuguete.setVisible(true);
        anchorJuguete.setDisable(false);
        agregaTabla(tablaJuguete, Juguete.selecciona());

    }

    @FXML
    private void agregaJuguete(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxCodigo = new HBox();
        HBox hboxNombre = new HBox();
        HBox hboxPrecio = new HBox();
        HBox hboxClasificacion = new HBox();
        Label codigo = new Label("Codigo de barras");
        Label nombre = new Label("Nombre");
        Label precio = new Label("Precio");
        Label clasificacion = new Label("Clasificacion");
        final TextField textCodigo = new TextField();
        final TextField textNombre = new TextField();
        final TextField textPrecio = new TextField();
        final TextField textClasificacion = new TextField();
        VBox vboxCenter = new VBox();
        Button agregar = new Button("Agregar");
        Button cancelar = new Button("Cancelar");

        hboxBottom.getChildren().addAll(agregar, cancelar);
        hboxCodigo.getChildren().addAll(codigo, textCodigo);
        hboxNombre.getChildren().addAll(nombre, textNombre);
        hboxPrecio.getChildren().addAll(precio, textPrecio);
        hboxClasificacion.getChildren().addAll(clasificacion, textClasificacion);
        vboxCenter.getChildren().addAll(hboxCodigo, hboxNombre, hboxPrecio, hboxClasificacion);

        cancelar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                stage.close();

            }
        });

        agregar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                
                try {
                int codigoAgrega = Integer.parseInt(textCodigo.getText());
                String nombreAgrega = textNombre.getText();
                double precioAgrega = Double.parseDouble(textPrecio.getText());
                int clasificacionAgrega = Integer.parseInt(textClasificacion.getText());

                Juguete juguete = new Juguete(codigoAgrega, nombreAgrega, precioAgrega, clasificacionAgrega);
                juguete.agregar();
                stage.close();
                    agregaTabla(tablaJuguete, Juguete.selecciona());
                } catch(SQLException sql) {
                    //poner error
                } catch(NumberFormatException number) {
                    //poner error
                }
                
                
            }
        });

        pane.setBottom(hboxBottom);
        pane.setCenter(vboxCenter);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

    }
    
    @FXML
    private void eliminaJuguete(ActionEvent e) throws SQLException {
        
        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxCenter = new HBox();
        Button eliminar = new Button("Eliminar");
        Button cancelar = new Button("Cancelar");
        Label codigo = new Label("Codigo de barras");
        final TextField codigoElimina = new TextField();
        
        hboxBottom.getChildren().addAll(eliminar,cancelar);
        hboxCenter.getChildren().addAll(codigo,codigoElimina);
        
        cancelar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                stage.close();

            }
        });
        
        eliminar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                
                try{
                int codigoEliminar = Integer.parseInt(codigoElimina.getText());
                Juguete juguete = new Juguete(codigoEliminar,null,0,0);
                juguete.eliminar();
                stage.close();
                    agregaTabla(tablaJuguete, Juguete.selecciona());
                } catch(SQLException sql) {
                    System.out.println("sql");
                    //poner error
                } catch(NumberFormatException number) {
                    System.out.println("number");
                    //poner error
                }
                
            }
        });
        
        pane.setBottom(hboxBottom);
        pane.setCenter(hboxCenter);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
        
    }

    @FXML
    private void muestraMarca(ActionEvent e) throws SQLException {

        marca.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorMarca.setVisible(true);
        anchorMarca.setDisable(false);
        agregaTabla(tablaMarca, Marca.selecciona());

    }

    @FXML
    private void muestraDistribuidor(ActionEvent e) throws SQLException {

        distribuidor.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorDistribuidor.setVisible(true);
        anchorDistribuidor.setDisable(false);
        agregaTabla(tablaDistribuidor, Distribuidor.selecciona());

    }

    @FXML
    private void muestraPedido(ActionEvent e) throws SQLException {

        pedido.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorPedido.setVisible(true);
        anchorPedido.setDisable(false);
        agregaTabla(tablaPedido, Pedido.selecciona());

    }

    @FXML
    private void muestraEmpleado(ActionEvent e) throws SQLException {

        empleado.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorEmpleado.setVisible(true);
        anchorEmpleado.setDisable(false);
        agregaTabla(tablaEmpleado, Empleado.selecciona());

    }

    @FXML
    private void muestraSucursal(ActionEvent e) throws SQLException {

        sucursal.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorSucursal.setVisible(true);
        anchorSucursal.setDisable(false);
        agregaTabla(tablaSucursal, Sucursal.selecciona());

    }

    @FXML
    private void muestraCliente(ActionEvent e) throws SQLException {

        cliente.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorCliente.setVisible(true);
        anchorCliente.setDisable(false);
        agregaTabla(tablaCliente, Cliente.selecciona());

    }

    @FXML
    private void salir(ActionEvent e) {

        Conexion.cerrar();
        System.exit(0);

    }

    @FXML
    private void regresar(ActionEvent e) {

        AnchorPane anchor = null;
        if (anchorJuguete.isVisible()) {
            anchor = anchorJuguete;
        } else if (anchorMarca.isVisible()) {
            anchor = anchorMarca;
        } else if (anchorDistribuidor.isVisible()) {
            anchor = anchorDistribuidor;
        } else if (anchorPedido.isVisible()) {
            anchor = anchorPedido;
        } else if (anchorEmpleado.isVisible()) {
            anchor = anchorEmpleado;
        } else if (anchorSucursal.isVisible()) {
            anchor = anchorSucursal;
        } else if (anchorCliente.isVisible()) {
            anchor = anchorCliente;
        }

        principal.setVisible(true);
        principal.setDisable(false);
        anchor.setVisible(false);
        anchor.setDisable(false);

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
            final TableColumn<ObservableList<String>, String> col = new TableColumn<ObservableList<String>, String>(columnas.get(i));
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
        /**
         * Connection c = null; try { Class.forName("org.sqlite.JDBC"); c =
         * DriverManager.getConnection("jdbc:sqlite:./lib/ricardo.db"); String
         * cadena = "INSERT INTO tabla (id_t) VALUES (1)"; Statement est =
         * c.createStatement(); est.executeUpdate(cadena); est.close();
         * //c.commit(); c.close(); } catch ( Exception e ) {
         * System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         * System.exit(0); } System.out.println("Opened database successfully");
  }
         */
    }
}
