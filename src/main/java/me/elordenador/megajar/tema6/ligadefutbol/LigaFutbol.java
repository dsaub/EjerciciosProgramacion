package me.elordenador.megajar.tema6.ligadefutbol;

import com.sun.jdi.event.MethodEntryEvent;
import me.elordenador.megajar.MegaJAR;

import java.io.*;
import java.util.Scanner;

public class LigaFutbol {
    private static final Scanner sc = new Scanner(System.in);
    private static final File archivo = new File("liga.dat");
    public static void main(String[] args) {
        boolean salida = false;
        while (!salida) {
            System.out.println(" PROGRAMA DE LA LIGA DE FUTBOL ");
            System.out.println();
            System.out.println("        MENÚ DE OPCIONES");
            System.out.println("1. Introducir datos");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Ordenar datos");
            System.out.println("4. Buscar un equipo");
            System.out.println("5. Borrar un equipo");
            System.out.println("6. Modificar un equipo");
            System.out.println("7. Guardar cambios");
            System.out.println("8. Cargar cambios");
            System.out.println("9. Salir");
            int option = 9;
            try {
                option = sc.nextInt();
                sc.nextLine();
            } catch (NumberFormatException exception) {
                System.err.println("No pudimos leer el numero");
            }

            switch (option) {
                case 1: introducirDatos(); break;
                case 2: mostrarDatos(); break;
                case 3: ordenarDatos(); break;
                case 4: buscarEquipo(); break;
                case 5: borrarEquipo(); break;
                case 6: modificarEquipo(); break;
                case 7: guardarCambios(); break;
                case 8: cargarCambios(); break;
                default: System.exit(0);
            }
        }
    }

    private static void cargarCambios() {
        try {
            FileInputStream in = new FileInputStream(archivo);

            byte[] bytes = in.readAllBytes();
            String texto = new String(bytes);

            String[] equipos = texto.split("\\n");
            for (String equipo : equipos) {
                Equipo equipo1 = new Equipo();
                equipo1.importRawTeam(equipo);
                Equipo.addEquipo(equipo1);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error cargando el archivo");
            if (MegaJAR.debug) e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error creando el archivo");
            if (MegaJAR.debug) e.printStackTrace();

        }

    }

    private static void guardarCambios() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < Equipo.length(); i++) {
            builder.append(Equipo.getEquipo(i).exportRawTeam());
            builder.append("\n");
        }

        String texto = builder.toString();

        if (!archivo.exists()) {
            try {
                boolean fileCreated = archivo.createNewFile();
                if (!fileCreated) {
                    System.err.println("Error creando el archivo");
                    if (MegaJAR.debug) System.err.println("No hay mensaje de depuración disponible");
                }
            } catch (IOException e) {
                System.err.println("Error creando el archivo");
                if (MegaJAR.debug) e.printStackTrace();
            }


        }


        try {
            FileOutputStream out = new FileOutputStream(archivo);
            byte[] data = texto.getBytes();

            for (byte data2 : data) {
                try {
                    assert out != null;
                    out.write(data2);
                } catch (IOException e) {
                    System.err.println("Error al escribir al archivo");
                    if (MegaJAR.debug) e.printStackTrace();
                }
            }
            out.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error al escribir al archivo");
            if (MegaJAR.debug) e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo");
            if (MegaJAR.debug) e.printStackTrace();
        }


    }

    private static void modificarEquipo() {

        String nEquipo = "";

        try {
            System.out.print("Escribe el nombre EXACTO del equipo: ");
            nEquipo = sc.nextLine();
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error al leer el texto");
            if (MegaJAR.debug) e.printStackTrace();
        }


        int index = Equipo.getIndexByName(nEquipo);

        if (index < 0) {
            System.out.println("No se ha encontrado el equipo.");
        } else {
            Equipo equipo = Equipo.getEquipo(index);

            System.out.println("¿Que desea cambiar?\n" +
                    "\n" +
                    "1. Nombre del equipo\n" +
                    "2. Partidas jugadas\n" +
                    "3. Partidas ganadas\n" +
                    "4. Partidas empatadas\n" +
                    "5. Partidas perdidas\n" +
                    "6. Puntos del equipo");
            int seleccion = -1;

            try {
                seleccion = sc.nextInt(); sc.nextLine();
            } catch (Exception e) {
                System.err.println("Ha ocurrido un error al leer el texto");
                if (MegaJAR.debug) e.printStackTrace();
                sc.nextLine();
            }

            if (seleccion == 1) {
                String nombre_equipo = "";
                try {
                    System.out.print("Indique el nuevo nombre: ");
                    nombre_equipo = sc.nextLine();
                } catch (Exception e) {
                    System.err.println("Ha ocurrido un error al leer el texto");
                    if (MegaJAR.debug) e.printStackTrace();
                }
                if (!equipo.equals("")) equipo.setName(nombre_equipo);
            } else if (seleccion == 2) {
                int partidas_jugadas = -1;
                try {
                    System.out.print("Indique la cantidad de partidas jugadas actuales: ");
                    partidas_jugadas = sc.nextInt(); sc.nextLine();
                } catch (Exception e) {
                    System.err.println("Ha ocurrido un error al leer el texto");
                    if (MegaJAR.debug) e.printStackTrace();
                    sc.nextLine();
                }

                if (partidas_jugadas >= 0) equipo.setJugados(partidas_jugadas);
            } else if (seleccion == 3) {
                int partidas_empatadas = -1;
                try {
                    System.out.print("Indique la cantidad de partidas ganadas actuales: ");
                    partidas_empatadas = sc.nextInt(); sc.nextLine();
                } catch (Exception e) {
                    sc.nextLine();
                    System.err.println("Ha ocurrido un error al leer el texto");
                    if (MegaJAR.debug) e.printStackTrace();
                }

            } else if (seleccion == 4) {

            } else if (seleccion == 5) {

            } else if (seleccion == 6) {

            }
        }

    }

    private static void borrarEquipo() {

    }

    private static void buscarEquipo() {

    }

    private static void ordenarDatos() {

    }

    private static void mostrarDatos() {
        System.out.println("Equipo                    Jugados     Ganados     Empatados     Perdidos    Puntos");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < Equipo.length(); i++) {
            Equipo equipo = Equipo.getEquipo(i);
            System.out.printf("%-27s %-11d %-11d %-13d %-11d %-4d\n", equipo.getName(), equipo.getJugados(), equipo.getGanados(), equipo.getEmpatados(), equipo.getPerdidos(), equipo.getPuntos());
        }
        System.out.println("\n\nPresione ENTER para continuar");
        sc.nextLine();

    }

    public static void introducirDatos() {
        try {
            System.out.print("Nombre del Equipo: ");
            String equipo = sc.nextLine();

            System.out.print("Nº Partidas jugadas: ");
            int p_jugadas = sc.nextInt(); sc.nextLine();

            System.out.println("Nº Partidas Ganadas: ");
            int p_ganadas = sc.nextInt(); sc.nextLine();

            System.out.print("Nº Partidas Empatadas: ");
            int p_empatadas = sc.nextInt(); sc.nextLine();

            System.out.print("Nº Partidas Perdidas: ");
            int p_perdidas = sc.nextInt(); sc.nextLine();

            System.out.print("Puntos: ");
            int puntos = sc.nextInt(); sc.nextLine();

            Equipo equipo1 = new Equipo(equipo, p_jugadas, p_ganadas, p_empatadas, p_perdidas, puntos);
            Equipo.addEquipo(equipo1);
        } catch (Exception e) {
            System.err.println("No pudimos leer los datos.");
        }
    }
}
