package javaapplication16;


public class Tst {

    public Tst(){
        divisionforcero();
        hoal();
    }
    
    public int divisionforcero(){
        int result = 0;
        try{
            result = 25/0;
        }catch(ArithmeticException exception){
            System.out.println("No es posible calcular el resultado");
        }
        return result;
    }
    public int hoal(){
        return 12;
    }
    
}
