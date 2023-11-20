package dominio;

public class MusicoSocio {

    private String nombre;
    private int numeroDeSocio;
    private String instrumento;

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return nombre;
    }

    public void setNumeroDeSocio(int numeroDeSocio)
    {
        this.numeroDeSocio = numeroDeSocio;
    }
    public int getNumeroDeSocio()
    {
        return numeroDeSocio;
    }

    public void setInstrumento(String instrumento)
    {
        this.instrumento = instrumento;
    }
    public String getInstrumento()
    {
        return instrumento;
    }

    public String toString()
    {
        return "Musico Socio ("+numeroDeSocio+"): " + "'"+ nombre + "' " + " '"+instrumento+"'";
    }
}