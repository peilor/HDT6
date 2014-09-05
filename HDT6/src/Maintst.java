
import java.util.*;
import javax.swing.JOptionPane;

/*
 * Clase para las pruebas con el profiler para responder inciso C.
 */

/**
 *
 * @author Héctor
 */
public class Maintst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tipoMensaje = JOptionPane.QUESTION_MESSAGE;
        String[] tipoImplementacion = {"HashSet", "TreeSet","LinkedHashSet"};
        int tipo=JOptionPane.showOptionDialog(null
                    , "¿Que implementacion de guardado desea?"
                    , "Implementacion"
                    , 0
                    , tipoMensaje
                    , null
                    , tipoImplementacion
                    , "HashSet");
        
        //Entonces, nuestros tres conjuntos implementarán la opción escogida usando SetFactory.
        //Se tendrán tres conjuntos: conjuntoDesJava, conjuntoDesWeb y conjuntoDesCel.
                        
        Set<String> conjuntoDesJava = new SetFactory<String>().getSet(tipo);
        Set<String> conjuntoDesWeb = new SetFactory<String>().getSet(tipo);
        Set<String> conjuntoDesCel = new SetFactory<String>().getSet(tipo);
        Set<String> conjunto5 = new SetFactory<String>().getSet(tipo);
        
         conjuntoDesJava.add("Héctor");
         conjuntoDesWeb.add("Héctor");     
         conjuntoDesWeb.add("Pablo");
         conjuntoDesCel.add("Pablo");
         
         conjuntoDesJava.add("Morgan Freeman");
         conjuntoDesWeb.add("Morgan Freeman");
         conjuntoDesCel.add("Morgan Freeman");
         
         System.out.println(
                    "conjuntoDesJava: "+conjuntoDesJava
                   +"\nconjuntoDesWeb: "+conjuntoDesWeb
                   +"\nconjuntoDesCel: "+conjuntoDesCel
            );
        
            conjunto5.addAll(conjuntoDesWeb);
            boolean subconj1= conjunto5.containsAll(conjuntoDesJava);
            //System.out.println("Es conjDesJava subconjunto de conjDesWeb? "+subconj1);
            if (subconj1==true){
                System.out.println("5. Es desarrolladores Java subconjunto de desarrolladores Web: SÍ");
            }
            else 
                System.out.println("5. Es desarrolladores Java subconjunto de desarrolladores Web?: NO");
           
    }
    
}
