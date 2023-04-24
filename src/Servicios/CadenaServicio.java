package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 * Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el
 * usuario y devuelve verdadero si la contiene y falso si no
 *
 * @author alexi
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ;

    /*métodos: Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
 * ingresada.*/
    public void mostrarVocales(Cadena c1) {
        int contador = 0;
        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            char c = c1.getFrase().toLowerCase().charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("la cantidad de bocales que tiene la cadena es:" + contador);
    }

    /*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.*/
    public void invertirFrase(Cadena c1) {
        String frase = c1.getFrase();
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }
        System.out.println("La frase invertida es " + fraseInvertida);
    }

    /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
    contabilizar cuántas veces se repite el carácter en la frase,
 * por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(Cadena c1) {
        int contador = 0;
        System.out.println("Ingrese una letra ");
        String frase = c1.getFrase();
        String letra = leer.next();
        char letraUsuario = letra.charAt(0);
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letraUsuario) {
                contador++;
            }
        }
        System.out.println("El caracter " + "'" + letraUsuario + "'" + " se repite " + contador + " veces");
    }

    /*Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario*/
    public void comparLonguitud(Cadena c1) {
        System.out.println("Ingrese una nueva frase");
        String nuevaFrase = leer.next();
        if (c1.getLongitudFrase() == nuevaFrase.length()) {
            System.out.println("La longuitud de las frases son iguales");
        } else {
            System.out.println("La longuitud de frases no son iguales");
        }
    }

    /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una
 *nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrase(Cadena c1) {
        System.out.println("ingrese una nueva frase");
        String nuevaFrase = leer.next();
        System.out.println("la Frase resulatnte es: " + c1.getFrase().concat(" " + nuevaFrase));
    }

    /*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la
 frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.*/
    public void reemplazar(Cadena c1) {
        System.out.println("Ingrese el caracter para reemplazar la letra 'a' ");
        String caracter = leer.next();
        String frase = c1.getFrase();
        String nuevaFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                nuevaFrase += caracter;
            }else{
                nuevaFrase += frase.charAt(i);
            }
        }
        System.out.println("LA nueva Frase es: " + nuevaFrase);
    }
}
