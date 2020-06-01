/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author NANCY
 */
public class Television extends Electrodomestico{
    private int resolucion;
    private boolean puertoHDMI;

    public Television() {
    }

    public Television(int resolucion, boolean puertoHDMI, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.puertoHDMI = puertoHDMI;
    }
    

    public Television(int codigo) {
        super(codigo);
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }
    // obtener precio final clase Television
    @Override
    public double obtenerPrecioFinal()
    {
       double aumento=0;
       double aumento2=0;
       if(resolucion>40)
       {
           aumento=super.getPrecioBase()*0.3;
       }
       if(puertoHDMI==true)
       {
           aumento2=50;
       }
        return (super.obtenerPrecioFinal()+aumento+aumento2);
       
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.resolucion;
        hash = 59 * hash + (this.puertoHDMI ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Television other = (Television) obj;
        if (this.resolucion != other.resolucion) {
            return false;
        }
        if (this.puertoHDMI != other.puertoHDMI) {
            return false;
        }
        return true;
    }
    
    
    
    
    @Override
    public String toString() {
        return super.toString()+ "\nTelevision{" + "resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI + '}';
    }
}
