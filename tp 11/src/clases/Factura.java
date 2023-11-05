import java.util.ArrayList;
import java.util.Date;
import clases.Articulo;

public class Factura {
    private int numeroFactura;
    private Date fechaEmision;
    private String cliente;
    private ArrayList<Articulo> articulos;
    private double subtotal;
    private double iva;
    private double total;

    public Factura(int numeroFactura, Date fechaEmision, String cliente) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.cliente = cliente;
        this.articulos = new ArrayList<>();
        this.subtotal = 0;
        this.iva = 0;
        this.total = 0;
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public void calcularSubtotal() {
        subtotal = 0;
        for (Articulo articulo : articulos) {
            subtotal += articulo.getPrecioUnitario() * articulo.getCantidad();
        }
    }

    public void calcularIVA(double tasaIVA) {
        iva = subtotal * tasaIVA;
    }

    public void calcularTotal() {
        total = subtotal + iva;
    }

    public void mostrarFactura() {
        System.out.println("Número de Factura: " + numeroFactura);
        System.out.println("Fecha de Emisión: " + fechaEmision);
        System.out.println("Cliente: " + cliente);
        System.out.println("Artículos:");
        for (Articulo articulo : articulos) {
            System.out.println(articulo.getNombre() + " x" + articulo.getCantidad() + ": $" + (articulo.getPrecioUnitario() * articulo.getCantidad()));
        }
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA: $" + iva);
        System.out.println("Total: $" + total);
    }
