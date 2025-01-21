package me.elordenador.megajar.tema6.ligadefutbol;

import java.util.ArrayList;

/**
 * Maneja todo sobre equipos
 * @version 1.0
 * @author Daniel Sánchez Úbeda
 */
public class Equipo {
    private String nombre;
    private int jugados, ganados, empatados, perdidos, puntos;

    private static ArrayList<Equipo> equipos = new ArrayList<Equipo>();

    /**
     * Crea un equipo con la información proveida
     * @param nombre El nombre del equipo
     * @param jugados La cantidad de partidas jugadas
     * @param ganados La cantidad que ha ganado
     * @param empatados La cantidad que ha empatado
     * @param perdidos La cantidad que ha perdido
     * @param puntos Los puntos del equipo
     */
    public Equipo(String nombre, int jugados, int ganados, int empatados, int perdidos, int puntos) {
        this.nombre = nombre;
        this.jugados = jugados;
        this.ganados = ganados;
        this.empatados = empatados;
        this.perdidos = perdidos;
        this.puntos = puntos;

    }

    /**
     * Crea un equipo Vacio
     */
    public Equipo() {
        this("Desconocido", 0, 0, 0, 0, 0);
    }

    /**
     * Consigue un string exportado del equipo
     * @return La información del equipo en 1 linea. (Leible por la maquina)
     */
    public String exportRawTeam() {
        return nombre + "|" + jugados + "|" + ganados + "|" + empatados + "|" + perdidos + "|" + puntos;
    }

    /**
     * Devuelve una representación en String
     * @return EL string (legible por humano)
     */
    public String toString() {
        return "Nombre: " + nombre + ", Nº Jugadas: " + jugados + ", Nº Ganados: " + ganados + ", Nº Perdidos: " + perdidos + ", Nº Puntos: " + puntos;
    }

    /**
     * Importa los datos de un equipo rapidamente si se provee un string exportado con exportRawTeam();
     * @param rawData
     */
    public void importRawTeam(String rawData) {
        String[] exportedRawData = rawData.split("\\|");
        nombre = exportedRawData[0];
        jugados = Integer.parseInt(exportedRawData[1]);
        ganados = Integer.parseInt(exportedRawData[2]);
        empatados = Integer.parseInt(exportedRawData[3]);
        perdidos = Integer.parseInt(exportedRawData[4]);
        puntos = Integer.parseInt(exportedRawData[5]);
    }

    /**
     * Establece el nombre del equipo
     * @param name Nombre del equipo
     */
    public void setName(String name) {
        nombre = name;
    }

    /**
     * Devuelve el nombre del equipo
     * @return Nombre del equipo
     */
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

    public static void addEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public static void setEquipo(int index, Equipo equipo) {
        equipos.set(index, equipo);
    }

    public static Equipo getEquipo(int index) {
        return equipos.get(index);
    }

    public static int length() {
        return equipos.size();
    }

    public static void wipe() {
        equipos = new ArrayList<Equipo>();
    }

    public static int getIndexByName(String nombre) {
        int index = -1;
        for (int i = 0; i < equipos.size(); i++) {
            Equipo equipo = equipos.get(i);
            if (equipo.getName().equals(nombre)) {
                index = i;
            }
        }
        return index;
    }
}
