package proyectobd1;


public class OrderDetails {
private int idProducto, orderID, quantity;
    private double unitPrice, descuento;

    public OrderDetails() {}

    public OrderDetails(int orderID, int idProducto, int quantity, double unitPrice, double descuento) {
        this.idProducto = idProducto;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.descuento = descuento;
        this.orderID = orderID;
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

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "idProducto=" + idProducto + ", orderID=" + orderID + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", descuento=" + descuento + '}';
    }    
}
