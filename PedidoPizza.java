public class PedidoPizza extends Pedidos implements OperacionesPedido {
    private String tamanio;
    private String[] ingredientesExtras;

    public PedidoPizza(String cliente,
                       String direccion,
                       double precioBase,
                       boolean delivery,
                       String tamanio,
                       String[] ingredientesExtras){
        super(cliente, direccion, precioBase, TipoComida.PIZZA, delivery);
        this.tamanio = tamanio;
        this.ingredientesExtras = ingredientesExtras;
    }

    @Override
    public double calcularCostoTotal(){
        double total = getPrecioBase();
        if (getDelivery()){
            total += 3.50;    //costo del delivery
        }
        return total;
    }

    @Override
    public int estimarTiempoEntrega() {
        int tiempo = 25;   //tiempo base Pizza
        if (getDelivery()) {
            tiempo += 10;//se suman 10 minutos si es delivery
        }
        return tiempo;
    }

    @Override
    public void mostrarResumenPedido() {
        System.out.println("✰.♡.❀ Resumen Pizza ❀.♡.✰");
        System.out.println("Cliente: " + getCliente());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Tamaño: " + tamanio);
        System.out.print("Extras: ");
        for (String ing : ingredientesExtras){
            System.out.print(ing + " ");
        }
        System.out.println();
    }

    @Override
    public void mostrarDetallesEspeciales() {
        System.out.println("Pedido: Pizza " + tamanio + " con " + ingredientesExtras.length + " ingredientes extra.");
    }

    // Getters y Setters propios
    public String getTamanio() { return tamanio; }
    public void setTamanio(String tamanio) { this.tamanio = tamanio; }
    public String[] getIngredientesExtras() { return ingredientesExtras; }
    public void setIngredientesExtras(String[] ingredientesExtras) { this.ingredientesExtras = ingredientesExtras; }
}
