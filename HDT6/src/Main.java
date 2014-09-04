/**
 *
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * 
 */
import javax.swing.JOptionPane;
import java.util.*;

public class Main<E> {
    //private static int tipo;
    //Tipo no se usa.
    
      private static boolean desJava;
      private static boolean desWeb;
      private static boolean desCel;

    public static void main(String[] args) {

//Arreglado para retornar valor entero para escoger implementación. Antes retornaba Y/N. 
                
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
        
        //También se tendrán los siguientes conjuntos para responder a los incisos de la hoja.        
        Set<String> conjunto1 = new SetFactory<String>().getSet(tipo);
        Set<String> conjunto2 = new SetFactory<String>().getSet(tipo);
        Set<String> conjunto3 = new SetFactory<String>().getSet(tipo);
        Set<String> conjunto4 = new SetFactory<String>().getSet(tipo);
        Set<String> conjunto5 = new SetFactory<String>().getSet(tipo);
              
        System.out.println("Tipo de implementación: "+tipo);
        
        String[] opciones = {"Si", "No"};
        boolean bandera=true;        
        while (bandera) {
            desJava=false;
            desWeb=false;
            desCel=false;
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
            
            //Se revisa a qué conjuntos pertenece, y se agrega a la persona.
            if (desJava==true){
                conjuntoDesJava.add(persona);
            }
            if (desWeb==true){
                conjuntoDesWeb.add(persona);
            }
            if (desCel==true){
                conjuntoDesCel.add(persona);  
            }
 
            
            System.out.println(
                     "Nombre: "+persona
                    +"\ndesJava: "+desJava
                    +"\ndesWeb: "+desWeb
                    +"\ndesCel: "+desCel
            );
            
            System.out.println(
                    "conjuntoDesJava: "+conjuntoDesJava
                   +"\nconjuntoDesWeb: "+conjuntoDesWeb
                   +"\nconjuntoDesCel: "+conjuntoDesCel
            );
            
            //Respuestas a incisos:
            //Inciso 1: intersección de los tres conjuntos.
            //Se agregan los elementos de conjuntoDesJava a conjuntoIntersec

             conjunto1.addAll(conjuntoDesJava);

             //Luego se usa retainAll, que sólo retiene los elementos contenidos en conjuntoDesWeb.
             //Básicamente se hace una intersección.
             conjunto1.retainAll(conjuntoDesWeb);
             
             //Por último retiene en conjuntoIntersec los elementos contenidos en conjuntoDesCel.
             conjunto1.retainAll(conjuntoDesCel);
             
            System.out.println("1. Experiencia en Java, Web y celulares: "+conjunto1);
            
            //Inciso 2: desarrolladores con experencia en Java y sin experiencia en Web.
            
            conjunto2.addAll(conjuntoDesJava);
            
            //Se remueven todos los elementos de que también tienen experiencia en Web.
            conjunto2.removeAll(conjuntoDesWeb);
            
            //Por lo tanto quedan los que saben Java, pero no Web.
            
            System.out.println("2. Experiencia en Java, pero no Web: "+conjunto2);
                    
            //Inciso3: experiencia en Web y Celulares, sin Java.
            //Intersección entre desWeb y desCel, se quitan los elementos que tengan Java. 
            conjunto3.addAll(conjuntoDesWeb);
            conjunto3.retainAll(conjuntoDesCel);
            conjunto3.removeAll(conjuntoDesJava);
            
            System.out.println("3. Experiencia en Web y Celulares, pero no Java: "+conjunto3);
            
            //Inciso4: experiencia en Web o Celulares (Web+Cel), pero no Java.
            
            conjunto4.addAll(conjuntoDesWeb);
            conjunto4.addAll(conjuntoDesCel);
            conjunto4.removeAll(conjuntoDesJava);
            
            System.out.println("4. Experiencia en Web o Celulares (Web+Cel), pero no Java: "+conjunto4);
            
            //Inciso5: es desarrolladores Java subconjunto de desarrolladores Web?
            
            conjunto5.addAll(conjuntoDesWeb);
            boolean subconj1= conjunto5.containsAll(conjuntoDesJava);
            //System.out.println("Es conjDesJava subconjunto de conjDesWeb? "+subconj1);
            if (subconj1==true){
                System.out.println("5. Es desarrolladores Java subconjunto de desarrolladores Web: SÍ");
            }
            else 
                System.out.println("5. Es desarrolladores Java subconjunto de desarrolladores Web?: NO");
            
            //Inciso6: qué conjunto tiene mayor cantidad de desarrolladores? Quiénes son?
            
            int maximo = Math.max(conjuntoDesJava.size(),
                    Math.max(conjuntoDesWeb.size(),conjuntoDesCel.size()));
            //El conjunto que más elementos tenga se guardará para responder el inciso 7.
            
            String [] arregloMax;
                                  
            if (maximo==conjuntoDesJava.size() 
                    && maximo!=conjuntoDesWeb.size()
                    && maximo!=conjuntoDesCel.size()){
                System.out.println("6. El conjunto que más desarrolladores tiene es Java ("
                +conjuntoDesJava.size()+"). Integrantes: "
                +conjuntoDesJava);
                
                arregloMax = conjuntoDesJava.toArray(new String[conjuntoDesJava.size()]);

            }
            
            else if (maximo==conjuntoDesWeb.size()
                    && maximo!=conjuntoDesJava.size()
                    && maximo!=conjuntoDesCel.size()){
                System.out.println("6. El conjunto que más desarrolladores tiene es Web ("
                +conjuntoDesWeb.size()+"). Integrantes: "
                +conjuntoDesWeb);
                
                arregloMax = conjuntoDesWeb.toArray(new String[conjuntoDesWeb.size()]);
                

                                      
            }
            
            else if (maximo==conjuntoDesCel.size()  
                    && maximo!=conjuntoDesJava.size()
                    && maximo!=conjuntoDesWeb.size()){
                System.out.println("6. El conjunto que más desarrolladores tiene es Web ("
                +conjuntoDesCel.size()+"). Integrantes: "
                +conjuntoDesCel);
                
                arregloMax = conjuntoDesCel.toArray(new String[conjuntoDesCel.size()]);
                
            }
            else{ 
                System.out.println("6. Dos o más conjuntos de desarrolladores "
                        + "tienen cantidades máximas iguales.");
                 
                arregloMax = null;
                                   
            }
            //Inciso7: El conjunto del inciso anterior en orden ascendente.
            
            
            Arrays.sort(arregloMax);
            
            System.out.println("7. Ahora el conjunto ordenado de forma ascendente: "
                    +Arrays.toString(arregloMax));
             
            respuesta = JOptionPane.showOptionDialog(
                    null
                    , "¿Desea ingresar otro usuario?"
                    , persona
                    , JOptionPane.YES_NO_OPTION
                    , JOptionPane.PLAIN_MESSAGE
                    , null
                    , opciones
                    , "Si");
            
            if(respuesta==1){
                bandera=false;
            }
        }
    }   
}
