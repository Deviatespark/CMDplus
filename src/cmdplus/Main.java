/*Version 2.0 del programa que produce mejoras en clases*/
package cmdplus;

import cmdplus.Models.Consola;
import cmdplus.Views.InterfaceCMD;


/**
 *
 * @author galve
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        iniciarPrograma();
        
    }
    
    public static void iniciarPrograma(){
        InterfaceCMD interfaceCMD = new InterfaceCMD();
        interfaceCMD.setVisible(true);
    }
    
}
