package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class vendedor {
    PreparedStatement ps;
            ResultSet rs;
            Conexion con=new Conexion();
            Connection acceso;
public Empleado ValidarVendedor(String nombre,String contraseña){
   Empleado em=new Empleado();
    String sql="SELECT *FROM empleado WHERE nombre=? AND contraseña=?";
try{
acceso=con.Conectar();
ps=acceso.prepareStatement(sql);
ps.setString(1,nombre);
ps.setString(2,contraseña);
rs=ps.executeQuery();
while (rs.next()){
em.setnombre(rs.getString(1));
em.setcontraseña(rs.getString(2));
}
} catch (Exception e){
}


return em;
}
}
