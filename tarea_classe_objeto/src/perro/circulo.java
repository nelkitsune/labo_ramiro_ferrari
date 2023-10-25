package perro;

public class circulo {
    private double radio;

    public circulo(){
        radio = 5;
    }
    public double area (){
        return 3.14 * (radio*radio);
    }
    public double circuferencia(){
        return 2*3.14*(radio*radio);
    }

}
