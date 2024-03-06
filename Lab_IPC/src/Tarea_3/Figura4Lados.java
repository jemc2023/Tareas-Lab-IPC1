
package Tarea_3;


public class Figura4Lados extends FiguraClase{
    
    private double ladoDiff;
    public Figura4Lados(int numLados, double longitud) {
        super(numLados, longitud);
        this.ladoDiff = longitud;
        entregable();
    }
    
    public Figura4Lados(int numLados, double longitud, double ladoDiff) {
        super(numLados, longitud);
        this.ladoDiff = ladoDiff;
        entregable();
    }
    @Override
    protected double calcularArea() {
        return longitud*ladoDiff;
    }
    
    @Override
    protected void entregable() {
        if (longitud == ladoDiff) {
            System.out.println("El cuadrado de "+numLados+" lados, tiene área de: "+calcularArea());
        }
        else{
            System.out.println("El rectángulo de "+numLados+" lados, tiene área de: "+calcularArea());
        }
        
    }
    
    
    
    
}
