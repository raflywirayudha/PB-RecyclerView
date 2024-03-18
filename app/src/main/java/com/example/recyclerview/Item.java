package com.example.recyclerview;

public class Item {

    String nama;
    String nim;
    int image;

    public Item(String nama, String nim, int image) {
        this.nama = nama;
        this.nim = nim;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
