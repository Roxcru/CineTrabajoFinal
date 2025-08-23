import Clases.Asientos;
import Clases.Funcion;
import Clases.Pelicula;
import Clases.Sala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Modelo.ClsFuncion.*;
import static Modelo.ClsSala.*;
import static Modelo.CslPelicula.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<Pelicula> lstPeliculas = new ArrayList<>();
    static List<Sala> lstSalas = new ArrayList<>();
    static List<Asientos> lstAsiento = new ArrayList<>();
    static List<Funcion> lstFuncion = new ArrayList<>();

    public static void main(String[] args) {
        lstPeliculas = lstPelicula();
        lstSalas = lstSala();
        lstFuncion = lstFuncion();
        lstAsiento = lstAsientos();
        listarMenu();
    }

    public static void listarMenu(){
        Scanner sc = new Scanner(System.in);

        //Menu
        System.out.println("=============================MENU=============================");
        System.out.println("1. Mantenimiento de peliculas");
        System.out.println("2. Mantenimiento de salas");
        System.out.println("3. Programación de funciones");

        int opcMenu = sc.nextInt();
        clearScreen();
        System.out.flush();
        subListaMenu(opcMenu);

    }

    public static void subListaMenu(int idMenu){
        Scanner sc2 = new Scanner(System.in);
        switch (idMenu){
            case 1:
                //Menu
                System.out.println("=============================MANTENIMIENTO PELICULAS=============================");
                System.out.println("1. Listar Peliculas");
                System.out.println("2. Agregar Pelicula");
                System.out.println("3. Eliminar Pelicula");
                System.out.println("4. Regresar al menu anterior");
                break;
            case 2:
                //Menu
                System.out.println("=============================MANTENIMIENTO SALAS=============================");
                System.out.println("1. Listar Salas");
                System.out.println("2. Agregar Sala");
                System.out.println("3. Eliminar Sala");
                System.out.println("4. Ver asientos de una Sala");
                System.out.println("5. Establecer los asientos de una Sala");
                System.out.println("6. Regresar al menu anterior");
                break;
            case 3:
                //Menu
                System.out.println("=============================PROGRAMAR FUNCIONES=============================");
                System.out.println("1. Ver Funciones");
                System.out.println("2. Programar Función");
                System.out.println("3. Regresar al menu anterior");
                break;

        }

        int idSubMenu = sc2.nextInt();
        if (idMenu == 1) ejecutar1(idMenu,idSubMenu);
        if (idMenu == 2) ejecutar2(idMenu,idSubMenu);
        if (idMenu == 3) ejecutar3(idMenu,idSubMenu);

    }

    public static void ejecutar1(int idMenu, int idSubMenu) {
        switch (idSubMenu){
            case 1:
                mstPelicula(lstPeliculas);
                System.out.println("\n");
                subListaMenu(idMenu);
                System.out.println("\n");
            case 2:
                insPelicula(lstPeliculas);
                System.out.println("\n");
                subListaMenu(idMenu);
                System.out.println("\n");
            case 3:
                delPelicula(lstPeliculas);
                System.out.println("\n");
                subListaMenu(idMenu);
                System.out.println("\n");
            case 4:
                listarMenu();
        }
    }

    public static void ejecutar2(int idMenu, int idSubMenu) {
        switch (idSubMenu){
            case 1:
                mstSala(lstSalas);
                System.out.println("\n");
                subListaMenu(idMenu);
                System.out.println("\n");
            case 2:
                insSala(lstSalas);
                System.out.println("\n");
                subListaMenu(idMenu);
                System.out.println("\n");
            case 3:
                delSala(lstSalas);
                System.out.println("\n");
                subListaMenu(idMenu);
                System.out.println("\n");
            case 4:
                mstAsientosPorSala(lstSalas);
                System.out.println("\n");
                subListaMenu(idMenu);
                System.out.println("\n");
            case 5:
                insAsientos(lstSalas, lstAsiento);
                System.out.println("\n");
                subListaMenu(idMenu);
                System.out.println("\n");
            case 6:
                listarMenu();
        }
    }

    public static void ejecutar3(int idMenu, int idSubMenu) {
        switch (idSubMenu){
            case 1:
                mstFuncion(lstFuncion, lstPeliculas, lstSalas);
                System.out.println("\n");
                subListaMenu(idMenu);
                System.out.println("\n");
            case 2:
                programarFuncion(lstFuncion, lstPeliculas, lstSalas);
                System.out.println("\n");
                subListaMenu(idMenu);
                System.out.println("\n");
            case 3:
                listarMenu();
        }
    }

     public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}