/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan51.gajikaryawan;

/**
 *
 * @author Acer
 */
public class manager {
    private int kehadiran;
    private float tunjanganKehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
     tunjanganKehadiran = kehadiran * 10000;  
      return tunjanganKehadiran;  
    }
    
     public float tunjanganJabatan(String jabatan){
        if (jabatan.equalsIgnoreCase("manager")) {
            tunjanganJabatan = 2000000;  
        }else if (jabatan.equalsIgnoreCase("kabag")){
        }else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;       
    }
    
   public float tunjanganGolongan(int golongan){
       switch (golongan){
           case 1:
               tunjanganGolongan = 500000;
               break;
               case 2:
               tunjanganGolongan = 1000000;
               break;
               case 3:
               tunjanganGolongan = 1500000;
               break;
               default:
               tunjanganGolongan = 0;
               break;
       }
        return tunjanganGolongan;
    }
   public float gajiTotal(){
      return tunjanganKehadiran + tunjanganJabatan + tunjanganGolongan;
       
   }
    
     
    
}
