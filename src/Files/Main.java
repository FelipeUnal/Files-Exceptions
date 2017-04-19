/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        
        PrintStream output = new PrintStream (new File("Hello.txt"));
        output.println("Hello World!");
        output.println();
        output.println("I'm the netbeans brain");
        output.println("please, program documents.");
        
        Scanner input = new Scanner(new File("Hello.txt"));
        int count = 0;
        while(input.hasNext()){
            String word = input.next();
            count++;
        }
        System.out.println("Total words: "+count);
        
        File f = new File("Hello.txt");
        System.out.println("exist returns :" + f.exists());
        System.out.println("canRead returns :" + f.canRead());
        System.out.println("lehgth returns :" + f.length());
        System.out.println("getAbsolutePath returns :" + f.getAbsolutePath());
        
        
    }
    
}
