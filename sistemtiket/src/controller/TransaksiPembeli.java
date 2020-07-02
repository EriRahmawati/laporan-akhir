
package controller;

import Model.RincianTiket;
import Model.datapembeli;
import Model.datatiket;
import Database.Koneksi;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



public class TransaksiPembeli {
    
    private final Koneksi koneksi;
    ArrayList<datapembeli> arrpembeli;

    public TransaksiPembeli(){
        this.koneksi = new Koneksi();
        this.arrpembeli=new ArrayList<>();
    }
    
    public void insertPembeli(datapembeli pembeli) {
        
        this.koneksi.manipulasiData("INSERT INTO PEMBELI (ID_PEMBELI, NIK, NAMA_PEMBELI, JENIS_KELAMIN, ALAMAT_07057) "
                + "VALUES ("+pembeli.getId_pembeli()+","+ pembeli.getNik() +",'"+ pembeli.getNama_pembeli()+"','"+ pembeli.getJenis_kelamin() +"','"
                + pembeli.getAlamat_07057()+"')");
        
        System.out.println("INSERT INTO PEMBELI (ID_PEMBELI, NIK, NAMA_PEMBELI, JENIS_KELAMIN, ALAMAT_07057) "
                + "VALUES ("+pembeli.getId_pembeli()+", '"+ pembeli.getNik() +"','"+ pembeli.getNama_pembeli()+"','"+ pembeli.getJenis_kelamin() +"','"
                + pembeli.getAlamat_07057()+"')");
    }
    
    
//    public void deletePembeli(datapembeli pembeli){
//        this.koneksi.manipulasiData("DELETE FROM PEMBELI WHERE ID_PEMBELI = " + pembeli.getid_pembeli());
//        
//    
//    }
    
    
//    Update Pembeli
    public void UpdatePembeli(datapembeli pembeli){
       
        this.koneksi.manipulasiData("UPDATE PEMBELI SET "+"nik = '"+pembeli.getNik()+"', "+"nama_pembeli = '"+pembeli.getNama_pembeli()
                                    +"', "+"jenis_kelamin='"+pembeli.getJenis_kelamin()+"', "
                                    +"alamat_07057='"+pembeli.getAlamat_07057()+"' "+" WHERE ID_PEMBELI="+pembeli.getId_pembeli());
        System.out.println("UPDATE PEMBELI SET "+"nik = '"+pembeli.getNik()+"', "+"nama_pembeli = '"+pembeli.getNama_pembeli()
                                    +"', "+"jenis_kelamin='"+pembeli.getJenis_kelamin()+"', "
                                    +"alamat_07057='"+pembeli.getAlamat_07057()+"' "+" WHERE ID_PEMBELI="+pembeli.getId_pembeli());
    }
    
    
    
    public ArrayList<datapembeli> getDataPembeli() {
        try {
            this.arrpembeli.clear();
            ResultSet rs = this.koneksi.GetData("SELECT * FROM PEMBELI ORDER BY ID_PEMBELI ASC");
            while (rs.next()) {
                datapembeli pembeli = new datapembeli();
                pembeli.setId_pembeli(rs.getInt("ID_PEMBELI"));
                pembeli.setNik(rs.getInt("NIK"));
                pembeli.setNama_pembeli(rs.getString("NAMA_PEMBELI"));
                pembeli.setJenis_kelamin(rs.getString("JENIS_KELAMIN"));
                pembeli.setAlamat_07057(rs.getString("ALAMAT_07057"));
                
                
                this.arrpembeli.add(pembeli);
            }
            
        } catch (SQLException ex) {
            System.out.print(ex);
        }
       return this.arrpembeli;
    }
    
    
    
    
    
    
    
    
    
    
    
