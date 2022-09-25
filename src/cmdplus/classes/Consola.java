/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmdplus.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Consola {
    
    
    
    public ArrayList<String> ejecucionConRetorno(String comando){
        ArrayList<String> datosEjecucion = new ArrayList<>();
        ProcessBuilder processBuilder = new ProcessBuilder("cmd","/c",comando);
        Process process;
        
        try {
            
            String linea = " ";
            process = processBuilder.start();
            InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            
            while((linea = bufferedReader.readLine()) != null){
                
                datosEjecucion.add(linea);
            }
            bufferedReader.close();
            
            return datosEjecucion;
            
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        
        return datosEjecucion;
    }
    
    public boolean ejecucionSinRetorno(){
        
        return true;
    }
    
}
