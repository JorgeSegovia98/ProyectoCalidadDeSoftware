import javax.swing.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        File palabras = new File("src/palabras.txt");
        Diccionario diccionario = new Diccionario();
        System.out.println(diccionario.buscarPalabra("Asana"));

    }
}