package com.example.sqlitesimpanbacadata.database;

import java.io.Serializable;

public class Teman {
    String Id;
    String nama;
    String telepon;

    public Teman() {
    }

    public Teman(String id, String nama, String telepon) {
        this.Id = id;
        this.nama = nama;
        this.telepon = telepon;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
