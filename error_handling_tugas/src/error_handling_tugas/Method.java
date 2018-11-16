/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error_handling_tugas;



/**
 *
 * @author DESI-AMALIANY
 */
import java.io.IOException;
public class Method {
    public void exception(){
        try {
            /*int b = 10 / (a-c);
            System.out.println(b);
            String[] murid = new String[2];
            murid[0]="Rina";
            murid[1]="Meli";
            System.out.println(murid[3]);
            String x = "nama saya ani".substring(-11, 30);*/
            int a[]= new int[7];
            a[4]=30/0;
            System.out.println(a[4]);
            throw new IOException();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error ArrayIndexOutOfBoundsException: "+e.getMessage());
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("error StringIndexOutOfBoundsException: "+e.getMessage());
        } catch(IOException e){
            System.out.println("error IOException: "+e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("error ArithmeticException: "+e.getMessage());
        }
    }
}
