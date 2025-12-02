public class PedidoHamburguesa extends Pedidos implements OperacionesPedido {
    private boolean comboCompleto;
    private int nivelPicante;

    public PedidoHamburguesa(String cliente,
                             String direccion,
                             double precioBase,
                             boolean delivery,
                             boolean comboCompleto,
                             int nivelPicante) {
        super(cliente, direccion, precioBase, TipoComida.HAMBURGUESA, delivery);
        this.comboCompleto = comboCompleto;
        this.nivelPicante = nivelPicante;
    }

    @Override
    public double calcularCostoTotal(){
        double total = getPrecioBase();
        if (getDelivery()){
            total += 2.80; // Costo específico para Hamburguesa
        }
        return total;
    }

    @Override
    public int estimarTiempoEntrega() {
        int tiempo = 15;   //tiempo base Hamburguesa
        if (getDelivery()) {
            tiempo += 10;//mas 10 minutos si es delivery
        }
        return tiempo;
    }

    @Override
    public void mostrarResumenPedido() {
        System.out.println("❀.♡.✰ Resumen Hamburguesa ❀.♡.✰");
        System.out.println("Cliente: " + getCliente());
        System.out.println("Es en combo: " + (comboCompleto ? "Sí" : "No"));
        System.out.println("Nivel de picante: " + nivelPicante);
    }

    @Override
    public void mostrarDetallesEspeciales() {
        String tipoCombo = comboCompleto ? "Combo Completo" : "Solo Hamburguesa";
        System.out.println("Pedido: " + tipoCombo + " - Picante: " + nivelPicante + "/5");
    }

    //getters y setters
    public boolean isComboCompleto() { return comboCompleto; }
    public void setComboCompleto(boolean comboCompleto) { this.comboCompleto = comboCompleto; }
    public int getNivelPicante() { return nivelPicante; }
    public void setNivelPicante(int nivelPicante) { this.nivelPicante = nivelPicante;}
}
