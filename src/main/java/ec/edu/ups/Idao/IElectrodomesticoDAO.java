/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Idao;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;

/**
 *
 * @author NANCY
 */
public interface IElectrodomesticoDAO {
    public void create(Television televicion);
    public void creat(Lavadora lavadora);
    public List<Lavadora> findAll();
    public List<Television> findAll2();
}
