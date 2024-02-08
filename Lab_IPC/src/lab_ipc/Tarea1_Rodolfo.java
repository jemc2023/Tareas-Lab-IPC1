
package lab_ipc;

import java.util.Scanner;


public class Tarea1_Rodolfo {
    
    public static void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;
        
        while (repetir==true) {            
            
            System.out.println("Menu");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5. Tablas de multiplicar");
            System.out.println("6.Salir");
            System.out.print("\nEscoga uno: ");
            int validador = sc.nextInt();
            float resultado=0;
            float num1, num2;
            
            switch (validador) {
                
                
                
                case 1:
                    
                    
                    System.out.print("Ingrese el primer numero: ");
                    num1=sc.nextFloat();
                    System.out.print("Ingrese el segundo numero: ");
                    num2=sc.nextFloat();
                    resultado = num1+num2;
                    
                    System.out.println("\nEl resultado es: "+resultado+"\n");
                    
                    break;
                case 2:
                    
                    System.out.print("Ingrese el primer numero: ");
                    num1=sc.nextFloat();
                    System.out.print("Ingrese el segundo numero: ");
                    num2=sc.nextFloat();
                    resultado = num1-num2;
                    System.out.println("\nEl resultado es: "+resultado+"\n");
                    
                    break;
                case 3:
                    
                    System.out.print("Ingrese el primer numero: ");
                    num1=sc.nextFloat();
                    System.out.print("Ingrese el segundo numero: ");
                    num2=sc.nextFloat();
                    resultado = num1*num2;
                    System.out.println("\nEl resultado es: "+resultado+"\n");
                    break;
                case 4:
                    
                    int resultadocociente;
                    
                    System.out.print("Ingrese el primer numero: ");
                    num1=sc.nextFloat();
                    System.out.print("Ingrese el segundo numero: ");
                    num2=sc.nextFloat();
                    
                    while (num2 == 0) {                        
                        System.out.println("No sea trollo y no ponga '0'");
                        System.out.print("Ingrese otro valor: ");
                        num2=sc.nextFloat();
                    }
                    
                    resultadocociente = (int)(num1/num2);
                    resultado = num1%num2;
                    System.out.println("\nEl cociente es: "+resultadocociente);
                    System.out.println("El residuo es: "+resultado+"\n");
                    
                    break;
                case 5:
                    
                    float indice;
                    System.out.print("Ingrese el numero de la tabla de multiplicar: ");
                    indice = sc.nextFloat();
                    System.out.print("Ingrese numero de inicio: ");
                    num1 = sc.nextFloat();
                    System.out.print("Ingrese numero de fin: ");
                    num2 = sc.nextFloat();
                    
                    if (num2 <= num1) {
                        System.out.println("No sea trollo y no ponga '0'");
                        System.out.print("Ingrese el valor de inicio: ");
                        num1=sc.nextFloat();
                        System.out.print("Ingrese el valor de fin: ");
                        num2=sc.nextFloat();
                    }
                    
                    System.out.println("");
                    while (num1 <= num2) {                        
                        resultado = num1*indice;
                        
                        System.out.println(indice +" x "+num1+ " = "+resultado);
                        num1++;
                        
                    }
                    System.out.println("");
                    break;
                case 6:
                    repetir = false;
                    System.out.println("Gracias por haberme quitado el tiempo, triple sentuajesimo cuarto jo de la gran ****");
                    break;
                default:
                    System.out.println("No sea trollo y escoga una opción anterior");
            }
            
            
        }
        
        
    }
    
    
    
    
}
