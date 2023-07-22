/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author USER
 */
public class CatDetail extends Cat {
    //    overriding
    public CatDetail(String merk, String kode) {
        super(merk, kode);
    }
    
    public int getTahunProduksi() {
        return Integer.parseInt(getKode().substring(4, 6)) + 2000;
    }
     
    public String getJenis(){
        String kodeJenis = getKode().substring(0, 1);
//        seleksi switch
        switch (kodeJenis){
            case "M":
                return "Matte";
            case "G":
                return "Glosy";
            default:
                return "tidak ada jenis lain";
        }
    }
    
    public String getWarna(){
        String kodeWarna = getKode().substring(1, 4);
//        seleksi switch
        switch (kodeWarna){
            case "003":
                return "Merah";
            case "008":
                return "Biru";
            case "009":
                return "Hitam";
            default:
                return "tidak ada jenis lain";
        }
    }   
    
//    polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo() +
                "\nJenis Cat: "+getJenis()+
                "\nWarna: "+getWarna()+
                "\nTahun Lahir: "+getTahunProduksi();
        
    }
}
