package Cande.Coderhouse.jpa.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class ventas {

    public ventas (){}


    @Column(name = "PRODUCTO")
    private String producto;
    @Column(name = "MEDIO DE PAGO")
    private String mediodepago;
    @Column(name = "NUMERO DE FACTURA")
    private String numerodefactura;

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMediodepago() {
        return mediodepago;
    }

    public void setMediodepago(String mediodepago) {
        this.mediodepago = mediodepago;
    }

    public String getNumerodefactura() {
        return numerodefactura;
    }

    public void setNumerodefactura(String numerodefactura) {
        this.numerodefactura = numerodefactura;
    }
}
