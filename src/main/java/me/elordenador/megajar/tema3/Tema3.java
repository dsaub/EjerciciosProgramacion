package me.elordenador.megajar.tema3;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.tema3.paresonones.ParesONones;
import me.elordenador.megajar.tema3.positivoynegativo.Positivoynegativo;
import me.elordenador.megajar.tema3.raizcuadrada.RaizCuadrada;
import me.elordenador.megajar.tema3.restar.Restar;
import me.elordenador.megajar.utils.ScrUtils;

public class Tema3 {
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();
        System.out.println("Menu: ");
        System.out.println("1. Positivo y Negativo");
        System.out.println("2. Raiz Cuadrada");
        System.out.println("3. Restar");
        System.out.println("4. Año Bisiesto");
        System.out.println("5. Parte Decimal");
        System.out.println("6. Números Ordenados");
        System.out.println("7. Contar Cifras");
        System.out.println("8. Mayor, Menor, Mediano");
        System.out.println("9. Predicción Meteorologica");
        System.out.println("10. Pares");
        System.out.println("11. Impares");
        System.out.println("12. Pares o nones");
        System.out.println("13. Dibujado con asteriscos");
        System.out.println("14. Tabla de Multiplicar");
        System.out.println("15. Acumulador simple");
        System.out.println("16. Acumulador Interactivo");
        System.out.println("17. Estadística Basica");
        System.out.println("18. Notas de clase");
        System.out.println("19. Factorial");
        System.out.println("20. Sucesión de Fibonacci");
        System.out.println("21. Numero de la Suerte");
        System.out.println("22. Primo");
        System.out.println("23. Eratóstenes");
        System.out.println("24. Omirps");
        System.out.println("25. Loteria primitiva");
        System.out.println("26. Quiniela");
        System.out.println("27. Calculadora");
        System.out.println("28. Juego del número secreto");
        System.out.println("29. Nóminas");
        System.out.println("30. Póligonos");
        System.out.println("31. Máquina expendedora");
        System.out.println("32. Calculadora de Edad");
        System.out.println("33. Contar días");
        System.out.println("34. TPV ultramegasimplificada");
        System.out.println("35. Número a Letra");
        System.out.println("36. Atracción Gravitatoria");
        System.out.println("37. Contar Cifras");
        System.out.println("38. Conjetura de Goldbach");
        System.out.println("39. Ruleta");
        System.out.println("40. Dados");
        System.out.println("41. Juego de Memoria");
        System.out.println("42. Tres en Raya");
        System.out.println("43. Tragaperras.");
        System.out.println("44. Juego de Nim");
        int selection = InputUtils.inputInt("Seleccione: ");
        switch (selection) {
            case 1:
                Positivoynegativo.main(args);
            case 2:
                RaizCuadrada.main(args);
            case 3:
                Restar.main(args);
            case 12:
                ParesONones.main(args);
        }
    }
}
