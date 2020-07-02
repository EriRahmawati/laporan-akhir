/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.Koneksi;
import Model.RincianTiket;
import Model.datapembeli;
import Model.datatiket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class TransaksiPembayaran  {
      private final Koneksi koneksi;
    ArrayList<RincianTiket> arrpembayaran;
    ArrayList<datapembeli>arrpembeli;
    ArrayList<datatiket>arrtiket;
    ArrayList<RincianTiket>arrbayar;

    public TransaksiPembayaran(){
        this.koneksi = new Koneksi();
        this.arrpembayaran=new ArrayList<>();
        this.arrpembeli= new ArrayList<>();
        this.arrtiket= new ArrayList<>();
        this.arrbayar= new ArrayList<>();
        
    }
    
    public void insertPembayaran(RincianTiket pembayaran) {
        
        String tanggalpembayaran = new SimpleDateFormat("dd/MM/yyyy").format(pembayaran.getTgl_pembayaran());
        
        this.koneksi.manipulasiData("INSERT INTO PEMBAYARAN (ID_PEMBAYARAN, ID_PEMBELI, ID_TIKET, JUMLAH_TIKET, HARGA_TOTAL, TGL_PEMBAYARAN) "
                + "VALUES ("+pembayaran.getId_pembayaran()+", "+pembayaran.getId_pembeli()+", "+ pembayaran.getId_tiket() +", '"+ pembayaran.getJumlah_tiket()
                +"', '"+ pembayaran.getHarga_total() +"', "+ "TO_DATE('"+ tanggalpembayaran +"','dd/mm/yyyy')"+")");
        System.out.println("INSERT INTO PEMBAYARAN (ID_PEMBAYARAN, ID_PEMBELI, ID_TIKET, JUMLAH_TIKET, HARGA_TOTAL, TGL_PEMBAYARAN)"
                + " VALUES ("+pembayaran.getId_pembayaran()+", "+pembayaran.getId_pembeli()+", "+ pembayaran.getId_tiket() +", '"
                + pembayaran.getJumlah_tiket()+"', '"+ pembayaran.getHarga_total() +"', "+ "TO_DATE('"+ tanggalpembayaran +"','dd/mm/yyyy')"+")");
    }
    
   /* public void UpdatePembayaran(RincianTiket pembayaran){
         String Tanggalpembayaran = new SimpleDateFormat("dd-MM-yyyy").format(pembayaran.get_tglpembayaran());
        
        this.koneksi.manipulasiData("UPDATE PEMBAYARAN SET "
                + " jumlah_tiket = '"+pembayaran.get_jumlahtiket()+"', "+"HARGA_TOTAL='"+pembayaran.get_hargatotal()+"', "+" tgl_pembayaran = TO_DATE('"+Tanggalpembayaran+"','dd-mm-yyyy'),"
                + "WHERE ID_PEMBELI = " + pembayaran.getid_pembeli()+" AND ID_TIKET="+pembayaran.getid_tiket()+"')");
       System.out.println("UPDATE PEMBAYARAN SET"
                + " jumlah_tiket = '"+pembayaran.get_jumlahtiket()+"', "+"HARGA_TOTAL ='"+pembayaran.get_hargatotal()+"','"+" tgl_pembayaran = TO_DATE('"+Tanggalpembayaran+"','dd-mm-yyyy'),"
                + "WHERE ID_PEMBELI = " + pembayaran.getid_pembeli()+" AND ID_TIKET ="+pembayaran.getid_tiket()+"')");
    
    }*/
    
    public void DeletePembayaran(RincianTiket pembayaran){
        this.koneksi.manipulasiData("DELETE FROM PEMBAYARAN WHERE ID_PEMBELI = " + pembayaran.getId_pembayaran());
    }
    
      public ArrayList<RincianTiket> getDataPembayaran() throws SQLException {
        this.arrpembayaran.clear();
        ResultSet rs = this.koneksi.GetData("SELECT pembayaran.id_pembayaran as kode_bayar, pembayaran.jumlah_tiket as tiket_dibeli, pembayaran.harga_total as total_harga, pembayaran.tgl_pembayaran as tanggal_bayar, pembeli.*, jenis_tiket.*" 
        +"FROM PEMBAYARAN JOIN PEMBELI ON PEMBAYARAN.ID_PEMBELI=PEMBELI.ID_PEMBELI "
        +"JOIN JENIS_TIKET ON PEMBAYARAN.ID_TIKET = JENIS_TIKET.ID_TIKET");
        
        while (rs.next()) {
           RincianTiket pembayaran = new RincianTiket();
           
           pembayaran.setId_pembayaran(rs.getInt("KODE_BAYAR"));
           pembayaran.setId_pembeli(rs.getInt("ID_PEMBELI"));
           pembayaran.setId_tiket(rs.getInt("TIKET_DIBELI"));
           pembayaran.setJumlah_tiket(rs.getInt("TIKET_DIBELI"));
           pembayaran.setHarga_total(rs.getInt("TOTAL_HARGA"));
           pembayaran.setTgl_pembayaran(rs.getDate("TANGGAL_BAYAR"));
        
           this.arrpembayaran.add(pembayaran);
        }
        return this.arrpembayaran;
    }
      
     public ArrayList<RincianTiket> getDataTransaksi(){
          try {
              this.arrbayar.clear();
              ResultSet rs = this.koneksi.GetData("SELECT * FROM PEMBAYARAN JOIN PEMBELI ON PEMBAYARAN.ID_PEMBELI=PEMBELI.ID_PEMBELI "
                      + "JOIN JENIS_TIKET ON PEMBAYARAN.ID_TIKET=JENIS_TIKET.ID_TIKET");
              
              while(rs.next()){
                  RincianTiket bayar = new RincianTiket();
                  
                  bayar.setId_pembayaran(rs.getInt("ID_PEMBAYARAN"));
                  bayar.setId_pembeli(rs.getInt("ID_PEMBELI"));
                  bayar.setId_tiket(rs.getInt("TIKET_DIBELI"));
                  bayar.setJumlah_tiket(rs.getInt("TIKET_DIBELI"));
                  bayar.setHarga_total(rs.getInt("TOTAL_HARGA"));
                  bayar.setTgl_pembayaran(rs.getDate("TANGGAL_BAYAR"));
                  
                  this.arrbayar.add(bayar);
                  
              }} catch (SQLException ex) {
              System.out.print(ex);
          }
          return this.arrbayar;
     }
    
      
    
    
    /*private final Koneksi koneksi;

    public TransaksiPembayaran() {
        this.koneksi = new Koneksi();
    }

  

    public void insert(int id_pembeli, int id_tiket, int jumlah_tiket, int harga_total, String tglbayar) {
        String kodeSql = "INSERT INTO transaksijual_07046 (id_pembeli, id_tiket, jumlah_tiket,harga_total , tgl_pembayaran) "
                + "VALUES (" + "id_pembeli.NEXTVAL, '" + id_tiket + "', '" + jumlah_tiket + "', '" + harga_total
                + "', TO_DATE('" + tglbayar + "', 'dd/mm/yyyy'))";
        this.koneksi.manipulasiData(kodeSql);
    }

    public DefaultTableModel viewTabel() throws SQLException {
        DefaultTableModel tabelModelTransaksiJual = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabelModelTransaksiJual.addColumn("Id Pembeli");
        tabelModelTransaksiJual.addColumn("Id Tiket");
        tabelModelTransaksiJual.addColumn("Jumlah Tiket");
        tabelModelTransaksiJual.addColumn("Harga Total");
        tabelModelTransaksiJual.addColumn("Tanggal Bayar"); 

        String kodeSql = "SELECT * FROM pembayaran";
        ResultSet hasilKodeSql = this.koneksi.getData(kodeSql);
        while (hasilKodeSql.next()) {
            int idpembeli = hasilKodeSql.getInt("id_pembeli");
            int idtiket = hasilKodeSql.getInt("id_tiket");
            int jumlahtiket = hasilKodeSql.getInt("jumlah_tiket");
            int hargatotal = hasilKodeSql.getInt("harga_total");
            Date tanggalBayar = hasilKodeSql.getDate("tgl_pembayaran");

            RincianTiket pembayaran = new RincianTiket();
            pembayaran.setid_pembeli(idpembeli);
            pembayaran.setid_tiket(idtiket);
            pembayaran.set_jumlahtiket(jumlahtiket);
            pembayaran.set_hargatotal(hargatotal);
            pembayaran.set_tglpembayaran(tanggalBayar);

            Object[] temp = new Object[5];
            temp[0] = pembayaran.getid_pembeli();
            temp[1] = pembayaran.getid_tiket();
            temp[2] = pembayaran.get_jumlahtiket();
            temp[3] = pembayaran.get_hargatotal();
            String tanggalBeliTerformat = new SimpleDateFormat("dd - MM - yyyy").format(tanggalBayar);
            temp[4] = tanggalBeliTerformat;

            tabelModelTransaksiJual.addRow(temp);
        }
        return tabelModelTransaksiJual;
    }*/
    
}
