package Clases;

public class Asientos {
    private String sala;
    private String fila;
    private int ubicacion;

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Asientos() {
    }

    public Asientos(String sala, String fila, int ubicacion) {
        this.sala = sala;
        this.fila = fila;
        this.ubicacion = ubicacion;
    }
}
