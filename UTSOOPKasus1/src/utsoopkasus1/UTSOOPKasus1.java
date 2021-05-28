/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsoopkasus1;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author ASUS
 */
public class UTSOOPKasus1 {
    public static void menu(){
        System.out.println("\n=== Tilang Online Kota Warna Warni ===");
        System.out.println("1. Login");
        System.out.println("2. Pendataan Pelanggaran");
        System.out.println("3. Melihat Pelanggaran");
        System.out.println("4. Menampilkan Surat Tilang");
        System.out.println("5. Logout");
        System.out.print("Pilih: ");
    }
    
    public static void pressenter()
    { 
        System.out.print("\nPress enter to continue..");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {
        }  
    }
    
    public static void login(ArrayList<Pelanggaran> pelanggaran, boolean isLogin, ArrayList<Pelanggaran> Polisi){
        if(isLogin == true)
        {
            System.out.println("\nAnda sudah melakukan login!");
        }
        else
        {
            String pass,pol;
            Scanner christoper = new Scanner(System.in);
            System.out.println("\n=== Login ===");
            System.out.print("\nMasukkan Nama Anda: ");
            pol = christoper.nextLine();
            do{
                System.out.print("Masukkan Password Anda [Password Default: 123456]: ");
                pass = christoper.nextLine();
            }while(pass.compareTo("123456")!=0);
            System.out.println("Login berhasil..."); 
            Pelanggaran polisi = new Pelanggaran(pol);
            Polisi.add(polisi);
        }
    }
    
    public static void adddata(ArrayList<Pelanggaran> pelanggaran, boolean isLogin){
        if(isLogin==false)
        {
            System.out.println("\nAnda belum login, silakan login terlebih dahulu");
        }
        else
        {
            String na, al, ni, jenisken, tipe, pelang, no, em, tgl, ulang;
            ArrayList<String> jenispel = new ArrayList<>();
            int nomor,den=0;
            Scanner christoper = new Scanner(System.in);
            System.out.println("\n=== Pendataan Pelanggaran ===");
            System.out.print("\nMasukkan nama pelanggar: ");
            na = christoper.nextLine();
            System.out.print("Masukkan alamat pelanggar: ");
            al = christoper.nextLine();
            do{
                System.out.print("Masukkan NIK pelanggar [Wajib Berupa 16 Angka Tanpa Spasi]: ");
                ni = christoper.nextLine();
            }while(ni.length()!=16 || !ni.matches("^[0-9]*$"));
            do{
                System.out.print("Masukkan jenis kendaraan pelanggar [Roda Dua | Roda Empat/Lebih] (Huruf Kecil dan Besar Berpengaruh): ");
                jenisken = christoper.nextLine();
            }while(jenisken.compareTo("Roda Dua")!=0 && jenisken.compareTo("Roda Empat/Lebih")!=0);
            System.out.print("Masukkan tipe kendaraan pelanggar: ");
            tipe = christoper.nextLine();
            System.out.println("Jenis-jenis Pelanggaran");
            System.out.println("1. Menggunakan Gawai/Handphone saat berkendara [Roda dua: Rp750.000,00 | Roda empat/lebih: Rp750.000,00}");
            System.out.println("2. Tidak memakai helm [Roda dua: Rp250.000,00]");
            System.out.println("3. Tidak memakai sabuk pengaman [Roda empat/lebih: Rp250.000,00]");
            System.out.println("4. Melanggar rambu lalu lintas dan marka jalan [Roda dua: Rp500.000,00 | Roda empat/lebih: Rp500.000,00]");
            System.out.println("5. Memakai plat nomor palsu [Roda dua: Rp500.000,00 | Roda empat/lebih: Rp500.000,00]");
            do{
            do{
            System.out.print("Masukkan nomor jenis pelanggaran [1-5]: ");
            nomor = christoper.nextInt();
            }while(nomor<1 || nomor>5);
            switch(nomor) {
                case 1:{
                    pelang = "Menggunakan Gawai/Handphone saat berkendara";
                    den = den + 750000;
                    jenispel.add(pelang);
                    break;
                }
                case 2:{
                    if(jenisken.compareTo("Roda Dua")==0)
                    {
                        pelang = "Tidak memakai helm";
                        den = den + 250000;
                        jenispel.add(pelang);
                    }
                    else
                    {
                        System.out.println("Jenis kendaraan harus beroda dua!");
                    }   
                    break;
                }
                case 3:{
                    if(jenisken.compareTo("Roda Empat/Lebih")==0)
                    {
                        pelang = "Tidak memakai sabuk pengaman";
                        den = den + 250000;
                        jenispel.add(pelang);
                    }
                    else
                    {
                        System.out.println("Jenis kendaraan harus beroda empat!");
                    }   
                    break;
                }
                case 4:{
                    pelang = "Melanggar rambu lalu lintas dan marka jalan";
                    den = den + 500000;
                    jenispel.add(pelang);
                    break;
                }
                case 5:{
                    pelang = "Memakai plat nomor palsu";
                    den = den + 500000;
                    jenispel.add(pelang);
                    break;
                }
            }
            christoper.nextLine();
                do{
                    System.out.print("Apakah Anda ingin memasukkan jenis pelanggaran lagi? [Y/N]: ");
                    ulang = christoper.nextLine();
                }while(ulang.compareTo("Y")!=0 && ulang.compareTo("y")!=0 && ulang.compareTo("N")!=0 && ulang.compareTo("n")!=0);
            }while(ulang.compareTo("Y")==0 || ulang.compareTo("y")==0);
            do{
                System.out.print("Masukkan nomor telepon pelanggar [maks 15 digit angka tanpa spasi]: ");
                no = christoper.nextLine();
            }while(!no.matches("^[0-9]*$") || no.length()>15);
            do{
                System.out.print("Masukkan email pelanggar [dalam format email@email.com]: ");
                em = christoper.nextLine();
            }while(!em.matches("^[A-Za-z0-9+_.-]+@(.+)$"));
            LocalDate tanggalpel = LocalDate.now();
            DateTimeFormatter ubahtgl = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            String formattgl = tanggalpel.format(ubahtgl);
            tgl = formattgl;
            Pelanggaran pel = new Pelanggaran(na,al,ni,jenisken,tipe,jenispel,no,em,tgl,den);
            pelanggaran.add(pel);
            System.out.println("Data berhasil diinput!!!");
        }
    }
    
