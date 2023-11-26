package dominio;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.text.ParseException;

public class Fechas {
    private String fecha;

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }
    public String getFecha()
    {
        return fecha;
    }
    public void comprobarFecha()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fecha = dateFormat.parse(getFecha());
            System.out.println("Fecha ingresada: " + fecha);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Asegúrate de usar el formato dd/MM/yyyy.");
        }
    }
    

    public String toString()
    {
        return "Fecha de actuacion: "+ fecha;
    }
}