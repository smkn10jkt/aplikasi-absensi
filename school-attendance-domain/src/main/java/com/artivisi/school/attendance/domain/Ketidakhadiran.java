package com.artivisi.school.attendance.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="t_ketidakhadiran")
public class Ketidakhadiran {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_peserta", nullable = false)
    private Peserta peserta;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "jenis_ketidakhadiran", nullable = false)
    private JenisKetidakhadiran jenisKetidakhadiran;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date tanggal;

    private String keterangan;
}
