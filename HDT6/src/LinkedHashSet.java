/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bicimotoca
 */
import java.util.*;
public class LinkedHashSet implements Set{
    
    private LinkedHashMap<String, Persona> LinkedHashMap;
    
    public LinkedHashSet(){
        LinkedHashMap = new LinkedHashMap<String, Persona>();
    }
    
    /**
     *
     * @param wordObject
     */
    public void add(Persona persona) {
        LinkedHashMap.put(persona.getNombre(),persona);
         }

    /**
     *
     * @param word
     * @return
     */
    public Persona get(String nombre) {
        if (!(LinkedHashMap.containsKey(nombre)))
            return null;
        return LinkedHashMap.get(nombre);
         }
}
