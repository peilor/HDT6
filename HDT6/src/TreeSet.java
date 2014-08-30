/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bicimotoca
 */
import java.util.*;
public class TreeSet implements Set{
    
    private TreeMap<String, Persona> TreeMap;
    
    public TreeSet()            
        {
            TreeMap = new TreeMap<String, Persona>();
        }
    
    /**
     *
     * @param wordObject
     */
    public void add(Persona persona) {
        TreeMap.put(persona.getNombre(),persona);
         }

    /**
     *
     * @param word
     * @return
     */
    public Persona get(String nombre) {
        if (!(TreeMap.containsKey(nombre)))
            return null;
        return TreeMap.get(nombre);
         }
}
