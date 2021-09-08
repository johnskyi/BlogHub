package com.example.BlogHub.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="global_settings")
public class GlobalSettings {
    @Id
    @SequenceGenerator(name = "settingsIdSeq", sequenceName = "settings_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "settingsIdSeq")
    @Column(nullable = false)
    private int id;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String value;

}
