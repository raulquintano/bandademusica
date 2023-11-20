package dominio;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Fechas {
    private LocalDate fecha;

    public Fechas(LocalDate fecha)
    {
        this.fecha = fecha;
    }

    public String toString()
    {
        return "Fecha de actuacion: "+ fecha;
    }
}