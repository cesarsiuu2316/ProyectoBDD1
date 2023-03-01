package proyectobd1;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Employee {
    int EmployeeID;
    String FirstName, LastName, Title, Title_Courtesy, Address, City, Region, PostalCode, Country;
    Date BirthDate, HireDate;

    public Employee() {}

    public Employee(int EmpleoyeeID, String FirstName, String LastName, String Title, String Title_Courtesy, String Address, String City, String Region, String PostalCode, String Country, Date BirthDate, Date HireDate) {
        this.EmployeeID = EmpleoyeeID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Title = Title;
        this.Title_Courtesy = Title_Courtesy;
        this.Address = Address;
        this.City = City;
        this.Region = Region;
        this.PostalCode = PostalCode;
        this.Country = Country;
        this.BirthDate = BirthDate;
        this.HireDate = HireDate;
    }  

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getTitle_Courtesy() {
        return Title_Courtesy;
    }

    public void setTitle_Courtesy(String Title_Courtesy) {
        this.Title_Courtesy = Title_Courtesy;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public void setHireDate(Date HireDate) {
        this.HireDate = HireDate;
    }
    
}
