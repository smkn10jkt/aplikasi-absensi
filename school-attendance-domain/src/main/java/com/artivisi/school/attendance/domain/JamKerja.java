package com.artivisi.school.attendance.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name="m_jam_kerja")
public class JamKerja {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_jenis_peserta", nullable = false)
    private JenisPeserta jenisPeserta;

    @NotNull
    @Column(nullable = false, name = "jam_masuk")
    @Temporal(TemporalType.TIME)
    private Date jamMasuk;

    @NotNull
    @Column(nullable = false, name = "jam_pulang")
    @Temporal(TemporalType.TIME)
    private Date jamPulang;

    @NotNull
    @Min(0)
    @Column(name = "hari_kerja", nullable = false)
    private BigInteger hariKerja;

    public BigInteger getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(BigInteger hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(Date jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public Date getJamPulang() {
        return jamPulang;
    }

    public void setJamPulang(Date jamPulang) {
        this.jamPulang = jamPulang;
    }

    public JenisPeserta getJenisPeserta() {
        return jenisPeserta;
    }

    public void setJenisPeserta(JenisPeserta jenisPeserta) {
        this.jenisPeserta = jenisPeserta;
    }


}
