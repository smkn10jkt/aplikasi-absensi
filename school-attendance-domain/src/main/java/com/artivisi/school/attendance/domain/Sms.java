package com.artivisi.school.attendance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "sms")
public class Sms {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @NotEmpty
    @Column(name = "no_tujuan", nullable = false, unique = true)
    private String no_tujuan;

    @NotNull
    @NotEmpty
    @Column(name = "isi_sms")
    private String isi_sms;
    
    @NotNull
    @Column(name = "status_pengiriman")
    private String status_pengiriman;

    @NotNull
    @NotEmpty
    @Column(name = "tanggal_kirim")
    private String tanggal_kirim;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsi_sms() {
        return isi_sms;
    }

    public void setIsi_sms(String isi_sms) {
        this.isi_sms = isi_sms;
    }

    public String getNo_tujuan() {
        return no_tujuan;
    }

    public void setNo_tujuan(String no_tujuan) {
        this.no_tujuan = no_tujuan;
    }

    public String getStatus_pengiriman() {
        return status_pengiriman;
    }

    public void setStatus_pengiriman(String status_pengiriman) {
        this.status_pengiriman = status_pengiriman;
    }

    public String getTanggal_kirim() {
        return tanggal_kirim;
    }

    public void setTanggal_kirim(String tanggal_kirim) {
        this.tanggal_kirim = tanggal_kirim;
    }

    

    
}
