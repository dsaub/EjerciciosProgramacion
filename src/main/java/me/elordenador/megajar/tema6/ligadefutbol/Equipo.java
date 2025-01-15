package me.elordenador.megajar.tema6.ligadefutbol;

public class Equipo {
    private String nombre;
    private int jugados, ganados, empatados, perdidos, puntos;

    public Equipo(String nombre, int jugados, int ganados, int empatados, int perdidos, int puntos) {
        this.nombre = nombre;
        this.jugados = jugados;
        this.ganados = ganados;
        this.empatados = empatados;
        this.perdidos = perdidos;
        this.puntos = puntos;

    }

    public Equipo() {
        this("Desconocido", 0, 0, 0, 0, 0);
    }

    public String exportRawTeam() {
        return nombre + "|" + jugados + "|" + ganados + "|" + empatados + "|" + perdidos + "|" + puntos;
    }

    public void importRawTeam(String rawData) {
        String[] exportedRawData = rawData.split("\\|");
        nombre = exportedRawData[0];
        jugados = Integer.parseInt(exportedRawData[1]);
        ganados = Integer.parseInt(exportedRawData[2]);
        empatados = Integer.parseInt(exportedRawData[3]);
        perdidos = Integer.parseInt(exportedRawData[4]);
        puntos = Integer.parseInt(exportedRawData[5]);
    }

    public void setName(String name) {
        nombre = name;
    }
    public String getName() {
        return nombre;
    }

    public void setJugados(int jugados) {
        this.jugados = jugados;
    }
    public int getJugados() {
        return jugados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }
    public int getGanados() {
        return ganados;
    }

    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }
    public int getEmpatados() {
        return empatados;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }
    public int getPerdidos() {
        return perdidos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public int getPuntos() {
        return puntos;
    }
}
