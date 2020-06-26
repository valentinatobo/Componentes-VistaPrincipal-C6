/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Inicio;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class InicioTemplate extends JPanel{

    private InicioComponent iniciocomponent;
    
    public InicioTemplate(InicioComponent iniciocomponent){
        this.iniciocomponent = iniciocomponent;
        
        setSize(690, 680);
        this.setBackground(Color.CYAN);
        setLayout(null);
        setVisible(true);
    }
    
}
