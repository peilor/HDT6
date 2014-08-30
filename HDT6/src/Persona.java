/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bicimotoca
 */
public class Persona {
    private String nombre;
    private boolean desJava;
    private boolean desWeb;
    private boolean desCel;

    public Persona(String nombre, boolean desJava, boolean desWeb, boolean desCel) {
        this.nombre = nombre;
        this.desJava = desJava;
        this.desWeb = desWeb;
        this.desCel = desCel;
    }   

    public String getNombre() {
        return nombre;
    }

    public boolean isDesJava() {
        return desJava;
    }

    public boolean isDesWeb() {
        return desWeb;
    }

    public boolean isDesCel() {
        return desCel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDesJava(boolean desJava) {
        this.desJava = desJava;
    }

    public void setDesWeb(boolean desWeb) {
        this.desWeb = desWeb;
    }

    public void setDesCel(boolean desCel) {
        this.desCel = desCel;
    }
}
