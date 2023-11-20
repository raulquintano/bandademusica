package aplicacion;

import java.time.LocalDate;

import dominio.*;

public class Principal {

    public static void main(String[]args)
    {
        Banda banda1 = new Banda("BANDA DE MUSICA DE VILLAR DEL MONTE");
        Fechas actuacion1 = new Fechas(LocalDate.of(2023, 12, 11));
        Director director1 = new Director();
        MusicoRefuerzo mr1 = new MusicoRefuerzo();
        MusicoSocio ms1 = new MusicoSocio();

        director1.setNombre("Pedro García");

        ms1.setNombre("Antonio Lopez");
        ms1.setInstrumento("Clarinete");
        ms1.setNumeroDeSocio(8776);

        mr1.setNombre("Manuel Pastilla");
        mr1.setInstrumento("Tuba");
        mr1.setSueldo(1780);

        System.out.println(banda1);
        System.out.println("");
        System.out.println(actuacion1);
        System.out.println(director1);
        System.out.println(ms1);
        System.out.println(mr1);
        

    }
    
}