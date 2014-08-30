/**
 *
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * 
 */
import javax.swing.JOptionPane;

public class Main {
    private static int tipo;
    private static boolean desJava;
    private static boolean desWeb;
    private static boolean desCel;
    public static void main(String[] args) {
        String[] sets = {"HashSet", "TreeSet","LinkedHashSet"};
        int tipo=JOptionPane.showOptionDialog(
                    null
                    , "¿Que implementacion de guardado desea?"
                    , "Implementacion"
                    , JOptionPane.YES_NO_OPTION
                    , JOptionPane.PLAIN_MESSAGE
                    , null
                    , sets
                    , "HashSet");
        SetFactory sFactory = new SetFactory();
        Set datos = sFactory.getSet(tipo);
        String[] opciones = {"Si", "No"};
        boolean bandera=true;        
        while (bandera) {
            desWeb=false;
            desWeb=false;
            desWeb=false;
            String persona=JOptionPane.showInputDialog("¿Cual es su nombre?");
            int respuesta = JOptionPane.showOptionDialog(
                    null
                    , "¿Es usted un desarrollador de Java?"
                    , persona
                    , JOptionPane.YES_NO_OPTION
                    , JOptionPane.PLAIN_MESSAGE
                    , null
                    , opciones
                    , "Si");
            if(respuesta==0){
                desJava=true;
            }
            respuesta = JOptionPane.showOptionDialog(
                    null
                    , "¿Es usted un desarrollador Web?"
                    , persona
                    , JOptionPane.YES_NO_OPTION
                    , JOptionPane.PLAIN_MESSAGE
                    , null
                    , opciones
                    , "Si");
            if(respuesta==0){
                desWeb=true;
            }
            respuesta = JOptionPane.showOptionDialog(
                    null
                    , "¿Es usted un desarrollador de Celular?"
                    , persona
                    , JOptionPane.YES_NO_OPTION
                    , JOptionPane.PLAIN_MESSAGE
                    , null
                    , opciones
                    , "Si");
            if(respuesta==0){
                desCel=true;
            }
            respuesta = JOptionPane.showOptionDialog(
                    null
                    , "¿Desea ingresar otro usuario?"
                    , persona
                    , JOptionPane.YES_NO_OPTION
                    , JOptionPane.PLAIN_MESSAGE
                    , null
                    , opciones
                    , "Si");
            Persona newPersona = new Persona(persona,desJava,desWeb,desCel);
            if(respuesta==1){
                bandera=false;
            }
    } 
}
}
