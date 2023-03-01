package proyectobd1;


public class Shipper {
    int idShipper;
    String CompanyName, phone;
    
    public Shipper(){}
    
    public Shipper (int idShipper, String CompanyName, String phone){
        this.idShipper = idShipper;
        this.CompanyName = CompanyName;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return CompanyName;
    }

    public int getIdShipper() {
        return idShipper;
    }

    public void setIdShipper(int idShipper) {
        this.idShipper = idShipper;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
