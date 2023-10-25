package perro;

public class rectangulo {
    private double ancho = 10;
    private double largo = 15;

    public String area(){
        return "el aerea de el rectangulo es "+ (ancho * largo);
    }
    public String perimetro(){
        return "el perimetro de el rectangulo es "+ ((2*ancho) * (2*largo));
    }
}
