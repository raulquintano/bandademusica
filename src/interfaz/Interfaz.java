package interfaz;
import java.util.Scanner;
import java.util.ArrayList;
import dominio.*;

public class Interfaz {
    Scanner lector = new Scanner(System.in);
    Scanner lectorString = new Scanner(System.in);
    int opcion;
    boolean salir;

    ArrayList<String> eventos = new ArrayList<>();
    public void menuPrincipal()
    {
            System.out.println("1) Crear nuevo evento");
            System.out.println("2) Mostrar eventos");
            System.out.println("3) Salir");
            opcion = lector.nextInt();

            switch (opcion) 
            {
                case 1:
                    menuEvento();
                    System.out.println("");
                    menuPrincipal();
                    break;
                case 2:
                    mostrarEventos();
                    System.out.println("");
                    menuPrincipal();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPCION NO DISPONIBLE");
                    break;
            }
    }
    public void menuEvento()
    {
        
        Banda banda = new Banda();
        do
        {
            System.out.println("1) Añadir Fecha");
            System.out.println("2) Añadir director");
            System.out.println("3) Añadir musico socio");
            System.out.println("4) Añadir musico refuerzo");
            System.out.println("5) Volver al menú principal");
            opcion = lector.nextInt();
            if(opcion==1)
            {
                Fechas fechas = new Fechas();
                System.out.print("[Fecha en formato (dd/MM/yyyy)]-->");
                fechas.setFecha(lectorString.nextLine());
                fechas.comprobarFecha();
                eventos.add(fechas.toString());
                
            }
            else if(opcion==2)
            {
                Director director = new Director();
                System.out.print("[Nombre del director]-->");
                director.setNombre(lectorString.nextLine());
                eventos.add(director.toString());
            }
            else if(opcion==3)
            {
                MusicoSocio musicoSocio = new MusicoSocio();
                System.out.print("[Nombre del musico socio]-->");
                musicoSocio.setNombre(lectorString.nextLine());
                System.out.print("[Instrumento del musico socio]-->");
                musicoSocio.setInstrumento(lectorString.nextLine());
                System.out.print("[Numero de socio]-->");
                musicoSocio.setNumeroDeSocio(lector.nextInt());
                eventos.add(musicoSocio.toString());

                
            }
            else if(opcion==4)
            {
                MusicoRefuerzo musicoRefuerzo = new MusicoRefuerzo();
                System.out.print("[Nombre del musico refuerzo]-->");
                musicoRefuerzo.setNombre(lectorString.nextLine());
                System.out.print("[Instrumento del musico refuerzo]-->");
                musicoRefuerzo.setInstrumento(lectorString.nextLine());
                System.out.print("[Salario del musico refuerzo]-->");
                musicoRefuerzo.setSueldo(lector.nextInt());
                eventos.add(musicoRefuerzo.toString());
                
            }
            else if(opcion==5)
            {
                menuPrincipal();
            }
        }while(opcion!=5);
        
        
    }
    public void mostrarEventos()
    {
          for(String n : eventos)
          {
            System.out.println(n);
          }
    }
}