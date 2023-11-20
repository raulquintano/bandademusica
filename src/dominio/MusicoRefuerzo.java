package dominio;

public class MusicoRefuerzo {

    private String nombre;
    private int sueldo;
    private String instrumento;

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return nombre;
    }

    public void setSueldo(int sueldo)
    {
        this.sueldo = sueldo;
    }
    public int getSueldo()
    {
        return sueldo;
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
            return "Musico de Refuerzo: " +"'"+ nombre+"' " + "'"+instrumento+"'" +"      || Salario: "+sueldo+"$";
    }
}