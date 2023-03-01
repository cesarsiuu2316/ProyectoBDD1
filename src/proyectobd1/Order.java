
package proyectobd1;

import java.util.Date;


public class Order implements Comparable<Order> {
    private int idOrden, idCliente, idEmpleado, idShipVia;
    private double peso;
    private String shipName, shipAddress, shipRegion,
            shipCity, shipCountry, shipCodPostal;
    private Date dateOrden, dateReq, dateEnvio;
    
    public Order() {}
    
    public Order(int idOrden, int idCliente, int idEmpleado,
            Date dateOrden, Date dateReq, Date dateEnvio,
            int idShipVia, double peso, String shipName,
            String shipAddress, String shipCity, String shipRegion,
            String codPostal, String shipCountry){
        this.idOrden = idOrden;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.dateOrden = dateOrden;
        this.dateReq = dateReq;
        this.dateEnvio = dateEnvio;
        this.idShipVia = idShipVia;
        this.peso = peso;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipRegion = shipRegion;
        this.shipCity = shipCity;
        this.shipCodPostal = codPostal;
        this.shipCountry = shipCountry;        
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdShipVia() {
        return idShipVia;
    }

    public void setIdShipVia(int idShipVia) {
        this.idShipVia = idShipVia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public String getShipCodPostal() {
        return shipCodPostal;
    }

    public void setShipCodPostal(String shipCodPostal) {
        this.shipCodPostal = shipCodPostal;
    }

    public Date getDateOrden() {
        return dateOrden;
    }

    public void setDateOrden(Date dateOrden) {
        this.dateOrden = dateOrden;
    }

    public Date getDateReq() {
        return dateReq;
    }

    public void setDateReq(Date dateReq) {
        this.dateReq = dateReq;
    }

    public Date getDateEnvio() {
        return dateEnvio;
    }

    public void setDateEnvio(Date dateEnvio) {
        this.dateEnvio = dateEnvio;
    }

    @Override
    public int compareTo(Order o) {
        return Integer.compare(idOrden, o.getIdOrden());
    }
}
