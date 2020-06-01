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
public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int codigo) {
        super(codigo);
    }

    public Lavadora(int carga, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    
    
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.carga;
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
        final Lavadora other = (Lavadora) obj;
        if (this.carga != other.carga) {
            return false;
        }
        return true;
    }

    
    @Override
    public double obtenerPrecioFinal()
    {
        double aumento=0;
        if(carga>30)
        {
            aumento=50;
        }
        return (+aumento);
        
    }
    
    @Override
    public String toString() {
        return super.toString()+ "\nLavadora{" + "carga=" + carga + '}';
    }
    
}
