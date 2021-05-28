/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsoopkasus1;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Pelanggaran {
    private String nama;
    private String alamat;
    private String nik;
    private String jeniskendaraan;
    private String tipekendaraan;
    private ArrayList<String> jenispelanggaran;
    private String notelp;
    private String email;
    private int denda;
    private String tanggal;
    private String namapolisi;
    
    public Pelanggaran(String na, String al, String ni, String jenisken, String tipe, ArrayList<String> jenispel, String no, String em, String tgl, int den){
        this.nama = na;
        this.alamat = al;
        this.nik = ni;
        this.jeniskendaraan = jenisken;
        this.tipekendaraan = tipe;
        this.jenispelanggaran = jenispel;
        this.notelp = no;
        this.email = em;
        this.tanggal = tgl;
        this.denda = den;
    }
    
    public Pelanggaran(String pol){
        this.namapolisi = pol;
    }
    
    public void showpelanggaran(){
        System.out.println("Tanggal Pelanggaran : " + tanggal);
        System.out.println("Nama Pelanggar      : " + nama);
        System.out.println("Jenis Pelanggaran   : ");
        for(int i=0;i<jenispelanggaran.size();i++)
        {
            int indeks = i+1;
            System.out.println(indeks + ". " + jenispelanggaran.get(i));
        }
        System.out.println("Denda Tilang        : Rp" + denda + ",00\n");
    }
    
    public void cetaknamapol(){
        System.out.println("Nama Polisi yang Mencatat      : " + namapolisi);
    }
    
    public void cetaktanggal(){
        System.out.println("Tanggal Terjadinya Pelanggaran : " + tanggal);
    }
    
    public void cetak(){
        System.out.println("Data Pelanggar : ");
        System.out.println("Nama Pelanggar : " + nama);
        System.out.println("Alamat         : " + alamat);
        System.out.println("NIK            : " + nik);
        System.out.println("Nomor Telepon  : " + notelp);
        System.out.println("Email          : " + email);
        System.out.println("Kendaraan : ");
        System.out.println("Jenis Kendaraan : " + jeniskendaraan);
        System.out.println("Tipe Kendaraan    : " + tipekendaraan);
        System.out.println("Data Pelanggaran : ");
        System.out.println("Jenis Pelanggaran : ");
        for(int i=0;i<jenispelanggaran.size();i++)
        {
            int indeks = i+1;
            System.out.println(indeks + ". " + jenispelanggaran.get(i));
        }
        System.out.println("Denda Pelanggaran : Rp" + denda + ",00");
    }
    
}
