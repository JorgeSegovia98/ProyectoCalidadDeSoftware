import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Diccionario {
    private ArrayList<String> palabras;

    public Diccionario() {
        this.palabras = new ArrayList<String>();
        leerArchivo();

    }

    public void leerArchivo(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/palabras.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                palabras.add(linea);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String buscarPalabra(String palabraIngresada){
        for (String palabra : palabras) {
            String[] palabrasEncontrada = palabra.split(";");
            if (palabraIngresada.equalsIgnoreCase(palabrasEncontrada[0])){
                return presentarTraducion(palabra);
            }
        }
        return "No se encontro la palabra";
    }


    public String presentarTraducion(String diccionario){
        String[] traducion = diccionario.split(";");
        return "Sanscrito = " + traducion[0] + "\n" +
                "Español = " + traducion[2] + "\n" +
                "Ingles = " + traducion[1];
    }

    public void agregarPalabra(String palabras){
        try {
            FileWriter writer = new FileWriter("src/Palabras.txt", true);
            writer.write(palabras + "\n" );
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void quitarPalabra(){

    }

    public void actualizarPalabra(){

    }

}


