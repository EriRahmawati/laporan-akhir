
package Model;

import java.util.Date;


public class RincianTiket {
    private Integer id_pembayaran;
    private Integer id_tiket;
    private Integer id_pembeli;
    private Integer jumlah_tiket;
    private Integer harga_total;
    private Date tgl_pembayaran;

    public Integer getId_pembayaran() {
        return id_pembayaran;
    }

    public void setId_pembayaran(Integer id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }
    
    
    public Integer getId_tiket() {
        return id_tiket;
    }

    public void setId_tiket(Integer id_tiket) {
        this.id_tiket = id_tiket;
    }

    public Integer getId_pembeli() {
        return id_pembeli;
    }

    public void setId_pembeli(Integer id_pembeli) {
        this.id_pembeli = id_pembeli;
    }

    public Integer getJumlah_tiket() {
        return jumlah_tiket;
    }

    public void setJumlah_tiket(Integer jumlah_tiket) {
        this.jumlah_tiket = jumlah_tiket;
    }

    public Integer getHarga_total() {
        return harga_total;
    }

    public void setHarga_total(Integer harga_total) {
        this.harga_total = harga_total;
    }

    public Date getTgl_pembayaran() {
        return tgl_pembayaran;
    }

    public void setTgl_pembayaran(Date tgl_pembayaran) {
        this.tgl_pembayaran = tgl_pembayaran;
    }
    
   
  
   
}
