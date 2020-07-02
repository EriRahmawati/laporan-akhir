/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.Koneksi;
import Model.datatiket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class TransaksiTiket {
    
    
    private final Koneksi koneksi;
    ArrayList<datatiket> arrtiket;

    public TransaksiTiket(){
        this.koneksi = new Koneksi();
        this.arrtiket=new ArrayList<>();
    }
    
    public void insertTiket(datatiket tiket) {
         String matchday = new SimpleDateFormat("dd/MM/yyyy").format(tiket.getMatch_day());
        
        this.koneksi.manipulasiData("INSERT INTO JENIS_TIKET (ID_TIKET, TIPE_TIKET, TOTAL_SEAT, MATCH, MATCH_DAY, HARGA_TIKET) "
                + "VALUES ("+tiket.getId_tiket()+", '"+ tiket.getTipe_tiket() +"', '"+ tiket.getTotal_seat()+"', '"+ tiket.getMatch() +"', "
                        + "TO_DATE('"+ matchday +"','dd/mm/yyyy'),"
                + "'"+ tiket.getHarga_tiket() +"')");
        System.out.println("INSERT INTO JENIS_TIKET (ID_TIKET, TIPE_TIKET, TOTAL_SEAT, MATCH, MATCH_DAY, HARGA_TIKET) "
                + "VALUES ("+tiket.getId_tiket()+", '"+ tiket.getTipe_tiket() +"', '"+ tiket.getTotal_seat()+"', '"+ tiket.getMatch() +"', "
                        + "TO_DATE('"+ matchday +"','dd/mm/yyyy'), "
                + "'"+ tiket.getHarga_tiket() +"')");
        
    }
    
     public ArrayList<datatiket> getDataTiket() throws SQLException {
        this.arrtiket.clear();
        ResultSet r = this.koneksi.GetData("SELECT * FROM JENIS_TIKET ORDER BY ID_TIKET ASC");
        while (r.next()) {
           datatiket tiket = new datatiket();
           tiket.setId_tiket(r.getInt("ID_TIKET"));
           tiket.setTipe_tiket(r.getString("TIPE_TIKET"));
           tiket.setTotal_seat(r.getInt("TOTAL_SEAT"));
           tiket.setMatch(r.getString("MATCH"));
           tiket.setMatch_day(r.getDate("MATCH_DAY"));
           tiket.setHarga_tiket(r.getInt("HARGA_TIKET"));
           
           
           this.arrtiket.add(tiket);
        }
        return this.arrtiket;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   /* private final Koneksi koneksi;

    public TransaksiTiket() {
        this.koneksi = new Koneksi();
    }

    public int getSequenceKodeMotor() throws SQLException {
        String kodeSql = "SELECT last_number FROM user_sequences WHERE sequence_name LIKE 'ID_TIKET'";
        ResultSet hasilKodeSql = this.koneksi.getData(kodeSql);
        hasilKodeSql.next();
        return hasilKodeSql.getInt("last_number");
    }


    public void insert(String type_motor, String warna, int harga_motor) {
        String kodeSql = "INSERT INTO JENIS_TIKET (id_tiket, tipe_tiket, harga_tiket, match) VALUES ("
                + "id_tiket.NEXTVAL, '" + type_motor + "', " + harga_motor + ", '" + warna + "')";
        this.koneksi.manipulasiData(kodeSql);
    }

    public DefaultTableModel viewTabel() throws SQLException {
        DefaultTableModel tabelModelmotor = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabelModelmotor.addColumn("Id_tiket");
        tabelModelmotor.addColumn("Tipe_tiket");
        tabelModelmotor.addColumn("Harga_tiket");
        tabelModelmotor.addColumn("Match");

        String kodeSql = "SELECT * FROM JENIS_TIKET ORDER BY ID_TIKET ASC";
        ResultSet hasilKodeSql = this.koneksi.getData(kodeSql);
        while (hasilKodeSql.next()) {
            int id_tiket = hasilKodeSql.getInt("id_tiket");
            String tipe_tiket = hasilKodeSql.getString("tipe_tiket");
            double harga_tiket= hasilKodeSql.getInt("harga_tiket");
            String match = hasilKodeSql.getString("match");
            datatiket dtTiket = new datatiket();
            dtTiket.setid_tiket(id_tiket);
            dtTiket.settipe_tiket(tipe_tiket);
            dtTiket.setharga_tiket(harga_tiket);
            dtTiket.setmatch(match);
            Object[] temp = new Object[4];
            temp[0] = dtTiket.getid_tiket();
            temp[1] = dtTiket.gettipe_tiket();
            temp[2] = dtTiket.getharga_tiket();
            temp[3] = dtTiket.getmatch();
            tabelModelmotor.addRow(temp);
        }
        return tabelModelmotor;
    }

    public int cariHargaTotalTiket(int id_pembeli) throws SQLException {
        String kodeSql = "SELECT id_tiket FROM pembayaran WHERE id_pembeli = " + id_pembeli;
        ResultSet hasilKodeSql = this.koneksi.getData(kodeSql);
        hasilKodeSql.next();
        String kodeSql2 = "SELECT a.id_tiket, b.id_tiket, b.harga_total, "
                + "FROM jenis_tiket a "
                + "JOIN pembayaran b ON a.id_tiket = b.id_tiket "
                + "WHERE b.kode_motor = " + hasilKodeSql.getInt("id_tiket");
        ResultSet hasilKodeSql2 = this.koneksi.getData(kodeSql2);
        hasilKodeSql2.next();
        return hasilKodeSql2.getInt("harga_total");
    }*/
}
