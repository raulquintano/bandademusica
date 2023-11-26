package aplicacion;
import java.util.Scanner;
import java.time.LocalDate;

import dominio.*;
import interfaz.*;
public class Principal {
    
    public static void main(String[]args)
    {
        Interfaz interfaz = new Interfaz();
        Scanner lector = new Scanner(System.in);
        interfaz.menuPrincipal();
    }
    
}