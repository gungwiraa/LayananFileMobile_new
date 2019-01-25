package com.example.ux32vd.tugasrecyclerview;

public class Menu {

    private String Nama ;
    private String Kategori ;
    private String Deskripsi ;
    private int Thumbnail ;

    public Menu() {
    }

    public Menu(String nama, String kategori, String deskripsi, int thumbnail) {
        Nama = nama;
        Kategori = kategori;
        Deskripsi = deskripsi;
        Thumbnail = thumbnail;
    }

    public String getNama() {
        return Nama;
    }

    public String getKategori() { return Kategori;}

    public String getDeskripsi() { return Deskripsi; }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setKategori(String kategori) {
        Kategori = kategori;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

}
