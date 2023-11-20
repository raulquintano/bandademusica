package dominio;

public class Director {

    private String nombre;

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String toString()
    {
        return "Director: "+nombre;
    }
    
}