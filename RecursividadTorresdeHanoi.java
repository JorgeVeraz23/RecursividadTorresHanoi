/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividadtorresdehanoi;

/**
 *
 * @author USER
 */
public class RecursividadTorresdeHanoi {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        RecursividadTorresdeHanoi obj = new RecursividadTorresdeHanoi();
        obj.torresHanoi(3, 1, 2, 3);
        System.out.println("Juego completado");
    }
    //Creando el metodo recursivo para solucionar las torres de Hanoi
    public void torresHanoi(int discos, int torre1, int torre2, int torre3){
        //Caso base
        if(discos == 1){
            System.out.println("Mover Disco de Torre "+torre1+" a Torre"+torre3);
        }else{
            torresHanoi(discos-1,torre1, torre3, torre2);
            System.out.println("Mover Disco de Torre"+torre1+" a Torre"+torre3);
            torresHanoi(discos-1, torre2, torre1, torre3);
        }
    }
}
