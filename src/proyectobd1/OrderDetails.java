package proyectobd1;


public class OrderDetails {
    int idProducto, quantity;
    double unitPrice, descuento;

    public OrderDetails() {}

    public OrderDetails(int idProducto, int quantity, double unitPrice, double descuento) {
        this.idProducto = idProducto;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.descuento = descuento;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
}
