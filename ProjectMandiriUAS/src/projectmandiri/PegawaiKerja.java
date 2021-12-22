/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmandiri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author FAHMIANUHA
 */
public class PegawaiKerja extends TambahKaryawan implements hitunggaji{
            //UNTUK MENYIMPAN DATA DENGAN ARRAY LIST
            ArrayList<String> Kode = new ArrayList<>();  
            ArrayList<String> Nama = new ArrayList<>();
            ArrayList<String> Gol = new ArrayList<>();
            ArrayList<Integer> Usia = new ArrayList<>();
            ArrayList<String> Status = new ArrayList<>();
            ArrayList<Integer> Anak = new ArrayList<>();
            
            ArrayList<Integer> GP = new ArrayList<>();
            ArrayList<Double> TB = new ArrayList<>();
            ArrayList<Double> TG = new ArrayList<>();
            ArrayList<Double> TA = new ArrayList<>();
            ArrayList<Double> GK = new ArrayList<>();
            ArrayList<Double> Potongan = new ArrayList<>();
            ArrayList<Double> GB = new ArrayList<>();
            
            int tunjanganbojo = 0;
             int gajikotor,tunjangananak = 0;
             int tunjangangawe = 0, gajibersih, potongan;
            
              @Override
                public double hitungtunjanganbojo() {                    
                 return tunjanganbojo = (int) (gajipokok*0.1);
                }

                @Override
                public double hitungtunjangangawe() {
                    if(super.usia>30){
                tunjangangawe = (int) (gajipokok*0.15);                
            }
              return tunjangangawe = (int) (gajipokok*0.15);
                }

                @Override
                public double hitungtunjangananak() {
                    if(super.jumlahanak>0){
                tunjangananak = (int) (gajipokok*jumlahanak*0.05);
            }
              return tunjangananak = (int) (gajipokok*jumlahanak*0.05);
                }

                @Override
                public double hitunggajikotor() {
                    return
                gajikotor = gajipokok + tunjangangawe + tunjanganbojo + tunjangananak;
                              }

                @Override
                public double hitungpotongan() {
                    return
                    potongan = (int) (gajikotor*0.025);
                                 }

                @Override
                public double hitunggajibersih() {
                    return gajibersih = gajikotor - potongan;
                                 }
                
