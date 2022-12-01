/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InvTania;

/**
 *
 * @author labinfo
 */
public class Inter {
    
     static long f(int n) {
        int act = 0;     
        int ant = 0;   

        for (int i = 1; i <= n; i++) {    F = act

            if (i == 1) {
                act = 1;
                ant = 0;
            } else {
                act += ant;
                ant = act - ant;
            }

        }

        return act;
    }

    public static void main(String[] args) {

	
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + Inter.f(i) + "\t");
        }

    }

}
    

