package com.artivisi.school.attendance.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="t_kehadiran")
public class Kehadiran {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_peserta", nullable = false)
    private Peserta peserta;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date masuk;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date pulang;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getMasuk() {
        return masuk;
    }

    public void setMasuk(Date masuk) {
        this.masuk = masuk;
    }

    public Peserta getPeserta() {
        return peserta;
    }

    public void setPeserta(Peserta peserta) {
        this.peserta = peserta;
    }

    public Date getPulang() {
        return pulang;
    }

    public void setPulang(Date pulang) {
        this.pulang = pulang;
    }
    
}
