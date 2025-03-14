/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author FAUZI
 */
public class Barang {
     private String nama;
        private int jumlah;

        public Barang(String nama, int jumlah) {
            this.nama = nama;
            this.jumlah = jumlah;
        }

        @Override
        public String toString() {
            return nama + " - " + jumlah + " pcs";
        }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }
}
