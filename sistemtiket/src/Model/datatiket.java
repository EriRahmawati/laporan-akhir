/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class datatiket {
    private Integer id_tiket;
    private String tipe_tiket;
    private Integer total_seat;
    private String match;
    private Date match_day;
    private Integer harga_tiket;

    public Integer getId_tiket() {
        return id_tiket;
    }

    public void setId_tiket(Integer id_tiket) {
        this.id_tiket = id_tiket;
    }

    public String getTipe_tiket() {
        return tipe_tiket;
    }

    public void setTipe_tiket(String tipe_tiket) {
        this.tipe_tiket = tipe_tiket;
    }

    public Integer getTotal_seat() {
        return total_seat;
    }

    public void setTotal_seat(Integer total_seat) {
        this.total_seat = total_seat;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public Date getMatch_day() {
        return match_day;
    }

    public void setMatch_day(Date match_day) {
        this.match_day = match_day;
    }

    public Integer getHarga_tiket() {
        return harga_tiket;
    }

    public void setHarga_tiket(Integer harga_tiket) {
        this.harga_tiket = harga_tiket;
    }
    
    
    
   
}
