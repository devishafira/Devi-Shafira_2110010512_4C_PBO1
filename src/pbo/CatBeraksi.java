/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

public class CatBeraksi{
    public static void main(String[] args) {

try{
    //io sederhana
    Scanner scanner = new Scanner (System.in);

    //array
        CatDetail[] cat = new CatDetail[2];
        for(int i=0; i<cat.length; i++) {
                System.out.print("Masukkan Merk cat "+(i+1)+" ");
                String merk = scanner.nextLine();
                System.out.print("Masukkan Kode  "+(i+1)+" ");
                String kode = scanner.nextLine();

        //        objek
                cat[i] = new CatDetail (merk, kode);
    }

        for(CatDetail data: cat) {
            System.out.println("==================");
            System.out.println("Data Cat: ");
            System.out.println(data.displayInfo());
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan format cat: "+e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan format kode: "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan umum: "+e.getMessage());
    }
  }
}