    public static void viewdata(ArrayList<Pelanggaran> pelanggaran, boolean isLogin){
        if(isLogin==false)
        {
            System.out.println("\nAnda belum login, silakan login terlebih dahulu");
        }
        else
        {
            if(pelanggaran.isEmpty())
            {
                System.out.println("\nBelum ada data pelanggaran");
            }
            else
            {
                int i;
                    System.out.println("\n=== Data Pelanggaran ===\n");
                    for(i=0;i<pelanggaran.size();i++)
                    {
                        pelanggaran.get(i).showpelanggaran();
                    }
            }
        }
    }
    
    public static void cetaksurat(ArrayList<Pelanggaran> pelanggaran, boolean isLogin, ArrayList<Pelanggaran> Polisi){
        if(isLogin==false)
        {
            System.out.println("\nAnda belum login, silakan login terlebih dahulu");
        }
        else
        {
            if(pelanggaran.isEmpty())
            {
                System.out.println("\nBelum ada data pelanggaran");
            }
            else
            {
                int i;
                    System.out.println("\n=== Surat Tilang ===\n");
                    for(i=0;i<pelanggaran.size();i++)
                    {
                        pelanggaran.get(i).cetaktanggal();
                        Polisi.get(0).cetaknamapol();
                        pelanggaran.get(i).cetak();
                        System.out.println("\n");
                    }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih;
        boolean isLogin = false;
        ArrayList<Pelanggaran> pelanggaran = new ArrayList<>();
        ArrayList<Pelanggaran> Polisi = new ArrayList<>();
        Scanner christoper = new Scanner(System.in);
        try{
        do{
            menu();
            pilih = christoper.nextInt();
            switch(pilih){
                case 1:{
                    login(pelanggaran,isLogin,Polisi);
                    isLogin = true;
                    pressenter();
                    break;
                }
                case 2:{
                    adddata(pelanggaran,isLogin);
                    pressenter();
                    break;
                }
                case 3:{
                    viewdata(pelanggaran,isLogin);
                    pressenter();
                    break;
                }
                case 4:{
                    cetaksurat(pelanggaran,isLogin,Polisi);
                    pressenter();
                    break;
                }
                case 5:{
                    System.out.println("\nLogout berhasil!!!");
                    System.out.println("Terima kasih telah menggunakan aplikasi ini :)");
                }
            }
        }while(pilih!=5);
    }
        catch(Exception wronginput)
        {
            System.out.println("Terjadi kesalahan input! Input harus berupa bilangan bulat! Program Berhenti!!");
        }
    }    
}
