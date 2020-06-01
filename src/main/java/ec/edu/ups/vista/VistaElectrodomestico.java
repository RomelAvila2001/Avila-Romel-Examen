/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NANCY
 */
public class VistaElectrodomestico {
    private Scanner entrada;
    
    public VistaElectrodomestico()
    {
        entrada=new Scanner(System.in);
    }
    
    public Lavadora ingresarLavadora()
    {
        System.out.println("ingrese carga");
        int carga=entrada.nextInt();
        System.out.println("ingrese codigo");
        int codigo=entrada.nextInt();
        System.out.println("ingrese descripcion");
        String descripcion=entrada.next();
        System.out.println("ingrese presio base");
        double presioBase=entrada.nextDouble();
        System.out.println("ingrese color");
        String color= entrada.next();
        System.out.println("ingrese consumo energetico");
        char consumoEnergetico = entrada.next().charAt(0);
        System.out.println("ingrese peso");
        int peso=entrada.nextInt();
        return new Lavadora(carga,codigo,descripcion,presioBase,color,consumoEnergetico,peso);
    }
    
     public Television ingresarTelevision()
    {
        System.out.println("ingrese resolucion");
        int resolucion=entrada.nextInt();
        System.out.println("Tiene puertoHDMI");
        boolean puertoHDMI= entrada.nextBoolean();
        System.out.println("ingrese codigo");
        int codigo=entrada.nextInt();
        System.out.println("ingrese descripcion");
        String descripcion=entrada.next();
        System.out.println("ingrese presio base");
        double presioBase=entrada.nextDouble();
        System.out.println("ingrese color");
        String color= entrada.next();
        System.out.println("ingrese consumo energetico");
        char consumoEnergetico = entrada.next().charAt(0);
        System.out.println("ingrese peso");
        int peso=entrada.nextInt();
        return new Television(resolucion,puertoHDMI,codigo,descripcion,presioBase,color,consumoEnergetico,peso);
    }
    
     public void mostrarTelevisiones(List<Television> televisiones){

	for(Television televisor : televisiones){

	    System.out.println(televisor.toString());

	}

    }

    public void mostrarLavadoras(List<Lavadora> Lavadoras){

	for(Lavadora lavadora : Lavadoras){

	    System.out.println(lavadora.toString());

	}

    }
}
