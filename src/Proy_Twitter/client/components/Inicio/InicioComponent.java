/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Inicio;

/**
 *
 * @author lenovo
 */
public class InicioComponent {
    private InicioTemplate iniciotemplate;
    
    public InicioComponent(){
        iniciotemplate = new InicioTemplate(this);
    }

    public InicioTemplate getInicioTemplate(){
        return iniciotemplate;
    }
}
