package javaapplication16;


public class JavaApplication16 {

    
    public static void main(String[] args) throws CustomException {
        Tst tst = new Tst();
        System.out.println(tst.hoal());
        
        double resultado = 0;
        Test2 Test = new Test2();
        try{
            resultado = Test.areaofRectangule(-1, 5);
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        System.out.println(resultado);
    }
    
}
