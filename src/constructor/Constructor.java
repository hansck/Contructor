/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author hanschristian
 */
public class Constructor {
    
    static class Mahasiswa {
        // Attributes, Properties, Value, Variable, Data
        String nama;
        String nim;
        int usia;
        String tipe;
        
        // Constructor
        public Mahasiswa() {
        }
        
        public Mahasiswa(String nama, String nim, int usia, int ipk, int ips) {
            this.nama = nama;
            this.nim = nim;
            this.usia = usia;
            if (ipk > ips) {
                this.tipe = "A";
            } else {
                this.tipe = "B";
            }
        }
        
        public Mahasiswa(String nama, String nim, int usia) {
            this.nama = nama;
            this.nim = nim;
        }
        
        // Constructor tidak bisa memiliki urutan tipe data yang sama dengan constructor lain.
        public Mahasiswa(String name, int age, String id) {
            this.nama = nama;
            this.nim = nim;
        }
    }

    public static void main(String[] args) {
        // Data mahasiswa terdiri dari nama, nim, usia
        // Cara ini tidak efisien karena bagaimana jika data mahasiswanya ada 1000?
//        String nama;
//        String nim;
//        int usia;
        
        // Instantiation
        Mahasiswa mahasiswa1 = new Mahasiswa();
        
        // Initialization
        mahasiswa1.nama = "Marvin";
        mahasiswa1.nim = "123456";
        
        // Output
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nim);
        
        // Instatiation & Initialization
        Mahasiswa mahasiswa3 = new Mahasiswa("Budi", "123", 18, 1, 2);
        Mahasiswa mahasiswa4 = new Mahasiswa("Bernardus", "321", 15, 3, 4);
        Mahasiswa mahasiswa5 = new Mahasiswa("Heru", "321", 50);
        System.out.println(mahasiswa3.nama);
        
        // Boleh dikombinasi misal data mahasiswa akan dirubah maka menggunakan manual.
        mahasiswa5.nama = "Andi";
        mahasiswa5.tipe = "A";
        
        // Contoh jika ingin menggunakan Looping
//        Mahasiswa[] arrMahasiswa = new Mahasiswa[1000];
//        for (int i = 0; i < 1000; i++) {
//            String nama = "XXX"; // Bisa diganti dengan input 
//            String nim = "123"; // Bisa diganti dengan input 
//            int usia = 15; // Bisa diganti dengan input 
//            arrMahasiswa[i] = new Mahasiswa(nama, nim, usia);
//        }
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(arrMahasiswa[i].nama);
//            System.out.println(arrMahasiswa[i].nim);
//        }
    }
}
