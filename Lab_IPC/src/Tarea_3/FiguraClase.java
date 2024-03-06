
package Tarea_3;


public abstract class FiguraClase {
    protected double longitud;
    protected int numLados;

    public FiguraClase(int numLados, double numLadosIguales) {
        this.numLados = numLados;
        this.longitud = numLadosIguales;
    }
    
    protected abstract double calcularArea();
    protected abstract void entregable();
}


