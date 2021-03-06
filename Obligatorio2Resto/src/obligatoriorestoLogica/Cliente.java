/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

/**
 *
 * @author tomas
 */
public abstract class Cliente {

    int clienteId;
    String email;
    String nombre;

    public Cliente(int idCliente,String email, String nombre) {
        this.clienteId=idCliente;
        this.email = email;
        this.nombre = nombre;
    }

    public Cliente() {
    }

    public abstract int getClienteId();

    public abstract void setClienteId(int clienteId);

    public abstract String getEmail();

    public abstract void setEmail(String email);

    public abstract String getNombre();

    public abstract void setNombre(String nombre);

    public abstract int calculoTotalServicio(Servicio servicio);
    
    public abstract String descripcionBeneficio();

}
