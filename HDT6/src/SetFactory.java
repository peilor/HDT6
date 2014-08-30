/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bicimotoca
 */

public class SetFactory {
	
public static Set getSet(int tipo){
    if (tipo == 0){
        return new HashSet();
    }
    if (tipo == 1){
        return new TreeSet();
    }
    if (tipo == 2){
        return new LinkedHashSet();
    }
    else{
        return null;
    }
}    
}