                public void Add() throws IOException {
                    
                    Scanner dyv = new Scanner(System.in);
                System.out.println("\t\t\t\tTAMBAH DATA KARYAWAN"
                        + "\n----------------------------------------------------------------------------------------");    		
    		System.out.print("Masukkan Kode Karyawan (K0XX)\t\t: ");
    		kode = dyv.nextLine(); 
    		System.out.print("Masukkan Nama Karyawan\t\t\t: ");
    		nama = dyv.nextLine(); 
    		System.out.print("Masukkan Alamat\t\t\t\t: ");
    		alamat = dyv.nextLine();
                System.out.print("Masukkan Tahun Kelahiran (YYYY)\t\t: ");
    		
                //USIA
                int tahunlahir; 
                System.out.print("Masukkan Tanggal Lahir (YYYY-MM-DD) \t: "+(tahunlahir = dyv.nextInt())+"-"+(ttl = dyv.nextLine()));
                usia = 2021-tahunlahir;
                ttl = dyv.nextLine();
                

                //GOLONGAN DAN GAJINYA
                boolean running = true;
                int counter = 0;
                while( running ) {
                    System.out.print("Masukkan Golongan\t\t\t: ");
                    gol = dyv.nextLine();
                    if( gol.equalsIgnoreCase("A") ) {
                        gajipokok=+5000000;
                        running=false;
                    } else if( gol.equalsIgnoreCase("B") ) {
                        gajipokok=+6000000;
                        running=false;
                    } else if( gol.equalsIgnoreCase("C") ) {
                        gajipokok=+7000000;
                        running=false;
                    }                    
                    else{
                        System.out.println("Mohon inputkan golongan dengan benar (A/B/C)");
                    running = true;
                    counter++;
                }
                }                
                
            //STATUS MENIKAH, ANAKNYA
                boolean berjalan = true;
                while( berjalan ) {
                    String status;
                    System.out.print("Masukkan Status Menikah\t\t\t: ");
                    status = dyv.nextLine(); 
                    
                    if( status.equals("1") ) {
                        statusmenikah = "Sudah Menikah";
                        System.out.println("\t//Karyawan Sudah Menikah");
                        System.out.print("Masukkan Jumlah Anak\t\t\t: ");    
                        jumlahanak = dyv.nextInt();
                        berjalan=false;
                    } else if( status.equals("0") ) {
                        statusmenikah = "Belum Menikah";
                        System.out.println("\t//Karyawan Belum Menikah");
                        jumlahanak = 0;
                        berjalan=false;
                    }                   
                    else{
                        System.out.println("Mohon inputkan status menikah dengan benar (0/1)");
                        berjalan = true;
                        counter++;
                    }
                }
                
            //MENYIMPAN DATA PAKE ARRAY
            Kode.add(kode);
            Nama.add(nama);
            Gol.add(gol);
            Usia.add(usia);
            Status.add(statusmenikah);
            Anak.add(jumlahanak);
            GP.add(gajipokok);
            TB.add(hitungtunjanganbojo());
            TG.add(hitungtunjangangawe());
            TA.add(hitungtunjangananak());
            GK.add(hitunggajikotor());
            Potongan.add(hitungpotongan());
            GB.add(hitunggajibersih());
        }
                
                
          public void Cari() throws IOException {
              String simpan;
              Scanner dyv = new Scanner(System.in);
              
              System.out.println("\t\t\t\tPENCARIAN DATA KARYAWAN"
                        + "\n----------------------------------------------------------------------------------------");  
              System.out.print("Masukkan kode karyawan yang ingin Anda cari: ");
              simpan = dyv.nextLine();
               System.out.println("----------------------------------------------------------------------------------------"
                      + "\n###Informasi Karyawan :###");
              for(int i=0;i<Kode.size();i++) {
                  if (Kode.get(i).equals(simpan))
                  {
                      System.out.println("Kode Karyawan\t\t: "+Kode.get(i));
                      System.out.println("Nama Karyawan\t\t: "+Nama.get(i));
                      System.out.println("Golongan\t\t: "+Gol.get(i));
                      System.out.println("Usia\t\t\t: "+Usia.get(i));
                      System.out.println("Status Menikah\t\t: "+Status.get(i));
                      System.out.println("Jumlah Anak\t\t: "+Anak.get(i));
                      System.out.println("------------------------------------------------");
                      System.out.println("Gaji Pokok\t\t: "+GP.get(i));
                      System.out.println("Tunjangan Istri/Suami\t: "+TB.get(i));
                      System.out.println("Tunjangan Pegawai\t: "+TG.get(i));
                      System.out.println("Tunjangan Anak\t\t: "+TA.get(i));
                      System.out.println("------------------------------------------------ +");
                      System.out.println("Gaji Kotor\t\t: "+GK.get(i));
                      System.out.println("Potongan\t\t: "+Potongan.get(i));
                      System.out.println("------------------------------------------------ -");
                      System.out.println("Gaji Bersih\t\t: "+GB.get(i));
                  
                  }
          }
          }
    
          
          public void View() throws IOException {
              System.out.println("\t\t\t\tDATA SELURUH KARYAWAN"
                        + "\n----------------------------------------------------------------------------------------");  
              System.out.println("     KODE KARY  \tNAMA KARY\tGOL\tUSIA \tSTATUS NIKAH \tJUMLAH ANAK");
              System.out.println("----------------------------------------------------------------------------------------");

              for(int i=0;i<Kode.size();i++) {
                  System.out.println("    "+Kode.get(i)+"\t\t"+Nama.get(i)+"   \t"
                  +Gol.get(i)+"\t"+Usia.get(i)+"\t"+Status.get(i)
                  +"\t    "+Anak.get(i));
              }
              System.out.println("----------------------------------------------------------------------------------------");
//      	
    		
    }
          public void Delete() throws IOException {
    		Scanner dyv = new Scanner(System.in);
    		String hapus;
                
                System.out.println("\t\t\t\tHAPUS DATA KARYAWAN"
                        + "\n----------------------------------------------------------------------------------------");
                System.out.println("Masukkan kode karyawan yang ingin Anda hapus: ");
    		hapus =  dyv.nextLine();
                
    		for(int i=0;i<Kode.size();i++) {
                  if (Kode.get(i).equals(hapus))
                  {
                      Kode.remove(i);
                      Nama.remove(i);
                      Gol.remove(i);
                      Usia.remove(i);
                      Status.remove(i);
                      Anak.remove(i);
                      GP.remove(i);
                      TB.remove(i);
                      TG.remove(i);
                      TA.remove(i);
                      GK.remove(i);
                      Potongan.remove(i);
                      GB.remove(i);
                      System.out.println("Data Karyawan dengan kode "+hapus +" berhasil dihapus!");
                  
                  }
                  else if(!Kode.get(i).equals(hapus)){
                      System.out.println("Tidak ada data karyawan dengan kode "+hapus+"!");
                  }
          }
        } 
}
