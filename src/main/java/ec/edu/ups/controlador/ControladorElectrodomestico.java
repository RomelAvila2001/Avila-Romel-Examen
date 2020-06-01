/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.Idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.ArrayList;

/**
 *
 * @author NANCY
 */
public class ControladorElectrodomestico {

    private VistaElectrodomestico vista;
    private Electrodomestico modelo;
    private IElectrodomesticoDAO dao;

    public ControladorElectrodomestico(VistaElectrodomestico vista, Electrodomestico modelo, IElectrodomesticoDAO dao) {

        this.vista = vista;
        this.modelo = modelo;
        this.dao = dao;

    }

    public void registrarTelevision() {

        modelo = vista.ingresarTelevision();
        dao.create((Television) modelo);

    }

    public void registrarLavadora() {

        modelo = vista.ingresarLavadora();
        dao.creat((Lavadora) modelo);

    }

    public void verTelevisiones() {
        ArrayList<Television> televisiones = new ArrayList<>(dao.findAll2());
        vista.mostrarTelevisiones(televisiones);

    }

    public void verLavadoras() {

        ArrayList<Lavadora> lavadoras = new ArrayList<>(dao.findAll());
        vista.mostrarLavadoras(lavadoras);

    }

}
