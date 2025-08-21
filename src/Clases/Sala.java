package Clases;

import java.util.List;

public class Sala implements Comparable<Sala>{
    private String idSala;
    private int sala;
    private List<Asientos> lstAsiento;

    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public List<Asientos> getLstAsiento() {
        return lstAsiento;
    }

    public void setLstAsiento(List<Asientos> lstAsiento) {
        this.lstAsiento = lstAsiento;
    }

    public Sala() {
    }

    public Sala(String idSala, int sala, List<Asientos> lstAsiento) {
        this.idSala = idSala;
        this.sala = sala;
        this.lstAsiento = lstAsiento;
    }

    @Override
    public int compareTo(Sala o) {
        return 0;
    }
}
