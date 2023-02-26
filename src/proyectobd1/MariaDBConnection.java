package proyectobd1;

import org.mariadb.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.mariadb.jdbc.Statement;
import java.sql.ResultSet;

public class MariaDBConnection {
    Connection connection = null;
    private String url = "jdbc:mariadb://localhost:3306/northwind";
    private String user = "root";
    private String pwd = "root";
    
    MariaDBConnection(){        
        try {
            connection = (Connection) DriverManager.getConnection(url, user, pwd);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }    
    
    public void proyeccion(String tabla, String columna1, String columna2){
        //MariaDBConnection c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;
        String selectfrom = "select * from " + tabla;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(selectfrom);
            System.out.println("-----------------");
            while(rs.next()){
                System.out.println(rs.getString(columna1) + " " + rs.getString(columna2));
            }
            System.out.println("-----------------");
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }    
    }
}