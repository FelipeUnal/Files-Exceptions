package javaapplication16;

public class Test2 {
    
    public double areaofRectangule(double ancho, double alto) throws CustomException{
        if(ancho < 0 || alto < 0) throw new CustomException("El alto o la altura no pueden tomar valores negativos");
        double area;
        area = ancho*alto;
        return area;
    }
}
