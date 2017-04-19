/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;
import java.io.*;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        
        PrintStream output = new PrintStream (new File("hello.txt"));
        output.println("Hello World!");
        output.println();
        output.println("This program produces four");
        output.println("lines of output.");
        
        
        File f = new File("hello.txt");
        System.out.println("exist returns :" + f.exists());
        System.out.println("canRead returns :" + f.canRead());
        System.out.println("lehgth returns :" + f.length());
        System.out.println("getAbsolutePath returns :" + f.getAbsolutePath());
        
        
    }
    
}
