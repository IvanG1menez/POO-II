package edu.unam.modelo;

public abstract class FileSystemComponent {
    public abstract void showDetails(int indentLevel);
    
    protected String getIndentation(int indentLevel) {
        return "    ".repeat(indentLevel); // Cuatro espacios por nivel de indentación
    }
}
