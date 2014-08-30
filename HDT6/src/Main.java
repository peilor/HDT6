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
        boolean cont=true;
        while(cont){
            int op=Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de implementación de Set desea?"
                    + "\n1)HashSet"
                    + "\n2)TreeSet"
                    + "\n3)LinkedHashSet"));
            if(op==1){
                tipo=1;
                cont=false;
            }else if(op==2){
                tipo=2;
                cont=false;
            }else if(op==3){
                tipo=3;
                cont=false;
            }else{
                JOptionPane.showMessageDialog(null, "Usted no ha ingresado una opcion valida");
                }
        }
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
