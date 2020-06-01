/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.Idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author NANCY
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO {

    private SortedSet<Electrodomestico> lista;

    public ElectrodomesticoDAO() {
        lista = new TreeSet<>();
    }
    
    
    @Override
    public void create(Television televicion) {
        lista.add(televicion);
    }

    @Override
    public void creat(Lavadora lavadora) {
        lista.add(lavadora);
    }

    @Override
    public List<Lavadora> findAll() {
        ArrayList<Lavadora> lava = new ArrayList<>();

	Lavadora l = new Lavadora();

	for(Electrodomestico e : lista){

	    if(e.getClass() == l.getClass()){

		lava.add((Lavadora)e);

	    }

	}

	return lava;
    }

    @Override
    public List<Television> findAll2() {
        ArrayList<Television> teles = new ArrayList<>();

	Television t = new Television();

	for(Electrodomestico e : lista){

	    if(e.getClass() == t.getClass()){

		teles.add((Television)e);

	    }

	}

	return teles;

    }
}
    

