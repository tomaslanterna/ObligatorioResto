/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

/**
 *
 * @author tomas
 */
public class Mesa {

    private int numeroMesa;
    private Mozo mozoAsignado;

    public Cliente getClienteMesa() {
        return clienteMesa;
    }

    public void setClienteMesa(Cliente clienteMesa) {
        this.clienteMesa = clienteMesa;
    }
    private Cliente clienteMesa;
    private boolean estadoMesa;
    private Servicio servicio;

    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.estadoMesa = false;
    }

    public Mesa() {
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public void addMozo(Mozo unMozo) {
        this.mozoAsignado = unMozo;
    }
    
    public Mozo getMozo(){
        return mozoAsignado;
    }

    public void addCliente(Cliente unCliente) {
        this.clienteMesa = unCliente;
    }

    public boolean isEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(boolean estadoMesa) {
        this.estadoMesa = estadoMesa;
    }
    
    public Servicio getServicio(){
        return servicio;
    }

    @Override
    public String toString() {
        return "Mesa"+ numeroMesa;
    }
    
    
    
    
    

    

}
