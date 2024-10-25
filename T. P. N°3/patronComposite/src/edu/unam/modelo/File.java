package edu.unam.modelo;

public class File extends FileSystemComponent{
    
    private String nombre;
    private int tamaño;

    public File(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    @Override
    public void showDetails(int indentLevel) {
        System.out.println(getIndentation(indentLevel) + "- Archivo: " + nombre + " (Tamaño: " + tamaño + " bytes)");
    }
}
