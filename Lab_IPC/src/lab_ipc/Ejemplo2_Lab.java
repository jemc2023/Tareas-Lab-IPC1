
package lab_ipc;


public class Ejemplo2_Lab {
    
    
    //int[] notas = {5,4,3,2,1};
    public static void bubbleSort(int[] numeros){
        
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length-1-i; j++) {
                if (numeros[j]>numeros[j+1]) {
                    int aux;
                    aux=numeros[j+1];
                    numeros[j+1]=numeros[j];
                    numeros[j]=aux;
                }
            }
        }
    
        for (int lol : numeros) {
            System.out.println(lol);
        }
        
    }
    
    
    
}
