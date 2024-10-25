import edu.unam.modelo.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear archivos
        File archivo1 = new File("documento.txt", 1200);
        File archivo2 = new File("imagen.jpg", 2400);
        File archivo3 = new File("video.mp4", 8500);

        // Crear directorios
        Directory carpetaPrincipal = new Directory("Carpeta Principal");
        Directory subCarpeta1 = new Directory("Subcarpeta 1");
        Directory subCarpeta2 = new Directory("Subcarpeta 2");

        // Añadir archivos a subcarpetas
        subCarpeta1.addComponent(archivo1);
        subCarpeta2.addComponent(archivo2);
        subCarpeta2.addComponent(archivo3);

        // Añadir subcarpetas a la carpeta principal
        carpetaPrincipal.addComponent(subCarpeta1);
        carpetaPrincipal.addComponent(subCarpeta2);

        // Mostrar detalles con jerarquía
        carpetaPrincipal.showDetails(0); // Nivel inicial de indentación
    }
}