import java.util.ArrayList;
import java.util.Scanner;
import clases.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> marcasDeAutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese una marca de auto: ");
            String marca = scanner.nextLine();
            marcasDeAutos.add(marca);

            System.out.print("¿Desea guardar otra marca de auto? (Sí/No): ");
            String respuesta = scanner.nextLine().toLowerCase();

            if (!respuesta.equals("si")) {
                break; // Si el usuario no quiere guardar otra marca, salimos del bucle.
            }
        }

        System.out.println("Marcas de autos guardadas:");
        for (String marca : marcasDeAutos) {
            System.out.println(marca);
        }


        //2
        EquipoDeFutbol miEquipo = new EquipoDeFutbol();

        miEquipo.agregarJugador("Messi");
        miEquipo.agregarJugador("Neymar");
        miEquipo.agregarJugador("Suárez");

        System.out.println("Plantilla inicial:");
        miEquipo.listarPlantilla();

        miEquipo.eliminarJugador("Neymar");

        System.out.println("Plantilla después de eliminar a Neymar:");
        miEquipo.listarPlantilla();


        //3
        Factura factura = new Factura(1, new Date(), "Cliente Ejemplo");
        factura.agregarArticulo(new Articulo("Artículo 1", 10.0, 3));
        factura.agregarArticulo(new Articulo("Artículo 2", 15.0, 2));

        factura.calcularSubtotal();
        factura.calcularIVA(0.16); // Suponiendo un IVA del 16% (0.16)
        factura.calcularTotal();

        factura.mostrarFactura();

    }
        //3
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
        }

        static class Articulo {
            private String nombre;
            private double precioUnitario;
            private int cantidad;

            public Articulo(String nombre, double precioUnitario, int cantidad) {
                this.nombre = nombre;
                this.precioUnitario = precioUnitario;
                this.cantidad = cantidad;
            }

            public String getNombre() {
                return nombre;
            }

            public double getPrecioUnitario() {
                return precioUnitario;
            }

            public int getCantidad() {
                return cantidad;
            }
        }

    }
