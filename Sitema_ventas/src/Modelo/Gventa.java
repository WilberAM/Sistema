package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vista.Ventas;

public class Gventa {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
            ResultSet rs;
            int r=0;
    public String Vventas(){
        String id_venta="";
        String sql="select max(id_venta) from venta";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                id_venta=rs.getString(1);
                
                
            }
        }catch (Exception e){
            
        }return id_venta;
        
    }
    public int GuardarVentas(Ventav v){
        Ventav ventav=new Ventav();
        String sql="insert into venta(id_empleado,codigo,nombre_producto,cantidad)values(?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1,v.getId_empleado());
             ps.setInt(2,v.getCodigo());
              ps.setString(3,v.getNombre_producto());
               ps.setInt(4,v.getCantidad());
            
            rs=ps.executeQuery();
        } catch (Exception e){
            
        }
        return r;
    }
 public int GuardarDetalleVenta(DetalleVentas dv){
        String sql="insert into producto_vendido(codigo, nombre_producto, fecha_salida, precio, total_venda)values(?,?,?,?,?)";
       try{
             con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dv.getCodigo());
            ps.setString(2, dv.getNombre_producto());
            ps.setDate(3, dv.getFecha_salida());
            ps.setInt(4, dv.getPrecio());
            ps.setInt(5, dv.getTotal_venda());
            
            rs=ps.executeQuery();
       }catch (Exception e){
       }
       return r;
    }
}
