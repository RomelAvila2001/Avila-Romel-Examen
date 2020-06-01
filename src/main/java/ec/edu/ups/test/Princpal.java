/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.Idao.IElectrodomesticoDAO;
import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.vista.VistaElectrodomestico;

/**
 *
 * @author NANCY
 */
public class Princpal {
    public static void main(String[] args) {
	Princpal principal = new Princpal();
    }
    private VistaElectrodomestico vista;
    private IElectrodomesticoDAO dao;
    private Electrodomestico modelo;
    private ControladorElectrodomestico controlador;
    public Princpal(){
	vista = new VistaElectrodomestico();
	modelo = new Electrodomestico();
	dao = new ElectrodomesticoDAO();
	controlador = new ControladorElectrodomestico(vista, modelo, dao);
	System.out.println("Televisor 1");
	controlador.registrarTelevision();
	System.out.println("Televisor 2");
	controlador.registrarTelevision();
	System.out.println("Televisor 3");
	controlador.registrarTelevision();
	System.out.println("Lavadora 1");
	controlador.registrarLavadora();
	System.out.println("Lavadora 2");
	controlador.registrarLavadora();
	System.out.println("Lavadora 3");
	controlador.registrarLavadora();
	System.out.println("\nTelevisores: ");
	controlador.verTelevisiones();
	System.out.println("\nLavadoras: ");
	controlador.verLavadoras();

    }
}
