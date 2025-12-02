import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista polimórfica
        List<Pedidos> pedidos = new ArrayList<>();

        // Creación de objetos: PedidoPizza
        String[] ingredientes = {"Peperoni", "Champiñones", "Queso Extra"};
        PedidoPizza p1 = new PedidoPizza(
                "Brianna Montalvo",
                "Nuevos Horizontes, calle 5 de Agosto",
                12.50,
                true, // Con delivery
                "Grande",
                ingredientes
        );

        // Creación de objetos: PedidoHamburguesa
        PedidoHamburguesa p2 = new PedidoHamburguesa(
                "Edu Leon",
                "Calle D Codesa",
                8.00,
                false, // Sin delivery
                true, // Combo completo
                3     // Nivel picante
        );

        // Agregar a la lista
        pedidos.add(p1);
        pedidos.add(p2);

        // Procesamiento usando Polimorfismo
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("♡PROCESANDO PEDIDOS PIZZA RÁPIDA♡");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

        for (Pedidos p : pedidos) {
            // Se debe castear a OperacionesPedido para acceder a los métodos de la interfaz
            // ya que la lista es de tipo Pedido (clase abstracta)
            OperacionesPedido op = (OperacionesPedido) p;

            p.mostrarDetallesEspeciales();
            op.mostrarResumenPedido();

            System.out.println("Total a pagar: $" + op.calcularCostoTotal());
            System.out.println("Tiempo estimado: " + op.estimarTiempoEntrega() + " min");
            System.out.println("—ˋ ♡ ˊ———ˋ ♡ ˊ———ˋ ♡ ˊ———ˋ ♡ ˊ———ˋ ♡ ˊ——");
        }
    }
}
