/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Ventae {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    public String IdVentas(){
        String idv="";
        String sql="select max(IdVentas) from ventas";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs =ps.executeQuery();
            while(rs.next()){
                idv=rs.getString(1);
            }
        }catch (Exception e){
            
        }
        return idv;
    }
    public int GuardarVentas (Ventae v){
        Ventae ventas=new Ventae();
        String sql="insert into ventas (id_ventas,numero_ventas,fecha,monto,estado,id_cliente,id_vendedor) values (?,?,?,?,?,?,?)";
        
        try{
            
        }catch (Exception e){
            
        }
        return r;
    }
    public int GuardarDetalleVentas(DetalleVentas dv){
        return r;
    }
}