   /* private final Koneksi koneksi;
    
    public TransaksiPembeli (){
        this.koneksi= new Koneksi();
    }
    
    public int getSequenceIdPembeli() throws SQLException{
        String kodeSql = "SELECT * FROM user_sequences WHERE sequence_name LIKE 'ID_PEMBELI'";
        ResultSet hasilkodesql = this.koneksi.getData(kodeSql);
        hasilkodesql.next();
        return hasilkodesql.getInt("Last_number");
    }
    
    public void insert (int nik, String jenis_kelamin, String nama_pembeli, String alamat){
        String kodeSql = "INSERT INTO PEMBELI (id_pembeli, nik, nama_pembeli, alamat_07057) "
                + "VALUES (" + "id_pembeli.NEXTVAL, '" + nik + "', '" + nama_pembeli + "', '" + alamat + "')";
        this.koneksi.manipulasiData(kodeSql);
    }
    
    public void update(int id_pembeli, int nik, String jenis_kelamin, String nama_pembeli, String alamat){
        String kodeSql = "UPDATE Pembeli SET nama_pembeli = '" + nama_pembeli + "', nik = '" + nik
                + "', Alamat_07057 = '" + alamat + "' WHERE Kode_pembeli = " + id_pembeli;
        this.koneksi.manipulasiData(kodeSql);
    }
    
    public void delete (int id_pembeli){
        String kodeSql = "DELETE FROM Pembeli WHERE id_pembeli = " + id_pembeli;
        this.koneksi.manipulasiData(kodeSql);
    }
    
    
    
    public DefaultTableModel viewTabel() throws SQLException {
       DefaultTableModel tabelPembeli = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }  
    };
       tabelPembeli.addColumn("Kode pembeli");
        tabelPembeli.addColumn("Nik pembeli");
        tabelPembeli.addColumn("Nama pembeli");
        tabelPembeli.addColumn("Alamat pembeli");

        String kodeSql = "SELECT * FROM pembeli";
        ResultSet hasilKodeSql = this.koneksi.getData(kodeSql);
        while (hasilKodeSql.next()) {
            int id_pembeli = hasilKodeSql.getInt("id_pembeli");
            int nik = hasilKodeSql.getInt("nik");
            String nama_pembeli = hasilKodeSql.getString("nama_pembeli");
            String alamat = hasilKodeSql.getString("alamat_07057");
            datapembeli pembeli = new datapembeli();
            pembeli.setid_pembeli(id_pembeli);
            pembeli.setnama_pembeli(nama_pembeli);
            pembeli.setalamat_07057(alamat);
            pembeli.setnik(nik);
            Object[] temp = new Object[4];
            temp[0] = pembeli.getid_pembeli();
            temp[1] = pembeli.getnik();
            temp[2] = pembeli.getnama_pembeli();
            temp[3] = pembeli.getalamat_07057();
            tabelPembeli.addRow(temp);
        }
        return tabelPembeli;
    }
    
     public ArrayList<datapembeli> getSemuaDataPembeli() throws SQLException {
        ArrayList<datapembeli> daftarDataPembeli = new ArrayList<>();

        String kodeSql = "SELECT * FROM pembeli";
        ResultSet hasilKodeSql = this.koneksi.getData(kodeSql);
        while (hasilKodeSql.next()) {
            int id_pembeli = hasilKodeSql.getInt("id_pembeli");
            int nik = hasilKodeSql.getInt("nik");
            String nama_pembeli = hasilKodeSql.getString("nama_pembeli");
            String Alamat = hasilKodeSql.getString("alamat");
            datapembeli pembeli = new datapembeli();
            pembeli.setid_pembeli(id_pembeli);
            pembeli.setnama_pembeli(nama_pembeli);
            pembeli.setalamat_07057(Alamat);
            pembeli.setnik(nik);
            daftarDataPembeli.add(pembeli);
        }
        return daftarDataPembeli;
    }

    public boolean cekDataPembeliMasihKosong() throws SQLException {
        String kodeSql = "SELECT * FROM Pembeli";
        ResultSet hasilKodeSql = this.koneksi.getData(kodeSql);
        return !hasilKodeSql.next();
    }

    public int cariKodePembeli(String namaPembeli) throws SQLException {
        String kodeSql = "SELECT Kode_pembeli FROM Pembeli WHERE nama_pembeli LIKE '" + namaPembeli + "'";
        ResultSet hasilKodeSql = this.koneksi.getData(kodeSql);
        hasilKodeSql.next();
        return hasilKodeSql.getInt("id_pembeli");
    }

    public datapembeli cariDataPembeli(int id_pembeli) throws SQLException {
        datapembeli pembeli = null;
        String kodeSql = "SELECT * FROM Pembeli WHERE id_pembeli = " + id_pembeli;
        ResultSet hasilKodeSql = this.koneksi.getData(kodeSql);
        if (hasilKodeSql.next()) {
            int nik = hasilKodeSql.getInt("nik");
            String nama_pembeli = hasilKodeSql.getString("nama_pembeli");
            String alamat = hasilKodeSql.getString("alamat");
            pembeli = new datapembeli();
            pembeli.setid_pembeli(id_pembeli);
            pembeli.setnama_pembeli(nama_pembeli);
    
            pembeli.setalamat_07057(alamat);
            pembeli.setnik(nik);
        }
        return pembeli;
    }*/

    
    
}