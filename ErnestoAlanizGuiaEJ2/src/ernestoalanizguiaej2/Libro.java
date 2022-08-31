package ernestoalanizguiaej2;

/*
*autor: yo jaja
*/

public class Libro {
    private int id, precio;
    private String nombre, autor, descripcion;
    
    //ahi van todos los setters y getters y constructors y todo
    
    public Libro() {
        
    }

    public Libro(int id, String nombre, String autor, String descripcion, int precio) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "[" + id + " || " + precio + " || " + 
                nombre + " || " + autor + " || " 
                + descripcion + ']' + '\n';
    }
    
    //yep
    
}
