
package Tarea_3;


public class Figura3Lados extends FiguraClase{

    private double altura;
    
    public Figura3Lados(int numLados, double longitud) {
        super(numLados,longitud);
        this.altura = longitud;
        entregable();
    }
    public Figura3Lados(int numLados, double base, double altura) {
        super(numLados, base);
        this.altura = longitud;
        entregable();
    }
    
    
    @Override
    protected double calcularArea() {
        
        double resultado;
        if (longitud == altura) {
            resultado = ((longitud*altura)*Math.sqrt(3))/4;
        }
        else{
            resultado = (1/2)*longitud*altura;
            
        }
        return resultado;
    }

    @Override
    protected void entregable() {
        if (longitud == altura) {
            System.out.println("El triángulo equilatero de "+numLados+" lados, tiene área de: " + calcularArea());
        }
        else{
            System.out.println("El triangulo de "+numLados+" lados, tiene área de: " + calcularArea());
            
        }
        
        
    }
    
    
    
    
}
