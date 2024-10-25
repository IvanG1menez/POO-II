package edu.unam.modelo;
import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent{
    private String nombre;
    private List<FileSystemComponent> componentes = new ArrayList<>();

    public Directory(String nombre) {
        this.nombre = nombre;
    }

    public void addComponent(FileSystemComponent componente) {
        componentes.add(componente);
    }

    public void removeComponent(FileSystemComponent componente) {
        componentes.remove(componente);
    }

    @Override
    public void showDetails(int indentLevel) {
        System.out.println(getIndentation(indentLevel) + "+ Directorio: " + nombre);
        for (FileSystemComponent componente : componentes) {
            componente.showDetails(indentLevel + 1); // Incrementar nivel de indentación para contenido
        }
    }
}
