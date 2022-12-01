/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InvTania;

/**
 *
 * @author labinfo
 */
public class Recursivo {
    
     static long f(int n) {
        if (n < 2) {
            return n;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

    public static void main(String[] args) {

	
	for (int i = 0; i < 20; i++) {
            System.out.print("(" + i + "):" + Recursivo.f(i) + "\t");
        }

    }

}
    

