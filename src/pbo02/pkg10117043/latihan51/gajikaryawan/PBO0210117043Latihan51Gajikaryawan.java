/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class PBO0210117043Latihan51Gajikaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        karyawan Karyawan = new karyawan();
        manager Manager = new manager();
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukan NIK: ");
        Karyawan.setNik(scn.next());
        System.out.print("Masukan Nama: ");
        Karyawan.setNama(scn1.nextLine());
        System.out.print("Masukan Golongan (1/2/3) : ");
        Karyawan.setGolongan(scn.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
        Karyawan.setJabatan(scn.next());
        System.out.print("masukan Jumlah Kehadiran : ");
        Manager.setKehadiran(scn.nextInt());
        System.out.println("");

        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK \t: " + Karyawan.getNik());
        System.out.println("NAMA \t: " + Karyawan.getNama());
        System.out.println("GOLONGAN: " + Karyawan.getGolongan());
        System.out.println("JABATAN : " + Karyawan.getJabatan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN \t: " + Manager.tunjanganGolongan(Karyawan.getGolongan()));
        System.out.println("TUNJANGAN JABATAN \t: " + Manager.tunjanganJabatan(Karyawan.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN \t: " + Manager.tunjanganKehadiran(Manager.getKehadiran()));

    }

}
