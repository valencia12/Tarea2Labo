/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadelaboratorio2;

/**
 *
 * @author Jorge
 */
public class Factura {
    private  String nombre, fecha, nombreProducto, precio, total;
public Factura() {
  
}

    public String getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getTotal() {
        return total;
    }
    
    public String getPrecio() {
        return precio;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
}
