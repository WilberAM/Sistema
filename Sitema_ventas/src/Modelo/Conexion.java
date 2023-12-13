
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conexion {
 Connection con;
  String URL = "jdbc:mysql://localhost:3306/miscelanea";
 String USERNAME = "root";
 String PASSWORD = "";
 String clase= "com.mysql.jdbc.Driver";
  public Connection Conectar() {
       con=null;
        try {
            Class.forName(clase);
            con =(Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion existosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;  
} 
}
