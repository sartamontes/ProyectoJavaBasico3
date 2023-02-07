package co.curso;

public class Texto {

    public static void main(String[] args) {

        String[] cadenas = {"Uno", "Dos", "Tres","Cuatro"};

        System.out.println(concatenaCadenas(cadenas));

    }

    // Función que recoge una array de cadenas y lo concatena
    public static String concatenaCadenas(String[] cadenas){

        String cadenaFinal = "";
        for (String cadena : cadenas) {
            cadenaFinal += cadena;

        }
        return  cadenaFinal;
    }
}
