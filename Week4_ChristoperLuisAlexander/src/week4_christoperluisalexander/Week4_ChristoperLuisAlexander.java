/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4_christoperluisalexander;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Week4_ChristoperLuisAlexander {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
        System.out.println("\n===== PARAGRAF =====");
        System.out.println("1. Input Paragraf");
        System.out.println("2. Tambah Paragraf");
        System.out.println("3. Lihat Paragraf");
        System.out.println("4. Cari Kata");
        System.out.println("5. Exit");
        System.out.print("Pilih: ");
    }
       public static void pressenter()
    { 
        System.out.print("Press enter to return to main menu..");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {
        }  
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner christoper = new Scanner(System.in);
        String paragraf="",simpan,hapus,paragrafbaru="",word;
        int pilih,i,count;
        try{
        do{
            menu();
            pilih = christoper.nextInt();
            christoper.nextLine();
            switch(pilih){
                case 1:{
                        if(paragraf.compareTo("")!=0)
                        {
                            System.out.println("Anda sudah memasukkan paragraf");
                            do{
                                System.out.print("Apakah Anda akan menghapusnya [Y/T]? ");
                                hapus = christoper.next();
                            }while(hapus.compareTo("Y")!=0 && hapus.compareTo("y")!=0 && hapus.compareTo("T")!=0 && hapus.compareTo("t")!=0);
                            if(hapus.compareTo("Y")==0 || hapus.compareTo("y")==0)
                            {
                                paragraf = "";
                                System.out.println("Paragraf sebelumnya berhasil dihapus.");
                            }
                            else
                            {
                                System.out.println("Paragraf tidak dihapus.");  
                            }
                            pressenter();
                        }
                        else
                        {
                        System.out.println("Silahkan masukkan paragraf Anda : \n");
                        paragraf = christoper.nextLine();
                        do{
                            System.out.print("Apakah Anda akan menyimpan [Y/T]? ");
                            simpan = christoper.next();
                        }while(simpan.compareTo("Y")!=0 && simpan.compareTo("y")!=0 && simpan.compareTo("T")!=0 && simpan.compareTo("t")!=0);
                        if(simpan.compareTo("Y")==0 || simpan.compareTo("y")==0)
                        {
                            System.out.println("Paragraf berhasil disimpan!!");
                        }
                        else
                        {
                            paragraf = "";
                            System.out.println("Paragraf tidak disimpan!!");
                        }
                        pressenter();
                    }
                        break;
                }
                case 2:{
                    if(paragraf.compareTo("")==0)
                    {
                        System.out.println("Anda belum memasukkan paragraf apapun");
                    }
                    else
                    {
                        System.out.println("Paragraf yang sudah anda input: ");
                        System.out.println(paragraf + "\n");
                        System.out.println("Silahkan masukan paragraph baru : \n");
                        paragrafbaru = christoper.nextLine();
                        paragraf = paragraf.concat(" " + paragrafbaru);
                        System.out.println("Paragraf berhasil ditambah");
                    }
                    pressenter();
                    break;
                }
                case 3:{
                    if(paragraf.compareTo("")==0)
                    {
                        System.out.println("Anda belum memasukkan paragraf apapun");
                    }
                    else
                    {
                        System.out.println(paragraf);
                    }
                    pressenter();
                    break;
                }
                case 4:{
                    if(paragraf.compareTo("")==0)
                    {
                        System.out.println("Anda belum memasukkan paragraf apapun");
                    }
                    else
                    {
                        count = 0;
                        String paragraf1 = paragraf.replaceAll("[^a-zA-Z- ]","");
                        String kata[] = paragraf1.split(" ");
                        do{
                            System.out.print("Masukkan kata yang akan dicari (hanya satu kata | penulisan huruf kecil dan huruf besar berpengaruh) : ");
                            word = christoper.nextLine();
                        }while(word.compareTo("")==0 || word.contains(" "));
                        if(paragraf.contains(word))
                        {
                            for(i=0;i<kata.length;i++)
                            {
                                if(word.compareTo(kata[i])==0)
                                {
                                    count++;
                                }
                            }
                            System.out.println("Hasil : ");
                            System.out.println(word + " sebanyak " + count + " kali");
                            count=0;
                            for(i=0;i<kata.length;i++)
                            {
                                if(word.compareTo(kata[i])==0)
                                {
                                    count++;
                                    System.out.println(word + " " + count + " ");
                                    if(i-1==-1)
                                    {
                                        System.out.println("Tidak memiliki kata sebelum");
                                        System.out.println("Kata sesudah : " + kata[i+1] + "\n");
                                    }
                                    else if(i+1==kata.length)
                                    {
                                        System.out.println("Kata sebelum : " + kata[i-1]);
                                        System.out.println("Tidak memiliki kata sesudah" + "\n");
                                    }
                                    else
                                    {
                                        System.out.println("Kata sebelum : " + kata[i-1]);
                                        System.out.println("Kata sesudah : " + kata[i+1] + "\n");
                                    } 
                                }
                            }
                       }
                       else
                        {
                            System.out.println("Tidak ada kata yang ditemukan");
                        }
                 }
                    pressenter();
                    break;
                }
            }
        }while(pilih!=5);
        }
        catch(Exception WrongInput)
        {
            System.out.println("Terjadi kesalahan!! Input harus berupa bilangan bulat. Program berhenti!!");
        }
        finally{
            System.out.println("Terima kasih sudah menggunakan program ini. Sampai jumpa!!");
        }
    }
}
