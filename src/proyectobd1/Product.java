package proyectobd1;


public class Product {
    int idProd, idSupplier, idCateg, stock, order, reorder;
    double unitPrice;
    String name, quantity;
    int discontinued;

    public Product() {}

    public Product(int idProd, String name, int idSupplier, int idCateg, String quantity, double unitPrice, int stock, int order, int reorder, int discontinued) {
        this.idProd = idProd;
        this.idSupplier = idSupplier;
        this.idCateg = idCateg;
        this.stock = stock;
        this.order = order;
        this.reorder = reorder;
        this.unitPrice = unitPrice;
        this.name = name;
        this.quantity = quantity;
        this.discontinued = discontinued;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public int getIdCateg() {
        return idCateg;
    }

    public void setIdCateg(int idCateg) {
        this.idCateg = idCateg;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getReorder() {
        return reorder;
    }

    public void setReorder(int reorder) {
        this.reorder = reorder;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    


    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public boolean isDiscontinued() {
        if (discontinued==0) {
            return false;
        }else{
            return true;
        }
    }

    public void setDiscontinued(int discontinued) {
        this.discontinued = discontinued;
    }
    
    
}
