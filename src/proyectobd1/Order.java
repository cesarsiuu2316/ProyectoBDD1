
package proyectobd1;
import java.util.Date;


public class Order {
    private int idOrden, idCliente, idEmpleado, idShipper;
    private double peso;
    private String shipName, shipAddress, region, ciudad, pais, codPostal;
    private Date dateOrden, dateReq, dateEnvio;

    public Order() {}

    public Order(int idOrden, int idCliente, int idEmpleado, int idShipper, double peso, String shipName, String shipAddress, String region, String ciudad, String pais, String codPostal, Date dateOrden, Date dateReq, Date dateEnvio) {
        this.idOrden = idOrden;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.idShipper = idShipper;
        this.peso = peso;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.region = region;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codPostal = codPostal;
        this.dateOrden = dateOrden;
        this.dateReq = dateReq;
        this.dateEnvio = dateEnvio;
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

    public int getIdShipper() {
        return idShipper;
    }

    public void setIdShipper(int idShipper) {
        this.idShipper = idShipper;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
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
    
    
}
