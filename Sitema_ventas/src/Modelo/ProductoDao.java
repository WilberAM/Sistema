package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductoDao {
       Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
            ResultSet rs;
    Conexion acceso=new Conexion();
    Productos p=new Productos();
public Productos listarID(int codigo){

String sql="select *from productos where codigo=?";
try{
con=acceso.Conectar();
 ps=con.prepareStatement(sql);
 ps.setInt(1,codigo);
rs=ps.executeQuery();

while (rs.next()){
p.setcodigo(rs.getInt(1));
p.setnombre_producto(rs.getString(2));
p.settipo_producto(rs.getString(3));
//p.setexitencia(rs.getInt(4));
p.setprecio_adquirido(rs.getInt(5));
p.setprecio_vender(rs.getInt(6));
p.setfecha_caducidad(rs.getDate(7));               
}  
}catch (Exception e){
}
return p;
}
}