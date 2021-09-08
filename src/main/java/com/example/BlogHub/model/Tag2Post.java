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
@Table(name="tag2post")
public class Tag2Post {
    @Id
    @SequenceGenerator(name = "tag2PostIdSeq", sequenceName = "tag2_post_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tag2PostIdSeq")
    @Column(nullable = false)
    private int id;
    @Column(nullable = false)
    private int postId;
    @Column(nullable = false)
    private int tagId;
}
