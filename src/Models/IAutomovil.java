/*
 * Interfaz para el modelo Automovil
 * 
 * 
 */
package Models;

/**
 *
 * @author Salvador Solis Atenco
 */
public interface IAutomovil {
    public String ordenarAuto();
    public abstract double cost();
    public String getMarca();
    public String getSerie();
    public float getPrecioBase();
}