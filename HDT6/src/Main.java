/**
 *
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * 
 */
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    private static int tipo;
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
        String persona=JOptionPane.showInputDialog("¿Cual es su nombre?");
        String[] opciones = {"Si", "No"};
        
        while (true) {
            int respuesta = JOptionPane.showOptionDialog(
                               null
                             , "¿Es usted un desarrollador de Java?"
                             , persona
                             , JOptionPane.YES_NO_OPTION
                             , JOptionPane.PLAIN_MESSAGE
                             , null
                             , opciones
                             , "Si");
        if(respuesta==1){
            
        }
    }
}
}
