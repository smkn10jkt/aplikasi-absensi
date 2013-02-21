package com.artivisi.school.attendance.domain;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="m_jenis_peserta")
public class JenisPeserta {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @NotEmpty
    @Column(nullable = false, unique = true)
    private String kode;

    @NotNull
    @NotEmpty
    @Column(nullable = false)
    private String nama;

    
}
