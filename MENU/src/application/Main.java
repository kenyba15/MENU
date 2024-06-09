package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        MenuBar menuBar = new MenuBar();
        Menu archivoMenu = new Menu("Archivo");
        Menu editarMenu = new Menu("Editar");
        Menu ayudaMenu = new Menu("Ayuda");

        MenuItem nuevoItem = new MenuItem("Nuevo");
        MenuItem abrirItem = new MenuItem("Abrir");
        MenuItem guardarItem = new MenuItem("Guardar");
        MenuItem salirItem = new MenuItem("Salir");
        archivoMenu.getItems().addAll(nuevoItem, abrirItem, guardarItem, new SeparatorMenuItem(), salirItem);

        MenuItem copiarItem = new MenuItem("Copiar");
        MenuItem pegarItem = new MenuItem("Pegar");
        editarMenu.getItems().addAll(copiarItem, pegarItem);

        MenuItem acercaDeItem = new MenuItem("Acerca de");

        ayudaMenu.getItems().add(acercaDeItem);

        // Agregar los menús a la barra de menú
        menuBar.getMenus().addAll(archivoMenu, editarMenu, ayudaMenu);

        // Definir acciones para los elementos de menú
        nuevoItem.setOnAction(event -> System.out.println("Nuevo archivo"));
        abrirItem.setOnAction(event -> System.out.println("Abrir archivo"));
        guardarItem.setOnAction(event -> System.out.println("Guardar archivo"));
        salirItem.setOnAction(event -> primaryStage.close());
        copiarItem.setOnAction(event -> System.out.println("Copiar texto"));
        pegarItem.setOnAction(event -> System.out.println("Pegar texto"));
        acercaDeItem.setOnAction(event -> System.out.println("Acerca de esta aplicación"));

        // Crear el layout principal y añadir la barra de menú
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        // Crear la escena
        Scene scene = new Scene(root, 400, 300);

        // Configurar el escenario principal
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejemplo GUI JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

