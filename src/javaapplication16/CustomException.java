package javaapplication16;

public class CustomException extends Exception{
    public CustomException(String mensaje){
        super(mensaje);
    }
    
    public CustomException(){
        super("Error personalizado");
    }
    
}
