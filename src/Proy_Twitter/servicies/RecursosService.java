/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.servicies;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Admin
 */
public class RecursosService {

    private Color colorAzulos, colorAzulClaro, colorAzulcielo, colorAzultransparente, colorVerdeClaro, colorAzulGris;
    private Font fontTitulos, fontTitulo, fontBotReg, fontBotIni, fontBotTwe, fontBotNavegador;
    private Cursor cMano;
    private Border borderAbajo, borderTodos, borderArriba, borderLado, borderLadoD;
    
    static private RecursosService servicio;

    public RecursosService() {
        //objetos decoradores 
        colorAzulos = new Color(26, 38, 55);
        colorAzulClaro = new Color(40, 48, 79);
        colorAzulcielo = new Color(59, 154, 215);
        colorVerdeClaro = new Color(20, 187, 99);
        colorAzulGris = new Color(44,60,76);
        colorAzultransparente = new Color(26,38,55,3);
        fontTitulos = new Font("Arial", 0, 16);
        fontTitulo = new Font("Arial", 1, 19);
        fontBotReg = new Font("Arial", 1, 16);
        fontBotTwe = new Font("Arial", 0, 22);
        fontBotNavegador = new Font("Arial", 1, 23);
        fontBotIni = new Font("Arial", 1, 17);
        cMano = new Cursor(Cursor.HAND_CURSOR);
        borderAbajo = BorderFactory.createMatteBorder(0, 0, 2, 0, colorAzulcielo);
        borderTodos = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY);
        borderArriba = BorderFactory.createMatteBorder(2, 0, 0, 0, Color.LIGHT_GRAY);
        borderLado = BorderFactory.createMatteBorder(0, 0, 0, 2, Color.LIGHT_GRAY);
        borderLadoD = BorderFactory.createMatteBorder(0, 2, 0, 0, Color.LIGHT_GRAY); 
        
    }  

    public Color getColorAzulos() {
        return colorAzulos;
    }

    public Color getColorAzulClaro() {
        return colorAzulClaro;
    }

    public Color getColorAzulcielo() {
        return colorAzulcielo;
    }
    public Color getColorVerdeClaro() {
        return colorVerdeClaro;
    }

    public Color getColorAzultransparente() {
        return colorAzultransparente;
    }

    public Font getFontTitulos() {
        return fontTitulos;
    }

    public Font getFontTitulo() {
        return fontTitulo;
    }

    public Font getFontBotReg(){
        return fontBotReg;
    }
    
    public Font getFontBotNavegador(){
        return fontBotNavegador;
    }

    public Font getFontBotIni() {
        return fontBotIni;
    }
    
    public Font getFontBotTwe() {
        return fontBotTwe;
    }

    public Cursor getcMano() {
        return cMano;
    }

    public Border getBorderAbajo() {
        return borderAbajo;
    }

    public Border getBorderTodos() {
        return borderTodos;
    }

    public Border getBorderArriba() {
        return borderArriba;
    }
    
    public Border getBorderLado() {
        return borderLado;
    }
    public Border getBorderLadoD() {
        return borderLadoD;
    }

    public static RecursosService getService() {
        if (servicio == null) {
            servicio = new RecursosService();
        }
        return servicio;

    }

    /**
     * @return the colorAzulGris
     */
    public Color getColorAzulGris() {
        return colorAzulGris;
    }

}
