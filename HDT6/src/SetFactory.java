/**
 *
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * 
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Se arregló el setFactory para usar genéricos. 
public class SetFactory<E>{
    /**
     * 
     * @param Se le ingresa el tipo de Set que se desea en un número entre 0 y 1
     * @return El tipo de Set que se solicitó
     */
    
    public Set<E> getSet(int tipo){
        //Si se ingresa 0 retorna un HashSet
        if (tipo == 0){
            return new HashSet<E>();
        }
        //Si se ingresa 1 retorna un TreeSet
        if (tipo == 1){
            return new TreeSet<E>();
        }
        if (tipo == 2){
            //Si se ingresa 2 retorna un LinkedHashSet
            return new LinkedHashSet<E>();
        }
        else{
            //Para que haya un retorno por default se coloca el null
            return null;
       }
    }
}

