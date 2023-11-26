package dominio;

public class MusicoRefuerzo extends Participante{

    private int sueldo;
    
    public MusicoRefuerzo(String nombre, String instrumento)
    {
        super(nombre, instrumento);
    }
    public MusicoRefuerzo()
    {
        
    }
    

    public void setSueldo(int sueldo)
    {
        this.sueldo = sueldo;
    }
    public int getSueldo()
    {
        return sueldo;
    }

   

    public String toString()
    {
            return "Musico de Refuerzo: " +"'"+ nombre+"' " + "'"+instrumento+"'" +"      || Salario: "+sueldo+"$";
    }
}