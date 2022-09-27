/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

import javax.swing.JOptionPane;

/**
 *
 * @author hanschristian
 */
public class Constructor2 {
    
    static class Mahasiswa {
        // Attributes, Properties, Variable, Data, Value
        String nama;
        String nim;
        int usia;
        String type;
        
        // constructor
        public Mahasiswa() {
        }
        
        public Mahasiswa(String nama, String nim, int usia, int ipk, int ips) {
            this.nama = nama;
            this.nim = nim;
            this.usia = usia;
            if (ipk > ips) {
                type = "A";
            } else {
                type = "B";
            }
        }
        
        public Mahasiswa(String nama, String nim) {
            this.nama = nama;
            this.nim = nim;
        }
        
        public Mahasiswa(String name, int id) {
            this.nama = name;
//            this.nim = id;
        }
    }
    
    static Mahasiswa[] createDummyData() {
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", "123456", 20, 3, 4);
        Mahasiswa mahasiswa2 = new Mahasiswa("Heru", "52323", 18, 2, 3);
        Mahasiswa mahasiswa3 = new Mahasiswa("Andi", "1234");
        
        Mahasiswa[] arrMahasiswa = new Mahasiswa[10];
        arrMahasiswa[0] = mahasiswa1;
        arrMahasiswa[1] = mahasiswa2;
        return arrMahasiswa;
    }
    
    public static void main(String[] args) {
        // Data mahasiswa berupa nama, nim, usia, jurusan, nilai1, nilai2, matkul
        String nama;
        String nim;
        int usia;
        
        Mahasiswa[] arrMahasiswa = createDummyData();
        
        Mahasiswa mahasiswa0 = new Mahasiswa();
        
        // instantiation
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", "123456", 20, 3, 4);
        Mahasiswa mahasiswa2 = new Mahasiswa("Heru", "52323", 18, 2, 3);
        Mahasiswa mahasiswa3 = new Mahasiswa("Andi", "1234");
        System.out.println(mahasiswa2.nama);
        
        // initialization
        mahasiswa1.nama = "Budi";
        mahasiswa1.usia = 1;
        
        
        System.out.println("Mahasiswa : " + mahasiswa1.nama);
        System.out.println("Mahasiswa : " + mahasiswa1.usia);
        
        String[] arrNama = new String[1000];
        int[] arrUsia = new int[1000];
//        Mahasiswa[] arrMahasiswa = new Mahasiswa[1000];
        
        for (int i = 0; i < 1000; i++) {
            arrNama[i] = "nama";
            arrUsia[i] = 1;
            
            arrMahasiswa[i] = new Mahasiswa("inputnama", "inputnim");
            arrMahasiswa[i].nama = "inputnama";
            arrMahasiswa[i].nim = "inputnim";
        }
    }
}
