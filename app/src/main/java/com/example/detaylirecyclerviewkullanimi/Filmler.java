package com.example.detaylirecyclerviewkullanimi;

public class Filmler {

    private int filmId;
    private String filmAdi;
    private String filmResim;
    private double filmFiyat;

    public Filmler() {

    }
    public Filmler(int filmId, String filmAdi, String filmResim, double filmFiyat) {
        this.filmId = filmId;
        this.filmAdi = filmAdi;
        this.filmResim = filmResim;
        this.filmFiyat = filmFiyat;
    }
    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public void setFilmAdi(String filmAdi) {
        this.filmAdi = filmAdi;
    }

    public String getFilmResim() {
        return filmResim;
    }

    public void setFilmResim(String filmResim) {
        this.filmResim = filmResim;
    }

    public double getFilmFiyat() {
        return filmFiyat;
    }

    public void setFilmFiyat(double filmFiyat) {
        this.filmFiyat = filmFiyat;
    }
}
