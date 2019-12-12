/**
 * @author (nizvan)
 * @version (v1.0.0)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal{
  public static void main(String[] args) throws IOException{
    BufferedReader inA = new BufferedReader(new InputStreamReader(System.in));
    String palabra = "";
    int fin = 0;
    
    //Introducir la palabra
    System.out.println("Introduzca la palabra");
    palabra = inA.readLine();
    
    //Evaluar la longitud de la palabra
    fin = palabra.length();
    System.out.println("\nSu palabra tiene " + fin + " caracteres, entonces: ");
    System.out.println("");
    
    //Imprimir la palabra
    for(int i = 0; i < fin; i++){
      System.out.println(palabra);
    }
  }
}
