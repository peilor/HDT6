/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bicimotoca
 */
import java.util.*;
public class HashSet implements Set{
    
    private HashMap<String, Persona> HashTable;
    
    public HashSet(){
        HashTable = new HashMap();
    }
    
    /**
     *
     * @param wordObject
     */
    @Override
    public void add(Persona persona) {
        HashTable.put(persona.getNombre(),persona);
         }

    /**
     *
     * @param word
     * @return
     */
    public Persona get(String nombre) {
        if (!(HashTable.containsKey(nombre)))
            return null;
        return HashTable.get(nombre);
         }
}