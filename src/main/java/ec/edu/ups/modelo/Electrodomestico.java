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
public class Electrodomestico implements Comparable<Electrodomestico> {
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico() {
    }

    
    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public Electrodomestico(int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.codigo;
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
        final Electrodomestico other = (Electrodomestico) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public int compareTo(Electrodomestico o) {
        return (int) (this.precioBase - o.precioBase);
    }
    
//obtener precio final clase Electrodomestico
    public double obtenerPrecioFinal()
    {
        String A="A";
        String B="B";
        String C="C";
        String D="D";
        String E="E";
        String F="F";
        char c1= A.charAt(0);
        char c2= B.charAt(0);
        char c3= C.charAt(0);
        char c4= D.charAt(0);
        char c5= E.charAt(0);
        char c6= F.charAt(0);
        double presio=0;
        if(consumoEnergetico==c1){
            presio=100; }
        if(consumoEnergetico==c2){
            presio=80;}
        if(consumoEnergetico==c3){
            presio=60;}
        if(consumoEnergetico==c4){
            presio=50;}
        if(consumoEnergetico==c5){
            presio=30;}
        if(consumoEnergetico==c6){
            presio=10;}
        if(peso >= 0 && peso <= 19){
	    presio += 10;
	} else if(peso >= 20 && peso <= 49){
	    presio += 50;
	}if(peso >= 50 && peso <= 79){
	    presio += 80;
	}else if(peso >= 80){
	    presio += 100;
	}
	return (presio+precioBase);
    }
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    
    
    
    
}
