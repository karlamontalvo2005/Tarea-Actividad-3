public abstract class Pedidos {
    private String cliente;
    private String direccion;
    private double precioBase;
    private TipoComida tipo;
    private boolean delivery;

    public Pedidos(String cliente, String direccion, double precioBase, TipoComida tipo, boolean delivery) {
        this.cliente = cliente;
        this.direccion = direccion;
        this.precioBase = precioBase;
        this.tipo = tipo;
        this.delivery = delivery;
    }
    //Metodo abstracto
    public abstract void mostrarDetallesEspeciales();

    //getters y setters para todos los atributos

    //cliente
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
   //direccion
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    //precio
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    //tipo
    public TipoComida getTipo() { return tipo; }
    public void setTipo(TipoComida tipo) { this.tipo = tipo; }
   //delivery
    public boolean getDelivery() { return delivery; }
    public void setDelivery(boolean delivery) { this.delivery = delivery; }
}
