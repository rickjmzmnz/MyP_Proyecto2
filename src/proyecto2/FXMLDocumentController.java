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
import javafx.scene.control.CheckBox;
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
    private AnchorPane anchorDistribuye;
    @FXML
    private AnchorPane anchorRealizaCompra;
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
    private TableView<ObservableList<String>> marcaDistribuye;
    @FXML
    private TableView<ObservableList<String>> distribuyeA;
    @FXML
    private TableView<ObservableList<String>> realizaCompra;
    @FXML
    private TableView<ObservableList<String>> clienteCompra;
    @FXML
    private Button regresarJuguete;
    @FXML
    private Button aplicarMarca;
    @FXML
    private Button aplicarCliente;
    @FXML
    private TextField idMarcaDistribuye;
    @FXML
    private TextField idDistribuidorDistribuye;
    @FXML
    private TextField idClienteCompra;
    @FXML
    private TextField idPedidoCompra;
    @FXML
    private CheckBox agregarDistribuye;
    boolean marcabool = true;
    @FXML
    private CheckBox agregarCompra;
    boolean clientebool = true;
    
    /**
     * Método para mostrar la tabla distribuyeA
     * @param e 
     * @throws SQLException 
     */
    @FXML
    private void relacionDistribuye(ActionEvent e) throws SQLException {

        if (anchorDistribuidor.isVisible()) {
            marcabool = false;
            anchorDistribuidor.setVisible(false);
            anchorDistribuidor.setDisable(true);
            anchorDistribuye.setVisible(true);
            anchorDistribuye.setDisable(false);
            agregaTabla(distribuyeA, DistribuyeA.selecciona());
            agregaTabla(marcaDistribuye, Marca.selecciona());
        } else if (anchorMarca.isVisible()) {
            marcabool = true;
            anchorMarca.setVisible(false);
            anchorMarca.setDisable(true);
            anchorDistribuye.setVisible(true);
            anchorDistribuye.setDisable(false);
            agregaTabla(distribuyeA, DistribuyeA.selecciona());
            agregaTabla(marcaDistribuye, Distribuidor.selecciona());
        }

    }

    /**
     * Método para agregar un elemento a la relacion distribuyeA
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void agregaDistribuye(ActionEvent e) throws SQLException {
        if (!marcabool) {
            anchorDistribuidor.setVisible(true);
            anchorDistribuidor.setDisable(false);
            anchorDistribuye.setVisible(false);
            anchorDistribuye.setDisable(true);

            if (agregarDistribuye.isSelected()) {

                int marca = Integer.parseInt(idMarcaDistribuye.getText());
                int distribuidor = Integer.parseInt(idDistribuidorDistribuye.getText());

                DistribuyeA distribuye = new DistribuyeA(marca, distribuidor);
                distribuye.agregar();

                agregarDistribuye.setSelected(false);

            }
        }else if (marcabool) {
                anchorMarca.setVisible(true);
                anchorMarca.setDisable(false);
                anchorDistribuye.setVisible(false);
                anchorDistribuye.setDisable(true);

                if (agregarDistribuye.isSelected()) {

                    int marcaEnt = Integer.parseInt(idMarcaDistribuye.getText());
                    int distribuidorEnt = Integer.parseInt(idDistribuidorDistribuye.getText());
                    System.out.println(marcaEnt);
                    System.out.println(distribuidorEnt);
                    DistribuyeA distribuye = new DistribuyeA(marcaEnt, distribuidorEnt);
                    distribuye.agregar();

                    agregarDistribuye.setSelected(false);
                }

            }

    }
    
    /**
     * Método para mostrar la tabla realizaCompra
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void relacionRealizaCompra(ActionEvent e) throws SQLException {

        if (anchorCliente.isVisible()) {
            clientebool = false;
            anchorCliente.setVisible(false);
            anchorCliente.setDisable(true);
            anchorRealizaCompra.setVisible(true);
            anchorRealizaCompra.setDisable(false);
            agregaTabla(realizaCompra, RealizaCompra.selecciona());
            agregaTabla(clienteCompra, Cliente.selecciona());
        } else if (anchorPedido.isVisible()) {
            clientebool = true;
            anchorPedido.setVisible(false);
            anchorPedido.setDisable(true);
            anchorRealizaCompra.setVisible(true);
            anchorRealizaCompra.setDisable(false);
            agregaTabla(realizaCompra, RealizaCompra.selecciona());
            agregaTabla(clienteCompra, Cliente.selecciona());
        }

    }
    
    /**
     * Método para agregar a la tabla realizaCompra
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void agregaCompra(ActionEvent e) throws SQLException {        
        if (!clientebool) {
            anchorCliente.setVisible(true);
            anchorCliente.setDisable(false);
            anchorRealizaCompra.setVisible(false);
            anchorRealizaCompra.setDisable(true);

            if (agregarCompra.isSelected()) {

                int cliente = Integer.parseInt(idClienteCompra.getText());
                int pedido = Integer.parseInt(idPedidoCompra.getText());

                RealizaCompra compra = new RealizaCompra(pedido, cliente);
                compra.agregar();

                agregarCompra.setSelected(false);

            }
        }else if (clientebool) {
                anchorPedido.setVisible(true);
                anchorPedido.setDisable(false);
                anchorRealizaCompra.setVisible(false);
                anchorRealizaCompra.setDisable(true);

                if (agregarCompra.isSelected()) {

                    int cliente2 = Integer.parseInt(idClienteCompra.getText());
                    int pedido2 = Integer.parseInt(idPedidoCompra.getText());
                   
                    RealizaCompra compra2 = new RealizaCompra(pedido2, cliente2);
                    compra2.agregar();

                    agregarCompra.setSelected(false);
                }

            }
        
        
        
    }

    /**
     * Método para mostrar la tabla juguete
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void muestraJuguete(ActionEvent e) throws SQLException {

        juguete.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorJuguete.setVisible(true);
        anchorJuguete.setDisable(false);
        agregaTabla(tablaJuguete, Juguete.selecciona());

    }

    /**
     * Método para agregar datos a la tabla juguete
     * @param e
     * @throws SQLException 
     */
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
                } catch (SQLException sql) {
                    //poner error
                } catch (NumberFormatException number) {
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

    /**
     * Método para eliminar datos de la tabla juguete
     * @param e
     * @throws SQLException 
     */
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

        hboxBottom.getChildren().addAll(eliminar, cancelar);
        hboxCenter.getChildren().addAll(codigo, codigoElimina);

        cancelar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                stage.close();

            }
        });

        eliminar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                try {
                    int codigoEliminar = Integer.parseInt(codigoElimina.getText());
                    Juguete juguete = new Juguete(codigoEliminar, null, 0, 0);
                    juguete.eliminar();
                    stage.close();
                    agregaTabla(tablaJuguete, Juguete.selecciona());
                } catch (SQLException sql) {
                    System.out.println("sql");
                    //poner error
                } catch (NumberFormatException number) {
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

    /**
     * Método para mostrar la tabla marca
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void muestraMarca(ActionEvent e) throws SQLException {

        marca.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorMarca.setVisible(true);
        anchorMarca.setDisable(false);
        agregaTabla(tablaMarca, Marca.selecciona());

    }

    /**
     * Método para agregar datos a la tabla marca
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void agregaMarca(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxId = new HBox();
        HBox hboxNombre = new HBox();
        Label id = new Label("ID Marca");
        Label nombre = new Label("Nombre");
        final TextField textId = new TextField();
        final TextField textNombre = new TextField();
        VBox vboxCenter = new VBox();
        Button agregar = new Button("Agregar");
        Button cancelar = new Button("Cancelar");

        hboxBottom.getChildren().addAll(agregar, cancelar);
        hboxId.getChildren().addAll(id, textId);
        hboxNombre.getChildren().addAll(nombre, textNombre);
        vboxCenter.getChildren().addAll(hboxId, hboxNombre);

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
                    int idAgrega = Integer.parseInt(textId.getText());
                    String nombreAgrega = textNombre.getText();

                    Marca marca = new Marca(idAgrega, nombreAgrega);
                    marca.agregar();
                    stage.close();
                    agregaTabla(tablaMarca, Marca.selecciona());
                } catch (SQLException sql) {
                    //poner error
                } catch (NumberFormatException number) {
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

    /**
     * Método para eliminar datos de la tabla marca
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void eliminaMarca(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxCenter = new HBox();
        Button eliminar = new Button("Eliminar");
        Button cancelar = new Button("Cancelar");
        Label id = new Label("ID Marca");
        final TextField idElimina = new TextField();

        hboxBottom.getChildren().addAll(eliminar, cancelar);
        hboxCenter.getChildren().addAll(id, idElimina);

        cancelar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                stage.close();

            }
        });

        eliminar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                try {
                    int idEliminar = Integer.parseInt(idElimina.getText());
                    Marca marca = new Marca(idEliminar, null);
                    marca.eliminar();
                    stage.close();
                    agregaTabla(tablaMarca, Marca.selecciona());
                } catch (SQLException sql) {
                    System.out.println("sql");
                    //poner error
                } catch (NumberFormatException number) {
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

    /**
     * Método para mostrar la tabla distribuidor
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void muestraDistribuidor(ActionEvent e) throws SQLException {

        distribuidor.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorDistribuidor.setVisible(true);
        anchorDistribuidor.setDisable(false);
        agregaTabla(tablaDistribuidor, Distribuidor.selecciona());

    }

    /**
     * Método para agregar datos a la tabla distribuidor
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void agregaDistribuidor(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxId = new HBox();
        HBox hboxNombre = new HBox();
        HBox hboxDeuda = new HBox();
        Label id = new Label("ID Distribuidor");
        Label nombre = new Label("Nombre");
        Label deuda = new Label("Deuda");
        final TextField textId = new TextField();
        final TextField textNombre = new TextField();
        final TextField textDeuda = new TextField();
        VBox vboxCenter = new VBox();
        Button agregar = new Button("Agregar");
        Button cancelar = new Button("Cancelar");

        hboxBottom.getChildren().addAll(agregar, cancelar);
        hboxId.getChildren().addAll(id, textId);
        hboxNombre.getChildren().addAll(nombre, textNombre);
        hboxDeuda.getChildren().addAll(deuda, textDeuda);
        vboxCenter.getChildren().addAll(hboxId, hboxNombre, hboxDeuda);

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
                    int idAgrega = Integer.parseInt(textId.getText());
                    String nombreAgrega = textNombre.getText();
                    double deudaAgrega = Double.parseDouble(textDeuda.getText());

                    Distribuidor distribuidor = new Distribuidor(idAgrega, nombreAgrega, deudaAgrega);
                    distribuidor.agregar();
                    stage.close();
                    agregaTabla(tablaDistribuidor, Distribuidor.selecciona());
                } catch (SQLException sql) {
                    System.out.println("sql");
                    //poner error
                } catch (NumberFormatException number) {
                    System.out.println("number");
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

    /**
     * Método para eliminat datos de la tabla distribuidor
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void eliminaDistribuidor(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxCenter = new HBox();
        Button eliminar = new Button("Eliminar");
        Button cancelar = new Button("Cancelar");
        Label id = new Label("ID Distribuidor");
        final TextField idElimina = new TextField();

        hboxBottom.getChildren().addAll(eliminar, cancelar);
        hboxCenter.getChildren().addAll(id, idElimina);

        cancelar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                stage.close();

            }
        });

        eliminar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                try {
                    int idEliminar = Integer.parseInt(idElimina.getText());
                    Distribuidor distribuidor = new Distribuidor(idEliminar, null, 0);
                    distribuidor.eliminar();
                    stage.close();
                    agregaTabla(tablaDistribuidor, Distribuidor.selecciona());
                } catch (SQLException sql) {
                    System.out.println("sql");
                    //poner error
                } catch (NumberFormatException number) {
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

    /**
     * Método para mostrar la tabla pedido
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void muestraPedido(ActionEvent e) throws SQLException {

        pedido.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorPedido.setVisible(true);
        anchorPedido.setDisable(false);
        agregaTabla(tablaPedido, Pedido.selecciona());

    }

    /**
     * Método para agregar datos a la tabla pedido
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void agregaPedido(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxId = new HBox();
        HBox hboxNumero = new HBox();
        HBox hboxTotal = new HBox();
        HBox hboxFecha = new HBox();
        Label id = new Label("ID Pedido");
        Label numero = new Label("Numero de articulos");
        Label total = new Label("Total");
        Label mes = new Label("Mes de pedido");
        Label dia = new Label("Dia de pedido");
        Label año = new Label("Año de pedido");
        final TextField textId = new TextField();
        final TextField textNumero = new TextField();
        final TextField textTotal = new TextField();
        final TextField textMes = new TextField();
        final TextField textDia = new TextField();
        final TextField textAño = new TextField();
        VBox vboxCenter = new VBox();
        Button agregar = new Button("Agregar");
        Button cancelar = new Button("Cancelar");

        hboxBottom.getChildren().addAll(agregar, cancelar);
        hboxId.getChildren().addAll(id, textId);
        hboxNumero.getChildren().addAll(numero, textNumero);
        hboxTotal.getChildren().addAll(total, textTotal);
        hboxFecha.getChildren().addAll(mes, textMes, dia, textDia, año, textAño);
        vboxCenter.getChildren().addAll(hboxId, hboxNumero, hboxTotal, hboxFecha);

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
                    int idAgrega = Integer.parseInt(textId.getText());
                    int numeroAgrega = Integer.parseInt(textNumero.getText());
                    double totalAgrega = Double.parseDouble(textTotal.getText());
                    int mesAgrega = Integer.parseInt(textMes.getText());
                    int diaAgrega = Integer.parseInt(textDia.getText());
                    int añoAgrega = Integer.parseInt(textAño.getText());

                    Pedido pedido = new Pedido(idAgrega, numeroAgrega, totalAgrega, mesAgrega, diaAgrega, añoAgrega);
                    pedido.agregar();
                    stage.close();
                    agregaTabla(tablaPedido, Pedido.selecciona());
                } catch (SQLException sql) {
                    //poner error
                } catch (NumberFormatException number) {
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

    /**
     * Método para eliminar datos de la tabla pedido
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void eliminaPedido(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxCenter = new HBox();
        Button eliminar = new Button("Eliminar");
        Button cancelar = new Button("Cancelar");
        Label id = new Label("ID Pedido");
        final TextField idElimina = new TextField();

        hboxBottom.getChildren().addAll(eliminar, cancelar);
        hboxCenter.getChildren().addAll(id, idElimina);

        cancelar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                stage.close();

            }
        });

        eliminar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                try {
                    int idEliminar = Integer.parseInt(idElimina.getText());
                    Pedido pedido = new Pedido(idEliminar, 0, 0, 0, 0, 0);
                    pedido.eliminar();
                    stage.close();
                    agregaTabla(tablaPedido, Pedido.selecciona());
                } catch (SQLException sql) {
                    System.out.println("sql");
                    //poner error
                } catch (NumberFormatException number) {
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

    /**
     * Método para mostrar la tabla empleado
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void muestraEmpleado(ActionEvent e) throws SQLException {

        empleado.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorEmpleado.setVisible(true);
        anchorEmpleado.setDisable(false);
        agregaTabla(tablaEmpleado, Empleado.selecciona());

    }

    /**
     * Método para agregar datos a la tabla empleado
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void agregaEmpleado(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxId = new HBox();
        HBox hboxNombre = new HBox();
        HBox hboxPaterno = new HBox();
        HBox hboxMaterno = new HBox();
        HBox hboxNacimiento = new HBox();
        HBox hboxIngreso = new HBox();
        HBox hboxPosicion = new HBox();
        Label id = new Label("ID Empleado");
        Label nombre = new Label("Nombre");
        Label paterno = new Label("Apellido Paterno");
        Label materno = new Label("Apellido Materno");
        Label mesNac = new Label("Mes de nacimiento");
        Label diaNac = new Label("Dia de nacimiento");
        Label añoNac = new Label("Año de nacimiento");
        Label mesIng = new Label("Mes de ingreso");
        Label diaIng = new Label("Dia de ingreso");
        Label añoIng = new Label("Año de ingreso");
        Label posicion = new Label("Posicion");
        final TextField textId = new TextField();
        final TextField textNombre = new TextField();
        final TextField textPaterno = new TextField();
        final TextField textMaterno = new TextField();
        final TextField textMesNac = new TextField();
        final TextField textDiaNac = new TextField();
        final TextField textAñoNac = new TextField();
        final TextField textMesIng = new TextField();
        final TextField textDiaIng = new TextField();
        final TextField textAñoIng = new TextField();
        final TextField textPosicion = new TextField();
        VBox vboxCenter = new VBox();
        Button agregar = new Button("Agregar");
        Button cancelar = new Button("Cancelar");

        hboxBottom.getChildren().addAll(agregar, cancelar);
        hboxId.getChildren().addAll(id, textId);
        hboxNombre.getChildren().addAll(nombre, textNombre);
        hboxPaterno.getChildren().addAll(paterno, textPaterno);
        hboxMaterno.getChildren().addAll(materno, textMaterno);
        hboxNacimiento.getChildren().addAll(mesNac, textMesNac, diaNac, textDiaNac, añoNac, textAñoNac);
        hboxIngreso.getChildren().addAll(mesIng, textMesIng, diaIng, textDiaIng, añoIng, textAñoIng);
        hboxPosicion.getChildren().addAll(posicion, textPosicion);
        vboxCenter.getChildren().addAll(hboxId, hboxNombre, hboxPaterno, hboxMaterno, hboxNacimiento, hboxIngreso, hboxPosicion);

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
                    int idAgrega = Integer.parseInt(textId.getText());
                    String nombreAgrega = textNombre.getText();
                    String paternoAgrega = textPaterno.getText();
                    String maternoAgrega = textMaterno.getText();
                    int mesNacAgrega = Integer.parseInt(textMesNac.getText());
                    int diaNacAgrega = Integer.parseInt(textDiaNac.getText());
                    int añoNacAgrega = Integer.parseInt(textAñoNac.getText());
                    int mesIngAgrega = Integer.parseInt(textMesIng.getText());
                    int diaIngAgrega = Integer.parseInt(textDiaIng.getText());
                    int añoIngAgrega = Integer.parseInt(textAñoIng.getText());
                    String posicionAgrega = textPosicion.getText();

                    Empleado empleado = new Empleado(idAgrega, nombreAgrega, paternoAgrega, maternoAgrega, mesNacAgrega, diaNacAgrega, añoNacAgrega, mesIngAgrega, diaIngAgrega, añoIngAgrega, posicionAgrega);
                    empleado.agregar();
                    stage.close();
                    agregaTabla(tablaEmpleado, Empleado.selecciona());
                } catch (SQLException sql) {
                    //poner error
                } catch (NumberFormatException number) {
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

    /**
     * Método para eliminar datos de la tabla empleado
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void eliminaEmpleado(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxCenter = new HBox();
        Button eliminar = new Button("Eliminar");
        Button cancelar = new Button("Cancelar");
        Label id = new Label("ID Empleado");
        final TextField idElimina = new TextField();

        hboxBottom.getChildren().addAll(eliminar, cancelar);
        hboxCenter.getChildren().addAll(id, idElimina);

        cancelar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                stage.close();

            }
        });

        eliminar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                try {
                    int idEliminar = Integer.parseInt(idElimina.getText());
                    Empleado empleado = new Empleado(idEliminar, null, null, null, 0, 0, 0, 0, 0, 0, null);
                    empleado.eliminar();
                    stage.close();
                    agregaTabla(tablaEmpleado, Empleado.selecciona());
                } catch (SQLException sql) {
                    System.out.println("sql");
                    //poner error
                } catch (NumberFormatException number) {
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

    /**
     * Método para mostrar la tabla sucursal
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void muestraSucursal(ActionEvent e) throws SQLException {

        sucursal.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorSucursal.setVisible(true);
        anchorSucursal.setDisable(false);
        agregaTabla(tablaSucursal, Sucursal.selecciona());

    }

    /**
     * Método para agregar datos a la tabla sucursal
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void agregaSucursal(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxId = new HBox();
        HBox hboxNombre = new HBox();
        HBox hboxTelefono = new HBox();
        HBox hboxBalance = new HBox();
        Label id = new Label("ID Sucursal");
        Label nombre = new Label("Nombre");
        Label telefono = new Label("Telefono");
        Label balance = new Label("Balance");
        final TextField textId = new TextField();
        final TextField textNombre = new TextField();
        final TextField textTelefono = new TextField();
        final TextField textBalance = new TextField();
        VBox vboxCenter = new VBox();
        Button agregar = new Button("Agregar");
        Button cancelar = new Button("Cancelar");

        hboxBottom.getChildren().addAll(agregar, cancelar);
        hboxId.getChildren().addAll(id, textId);
        hboxNombre.getChildren().addAll(nombre, textNombre);
        hboxTelefono.getChildren().addAll(telefono, textTelefono);
        hboxBalance.getChildren().addAll(balance, textBalance);
        vboxCenter.getChildren().addAll(hboxId, hboxNombre, hboxTelefono, hboxBalance);

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
                    int idAgrega = Integer.parseInt(textId.getText());
                    String nombreAgrega = textNombre.getText();
                    double telefonoAgrega = Double.parseDouble(textTelefono.getText());
                    double balanceAgrega = Double.parseDouble(textBalance.getText());

                    Sucursal sucursal = new Sucursal(idAgrega, nombreAgrega, telefonoAgrega, balanceAgrega);
                    sucursal.agregar();
                    stage.close();
                    agregaTabla(tablaSucursal, Sucursal.selecciona());
                } catch (SQLException sql) {
                    System.out.println("sql");
                    //poner error
                } catch (NumberFormatException number) {
                    System.out.println("number");
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

    /**
     * Método para eliminar datos de la tabla sucursal
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void eliminaSucursal(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxCenter = new HBox();
        Button eliminar = new Button("Eliminar");
        Button cancelar = new Button("Cancelar");
        Label id = new Label("ID Sucursal");
        final TextField idElimina = new TextField();

        hboxBottom.getChildren().addAll(eliminar, cancelar);
        hboxCenter.getChildren().addAll(id, idElimina);

        cancelar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                stage.close();

            }
        });

        eliminar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                try {
                    int idEliminar = Integer.parseInt(idElimina.getText());
                    Sucursal sucursal = new Sucursal(idEliminar, null, 0, 0);
                    sucursal.eliminar();
                    stage.close();
                    agregaTabla(tablaSucursal, Sucursal.selecciona());
                } catch (SQLException sql) {
                    System.out.println("sql");
                    //poner error
                } catch (NumberFormatException number) {
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

    /**
     * Método para mostrar la tabla cliente
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void muestraCliente(ActionEvent e) throws SQLException {

        cliente.setVisited(false);
        principal.setVisible(false);
        principal.setDisable(false);
        anchorCliente.setVisible(true);
        anchorCliente.setDisable(false);
        agregaTabla(tablaCliente, Cliente.selecciona());

    }

    /**
     * Método para agregar datos a la tabla cliente
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void agregaCliente(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxId = new HBox();
        HBox hboxNombre = new HBox();
        HBox hboxPaterno = new HBox();
        HBox hboxMaterno = new HBox();
        HBox hboxTelefono = new HBox();
        HBox hboxCorreo = new HBox();
        HBox hboxTarjeta = new HBox();
        Label id = new Label("ID Cliente");
        Label nombre = new Label("Nombre");
        Label paterno = new Label("Apellido Paterno");
        Label materno = new Label("Apellido Materno");
        Label telefono = new Label("Telefono");
        Label correo = new Label("Correo");
        Label tarjeta = new Label("Tarjeta de credito");
        final TextField textId = new TextField();
        final TextField textNombre = new TextField();
        final TextField textPaterno = new TextField();
        final TextField textMaterno = new TextField();
        final TextField textTelefono = new TextField();
        final TextField textCorreo = new TextField();
        final TextField textTarjeta = new TextField();
        VBox vboxCenter = new VBox();
        Button agregar = new Button("Agregar");
        Button cancelar = new Button("Cancelar");

        hboxBottom.getChildren().addAll(agregar, cancelar);
        hboxId.getChildren().addAll(id, textId);
        hboxNombre.getChildren().addAll(nombre, textNombre);
        hboxPaterno.getChildren().addAll(paterno, textPaterno);
        hboxMaterno.getChildren().addAll(materno, textMaterno);
        hboxTelefono.getChildren().addAll(telefono, textTelefono);
        hboxCorreo.getChildren().addAll(correo, textCorreo);
        hboxTarjeta.getChildren().addAll(tarjeta, textTarjeta);
        vboxCenter.getChildren().addAll(hboxId, hboxNombre, hboxPaterno, hboxMaterno, hboxTelefono, hboxCorreo, hboxTarjeta);

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
                    int idAgrega = Integer.parseInt(textId.getText());
                    String nombreAgrega = textNombre.getText();
                    String paternoAgrega = textPaterno.getText();
                    String maternoAgrega = textMaterno.getText();
                    double telefonoAgrega = Double.parseDouble(textTelefono.getText());
                    String correoAgrega = textCorreo.getText();
                    double tarjetaAgrega = Double.parseDouble(textTarjeta.getText());

                    Cliente cliente = new Cliente(idAgrega, nombreAgrega, paternoAgrega, maternoAgrega, telefonoAgrega, correoAgrega, tarjetaAgrega);
                    cliente.agregar();
                    stage.close();
                    agregaTabla(tablaCliente, Cliente.selecciona());
                } catch (SQLException sql) {
                    //poner error
                } catch (NumberFormatException number) {
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
    
    /**
     * Método para eliminar datos de la tabla cliente
     * @param e
     * @throws SQLException 
     */
    @FXML
    private void eliminaCliente(ActionEvent e) throws SQLException {

        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        HBox hboxBottom = new HBox();
        HBox hboxCenter = new HBox();
        Button eliminar = new Button("Eliminar");
        Button cancelar = new Button("Cancelar");
        Label id = new Label("ID Cliente");
        final TextField idElimina = new TextField();

        hboxBottom.getChildren().addAll(eliminar, cancelar);
        hboxCenter.getChildren().addAll(id, idElimina);

        cancelar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                stage.close();

            }
        });

        eliminar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                try {
                    int idEliminar = Integer.parseInt(idElimina.getText());
                    Cliente cliente = new Cliente(idEliminar, null, null, null, 0, null, 0);
                    cliente.eliminar();
                    stage.close();
                    agregaTabla(tablaCliente, Cliente.selecciona());
                } catch (SQLException sql) {
                    System.out.println("sql");
                    //poner error
                } catch (NumberFormatException number) {
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

    /**
     * Método para salir de la interfaz
     * @param e 
     */
    @FXML
    private void salir(ActionEvent e) {

        Conexion.cerrar();
        System.exit(0);

    }

    /**
     * Método para regresar al menu principal
     * @param e 
     */
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

    
        
    /**
     * Método especial que nos permite realizar distintas
     * acciones como eliminar y agregar
     * @param tabla - la tabla que a realizar la accion
     * @param resultado - el resultado despues de la accion
     * @throws SQLException 
     */
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
        
    }
}
