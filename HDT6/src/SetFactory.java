import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bicimotoca
 * @param <E>
 */

//Se arregló el setFactory para usar genéricos. 
public class SetFactory<E>{
    public Set<E> getSet(int tipo){
        if (tipo == 0){
            return new HashSet<E>();
        }
        if (tipo == 1){
            return new TreeSet<E>();
        }
        if (tipo == 2){
            return new LinkedHashSet<E>();
        }
        else{
            return null;
       }
    }
}

