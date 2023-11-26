package dominio;

public class Participante {

    protected String nombre;
    protected String instrumento;

    public Participante(String nombre)
    {
        this.nombre = nombre;
    }

    public Participante(String nombre, String instrumento)
    {
        this.nombre = nombre;
        this.instrumento = instrumento;
    }
    public Participante()
    {
        
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return nombre;
    }

    public void setInstrumento(String instrumento)
    {
        this.instrumento = instrumento;
    }
    public String getInstrumento()
    {
        return instrumento;
    }
}