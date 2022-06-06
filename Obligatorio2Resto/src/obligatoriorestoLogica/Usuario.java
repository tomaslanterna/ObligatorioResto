/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriorestoLogica;

import obligatorio2Observador.Observable;

/**
 *
 * @author tomas
 */
public abstract class Usuario extends Observable{
    
    protected String usuario;
    protected String password;
    protected String nombreCompleto;

    public Usuario(String usuario, String password, String nombreCompleto) {
        this.usuario = usuario;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }

    public abstract String getUsuario();

    public abstract String getPassword();

    public abstract String getNombreCompleto();
    
    
    
    
}
