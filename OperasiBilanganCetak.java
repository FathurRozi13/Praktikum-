/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class OperasiBilanganCetak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperasiPenjumlahan a = new OperasiPenjumlahan();
        a.tampil();
        System.out.println("\n");
        OperasiPengurangan b = new OperasiPengurangan();
        b.tampil();
        System.out.println("\n");
        OperasiPerkalian c = new OperasiPerkalian();
        c.tampil();
        System.out.println("\n");
        OperasiPembagian d = new OperasiPembagian();
        d.tampil();
        System.out.println("\n");
    }  
}
