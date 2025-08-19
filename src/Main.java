import Clases.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<Pelicula> lstPeliculas = new ArrayList<>();
    public static void main(String[] args) {
        lstPeliculas = lstPelicula();
        listarMenu();
    }

    public static void listarMenu(){
        Scanner sc = new Scanner(System.in);

        //Menu
        System.out.println("=============================MENU=============================");
        System.out.println("1. Ver la pelicula");
        System.out.println("2. Agregar nuevo usuarios");
        System.out.println("3. Agregar pelicula");

        int opcMenu = sc.nextInt();

        switch (opcMenu) {
            case 1:
                lstPeliculas.forEach(pelicula -> {
                    System.out.println(
                            "-------------------------------------------------------------------------------"
                    );
                    System.out.println(
                            "|Codigo: " + pelicula.getIdPelicula() + "\t" +
                                    "|Titulo: " + pelicula.getTitulo() + "|"
                    );
                    System.out.println(
                            "|Sinopsis: " + pelicula.getDescripcion() + "|"
                    );
                });
                System.out.println(
                        "-------------------------------------------------------------------------------"
                );
                System.out.println("\n");
                break;
            case 2:
                //registrarPersonal();
                System.out.println("Se registro correctamente");
                System.out.println("\n");
                break;
        }
        listarMenu();
    }

    public static List<Pelicula> lstPelicula(){
        //Lista de Personal
        List<Pelicula> lstPersonal = new ArrayList<>();

        lstPersonal.add(new Pelicula(
                "001",
                "Volver al Futuro",
                "El adolescente Marty McFly es amigo de Doc, un científico que ha construido una máquina del tiempo. Cuando los dos prueban el artefacto, un error fortuito hace que Marty llegue a 1955, año en el que sus padres iban al instituto y todavía no se habían conocido. Después de impedir su primer encuentro, Marty deberá conseguir que se conozcan y se enamoren, de lo contrario su existencia no sería posible."));

        lstPersonal.add(new Pelicula(
                "002",
                "El padrino",
                "Don Vito Corleone es el respetado y temido jefe de una de las cinco familias de la mafia de Nueva York en los años 40. El hombre tiene cuatro hijos: Connie, Sonny, Fredo y Michael, que no quiere saber nada de los negocios sucios de su padre. Cuando otro capo, Sollozzo, intenta asesinar a Corleone, empieza una cruenta lucha entre los distintos clanes."));

        lstPersonal.add(new Pelicula(
                "003",
                "Ciudadano Kane",
                "Un periodista se obsesiona con comprender el significado de la última palabra que Charles Foster Kane dijo antes de morir: rosebud. Para descubrir el misterio investiga a varias personas del pasado del magnate."));


        lstPersonal.add(new Pelicula(
                "004",
                "Matrix",
                "El programador informático Thomas Anderson, más conocido en el mundo de los \"hacker\" como Neo, está en el punto de mira del temible agente Smith. Otros dos piratas informáticos, Trinity y Morfeo, se ponen en contacto con Neo para ayudarlo a escapar. Matrix te posee. Sigue al conejo blanco."));

        return lstPersonal;
    }
}