
package lab_ipc;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejemplo1_Lab {
    
    public static void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> historial = new ArrayList<>();
        boolean repetir = true;
        char[] letras = {'a','b','c','d','e','f','g'};
        
        while (repetir == true) {
            
            System.out.println(" Menu");
            System.out.println("1. Imprimir Matriz aleatoria");
            System.out.println("2. Mostrar historial matrices");
            System.out.println("3. Salir");
            System.out.print("Escoge una opcion: ");
            
            int opcionMenu = sc.nextInt();
            
            switch (opcionMenu) {
                case 1:
                    
                    System.out.print("De cuántas casillas quiere la matriz?:");
                    int tamanomatriz = sc.nextInt();
                    
                    char[][] matrizgenerada = new char [tamanomatriz][tamanomatriz];
                    
                    for (int i = 0; i < tamanomatriz; i++) {
                        for (int j = 0; j < tamanomatriz; j++) {
                            
                            int letrarandom = (int)(Math.random()*letras.length);
                            
                            
                            matrizgenerada[i][j]=letras[letrarandom];
                            
                            
                        }
                    }
                    
                    for (char[] lol: matrizgenerada){
                        System.out.print("| ");
                        for (char columna : lol) {
                            System.out.print(columna+ " | ");
                        }
                        System.out.println("");
                    }
                    historial.add(tamanomatriz);
                    
                    break;
                case 2:
                    
                    if (historial.isEmpty()) {
                        System.out.println("No hay historial");
                        
                    }
                    else{
                        
                        for (int lol2 : historial) {
                            System.out.println("El tamaño de la matriz es: "+ lol2);
                        }
                        
                    }    
                        
                    break;
                case 3:
                    
                    repetir = false;
                    break;
                default:
                    System.out.println("Escoga un numero de los presentados anteriormente");
            }
            
        }
        
        
        
    }
    
    
    
}
