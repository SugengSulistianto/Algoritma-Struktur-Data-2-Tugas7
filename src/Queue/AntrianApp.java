/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author ACER
 */
public class AntrianApp {
     public static void main(String[] args){
        Antrian antrian = new Antrian(10);
        antrian.enqueque(40);
        System.out.println("");
        antrian.display();
        System.out.println("");
        antrian.enqueque(33);
        System.out.println("");
        antrian.display();
        System.out.println("");
        System.out.println("Nilai yang paling depan= " + antrian.peek());
        antrian.enqueque(60);
        System.out.println("");
        antrian.display();
        System.out.println("");
        System.out.println("Yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("");
        System.out.println("Yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("");
        antrian.enqueque(54);
        antrian.display();
        System.out.println("");
        System.out.println("Nilai yang paling depan= " + antrian.peek());
        System.out.println("Sugeng Sulistianto" );
    }
}
