package Modelo;

import Clases.Asientos;
import Clases.Sala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ClsSala {

    public static List<Sala> lstSala(){
        List<Sala> lstSalas = new ArrayList<>();
        List<Asientos> lstAsientos = new ArrayList<>();

        lstAsientos = lstAsientos();

        lstSalas.add(new Sala("001",
                1,
                lstAsientos.stream().filter(p -> p.getSala().equals("001")).toList()
        ));

        lstSalas.add(new Sala("002",
                2,
                lstAsientos.stream().filter(p -> p.getSala().equals("002")).toList()
        ));

        lstSalas.add(new Sala("003",
                3,
                lstAsientos.stream().filter(p -> p.getSala().equals("003")).toList()
        ));

        lstSalas.add(new Sala("004",
                4,
                lstAsientos.stream().filter(p -> p.getSala().equals("004")).toList()
        ));
        return lstSalas;
    }

    public static List<Asientos> lstAsientos(){
        //Lista de Personal
        List<Asientos> lstAsientos = new ArrayList<>();

        lstAsientos.add(new Asientos("001","A",1));
        lstAsientos.add(new Asientos("001","A",2));
        lstAsientos.add(new Asientos("001","A",3));
        lstAsientos.add(new Asientos("001","A",4));
        lstAsientos.add(new Asientos("001","A",5));
        lstAsientos.add(new Asientos("001","A",6));
        lstAsientos.add(new Asientos("001","A",7));
        lstAsientos.add(new Asientos("001","A",8));
        lstAsientos.add(new Asientos("001","A",9));
        lstAsientos.add(new Asientos("001","A",10));

        lstAsientos.add(new Asientos("001","B",1));
        lstAsientos.add(new Asientos("001","B",2));
        lstAsientos.add(new Asientos("001","B",3));
        lstAsientos.add(new Asientos("001","B",4));
        lstAsientos.add(new Asientos("001","B",5));
        lstAsientos.add(new Asientos("001","B",6));
        lstAsientos.add(new Asientos("001","B",7));
        lstAsientos.add(new Asientos("001","B",8));
        lstAsientos.add(new Asientos("001","B",9));
        lstAsientos.add(new Asientos("001","B",10));

        lstAsientos.add(new Asientos("001","C",1));
        lstAsientos.add(new Asientos("001","C",2));
        lstAsientos.add(new Asientos("001","C",3));
        lstAsientos.add(new Asientos("001","C",4));
        lstAsientos.add(new Asientos("001","C",5));
        lstAsientos.add(new Asientos("001","C",6));
        lstAsientos.add(new Asientos("001","C",7));
        lstAsientos.add(new Asientos("001","C",8));
        lstAsientos.add(new Asientos("001","C",9));
        lstAsientos.add(new Asientos("001","C",10));

        lstAsientos.add(new Asientos("002","A",1));
        lstAsientos.add(new Asientos("002","A",2));
        lstAsientos.add(new Asientos("002","A",3));
        lstAsientos.add(new Asientos("002","A",4));
        lstAsientos.add(new Asientos("002","A",5));
        lstAsientos.add(new Asientos("002","A",6));
        lstAsientos.add(new Asientos("002","A",7));
        lstAsientos.add(new Asientos("002","A",8));
        lstAsientos.add(new Asientos("002","A",9));
        lstAsientos.add(new Asientos("002","A",10));

        lstAsientos.add(new Asientos("002","B",1));
        lstAsientos.add(new Asientos("002","B",2));
        lstAsientos.add(new Asientos("002","B",3));
        lstAsientos.add(new Asientos("002","B",4));
        lstAsientos.add(new Asientos("002","B",5));
        lstAsientos.add(new Asientos("002","B",6));
        lstAsientos.add(new Asientos("002","B",7));
        lstAsientos.add(new Asientos("002","B",8));
        lstAsientos.add(new Asientos("002","B",9));
        lstAsientos.add(new Asientos("002","B",10));

        lstAsientos.add(new Asientos("002","C",1));
        lstAsientos.add(new Asientos("002","C",2));
        lstAsientos.add(new Asientos("002","C",3));
        lstAsientos.add(new Asientos("002","C",4));
        lstAsientos.add(new Asientos("002","C",5));
        lstAsientos.add(new Asientos("002","C",6));
        lstAsientos.add(new Asientos("002","C",7));
        lstAsientos.add(new Asientos("002","C",8));
        lstAsientos.add(new Asientos("002","C",9));
        lstAsientos.add(new Asientos("002","C",10));

        lstAsientos.add(new Asientos("003","A",1));
        lstAsientos.add(new Asientos("003","A",2));
        lstAsientos.add(new Asientos("003","A",3));
        lstAsientos.add(new Asientos("003","A",4));
        lstAsientos.add(new Asientos("003","A",5));
        lstAsientos.add(new Asientos("003","A",6));
        lstAsientos.add(new Asientos("003","A",7));
        lstAsientos.add(new Asientos("003","A",8));
        lstAsientos.add(new Asientos("003","A",9));
        lstAsientos.add(new Asientos("003","A",10));

        lstAsientos.add(new Asientos("003","B",1));
        lstAsientos.add(new Asientos("003","B",2));
        lstAsientos.add(new Asientos("003","B",3));
        lstAsientos.add(new Asientos("003","B",4));
        lstAsientos.add(new Asientos("003","B",5));
        lstAsientos.add(new Asientos("003","B",6));
        lstAsientos.add(new Asientos("003","B",7));
        lstAsientos.add(new Asientos("003","B",8));
        lstAsientos.add(new Asientos("003","B",9));
        lstAsientos.add(new Asientos("003","B",10));

        lstAsientos.add(new Asientos("003","C",1));
        lstAsientos.add(new Asientos("003","C",2));
        lstAsientos.add(new Asientos("003","C",3));
        lstAsientos.add(new Asientos("003","C",4));
        lstAsientos.add(new Asientos("003","C",5));
        lstAsientos.add(new Asientos("003","C",6));
        lstAsientos.add(new Asientos("003","C",7));
        lstAsientos.add(new Asientos("003","C",8));
        lstAsientos.add(new Asientos("003","C",9));
        lstAsientos.add(new Asientos("003","C",10));

        lstAsientos.add(new Asientos("003","D",1));
        lstAsientos.add(new Asientos("003","D",2));
        lstAsientos.add(new Asientos("003","D",3));
        lstAsientos.add(new Asientos("003","D",4));
        lstAsientos.add(new Asientos("003","D",5));
        lstAsientos.add(new Asientos("003","D",6));
        lstAsientos.add(new Asientos("003","D",7));
        lstAsientos.add(new Asientos("003","D",8));
        lstAsientos.add(new Asientos("003","D",9));
        lstAsientos.add(new Asientos("003","D",10));

        lstAsientos.add(new Asientos("004","A",1));
        lstAsientos.add(new Asientos("004","A",2));
        lstAsientos.add(new Asientos("004","A",3));
        lstAsientos.add(new Asientos("004","A",4));
        lstAsientos.add(new Asientos("004","A",5));
        lstAsientos.add(new Asientos("004","A",6));
        lstAsientos.add(new Asientos("004","A",7));
        lstAsientos.add(new Asientos("004","A",8));
        lstAsientos.add(new Asientos("004","A",9));
        lstAsientos.add(new Asientos("004","A",10));

        lstAsientos.add(new Asientos("004","B",1));
        lstAsientos.add(new Asientos("004","B",2));
        lstAsientos.add(new Asientos("004","B",3));
        lstAsientos.add(new Asientos("004","B",4));
        lstAsientos.add(new Asientos("004","B",5));
        lstAsientos.add(new Asientos("004","B",6));
        lstAsientos.add(new Asientos("004","B",7));
        lstAsientos.add(new Asientos("004","B",8));
        lstAsientos.add(new Asientos("004","B",9));
        lstAsientos.add(new Asientos("004","B",10));

        lstAsientos.add(new Asientos("004","C",1));
        lstAsientos.add(new Asientos("004","C",2));
        lstAsientos.add(new Asientos("004","C",3));
        lstAsientos.add(new Asientos("004","C",4));
        lstAsientos.add(new Asientos("004","C",5));
        lstAsientos.add(new Asientos("004","C",6));
        lstAsientos.add(new Asientos("004","C",7));
        lstAsientos.add(new Asientos("004","C",8));
        lstAsientos.add(new Asientos("004","C",9));
        lstAsientos.add(new Asientos("004","C",10));

        lstAsientos.add(new Asientos("004","D",1));
        lstAsientos.add(new Asientos("004","D",2));
        lstAsientos.add(new Asientos("004","D",3));
        lstAsientos.add(new Asientos("004","D",4));
        lstAsientos.add(new Asientos("004","D",5));
        lstAsientos.add(new Asientos("004","D",6));
        lstAsientos.add(new Asientos("004","D",7));
        lstAsientos.add(new Asientos("004","D",8));
        lstAsientos.add(new Asientos("004","D",9));
        lstAsientos.add(new Asientos("004","D",10));

        return lstAsientos;
    }

    public static void mstSala(List<Sala> lstSala){

        lstSala.forEach(sala -> {
            System.out.println(
                    "-------------------------------------------------------------------------------"
            );
            System.out.println(
                    "|Codigo: " + sala.getIdSala() + "\t" +
                            "|Sala: " + sala.getSala() + "\t" +
                            "|Cant. Asientos:" + sala.getLstAsiento().size() + "|"
            );
            mstAsientos(sala.getLstAsiento());
        });
        System.out.println(
                "-------------------------------------------------------------------------------"
        );
        System.out.println("\n");
    }

    public static void mstAsientosPorSala(List<Sala> lstSala){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Registrar el numero de Sala");
        String idSala = sc2.nextLine();
        Sala sala = lstSala.stream().filter(p->p.getIdSala().equals(idSala))
                .findFirst()
                .orElse(null);

        if (sala != null){
            mstAsientos(sala.getLstAsiento());
            System.out.println(
                    "-------------------------------------------------------------------------------"
            );
        }else{
            System.out.println("La sala no existe");
        }
        System.out.println("\n");
    }

    public static void mstAsientos(List<Asientos> lstAsientos){
        String array[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N","O"};
        List<Asientos> lstAsientosFila = new ArrayList<>();

        System.out.println("Asientos: ");
        for (int x=0 ; x < array.length ; x++) {
            String fila = array[x];
            lstAsientosFila = lstAsientos.stream().filter(p -> p.getFila().equals(fila) ).toList();
            if(lstAsientosFila.size() > 0){
                AtomicReference<String> asientoFila = new AtomicReference<>("");
                lstAsientosFila.forEach(asiento ->{
                    asientoFila.set(asientoFila.get() + "|" + asiento.getFila() + asiento.getUbicacion() +"\t");
                });
                System.out.println(asientoFila.get()+ "|");
            }
        }
    }

    public static void insSala(List<Sala> lstSalas){
        Scanner sc1 = new Scanner(System.in);
        Sala sala = new Sala();
        try {
            sala.setIdSala(getAutCodigo(lstSalas));
            System.out.println("Registrar el numero de Sala");
            sala.setSala(sc1.nextInt());
            System.out.println("Registrar la sinopsis de la pelicula");
            sala.setLstAsiento(new ArrayList<>());
            lstSalas.add(sala);
            System.out.println("Se registro correctamente la sala Codigo: " + sala.getIdSala());
        }
        catch(Exception e){
            System.out.println("Por favor, ingrese un dato valido");
        }
    };

    public static void insAsientos(List<Sala> lstSala, List<Asientos> lstAsientos){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Registrar el numero de Sala");
        String idSala = sc2.nextLine();
        Sala sala = lstSala.stream().filter(p->p.getIdSala().equals(idSala))
                .findFirst()
                .orElse(null);

        if (sala != null){
            lstAsientos.removeIf(asientos -> asientos.getSala().equals(idSala));
            String salir = "F";
            do {
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Registrar la fila de la Sala Ejemplo ('A', 'B', 'C', etc):");
                String Fila = sc3.nextLine();
                System.out.println("Ingresar la cantidad de asientos para la fila (" + Fila + "):");
                int nroAsientos = sc3.nextInt();
                for (int i = 1; i <= nroAsientos ; i++) {
                    lstAsientos.add(new Asientos(idSala, Fila, i));
                }
                Scanner sc4 = new Scanner(System.in);
                System.out.println("Presione (C) Continuar - (F) Finalizar:");
                salir = sc4.nextLine();
            }
            while (salir.equals("C"));
            for(int i = 0; i < lstSala.size(); i++) {
                if (lstSala.get(i).getIdSala().equals(idSala)) {
                    lstSala.get(i).setLstAsiento(lstAsientos.stream().filter(p2 -> p2.getSala().equals(idSala)).toList());
                    break;
                }
            }
            lstSala.size();
            System.out.println("Se registrarón los cambios correctamentes");
            System.out.println(
                    "-------------------------------------------------------------------------------"
            );
        }else{
            System.out.println("La sala no existe");
        }
        System.out.println("\n");
    };

    public static void delSala(List<Sala> lstSalas){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Ingresa el codigó de pelicula que deseas eliminar");
        String idSala = sc3.nextLine();
        lstSalas.removeIf(pelicula -> pelicula.getIdSala().equals(idSala));
        System.out.println("Se elimino correctamente la pelicula, Codigo: " + idSala);
    }

    public static  String getAutCodigo(List<Sala> lstSala){
        AtomicInteger idSala = new AtomicInteger();
        lstSala.forEach(sala1 -> {
            int valSala = Integer.parseInt(sala1.getIdSala());
            if(idSala.get() < valSala){
                idSala.set(valSala);
            };
        });

        String codigo = "000" + Integer.toString((idSala.get() + 1));
        int longitud = codigo.length();
        return codigo.substring(longitud - 3, 4);
    }
}
