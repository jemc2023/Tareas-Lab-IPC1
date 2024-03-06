
package Tarea_3;


public class Figura5Lados extends FiguraClase{

    private double apotema;
    
    public Figura5Lados(int numLados, double longitud, double apotema) {
        super(numLados, longitud);
        this.apotema = apotema;
        entregable();
    }

    @Override
    protected double calcularArea() {
        return (5/2)*longitud*apotema;
    }

    @Override
    protected void entregable() {
        System.out.println("El pentágono de "+numLados+" lados, tiene área de: "+calcularArea());
    }
    
    
    
}
