package com.artivisi.school.attendance.domain;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="t_peserta")
public class Peserta {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String id;


    @NotNull
    @NotEmpty
    @Column(nullable = false, unique = true)
    private String nomor;

    @NotNull
    @NotEmpty
    @Column(nullable = false)
    private String nama;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_jenis_peserta", nullable = false)
    private JenisPeserta jenisPeserta;

    
}
