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
@Table(name="tags")
public class Tag {
    @Id
    @SequenceGenerator(name = "tagsIdSeq", sequenceName = "tags_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tagsIdSeq")
    @Column(nullable = false)
    private int id;
    @Column(nullable = false)
    private int postId;
    @Column(nullable = false)
    private int tagId;
}