package dominio;

public class MusicoSocio extends Participante{

    private int numeroDeSocio;

    public MusicoSocio(String nombre, String instrumento)
    {
        super(nombre,instrumento);
    }
    public MusicoSocio()
    {

    }
    
    public void setNumeroDeSocio(int numeroDeSocio)
    {
        this.numeroDeSocio = numeroDeSocio;
    }
    public int getNumeroDeSocio()
    {
        return numeroDeSocio;
    }

    public String toString()
    {
        return "Musico Socio ("+numeroDeSocio+"): " + "'"+ nombre + "' " + " '"+instrumento+"'";
    }
}