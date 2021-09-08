package com.example.BlogHub.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="posts")
public class Post {
    @Id
    @SequenceGenerator(name = "postsIdSeq", sequenceName = "posts_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "postsIdSeq")
    @Column(nullable = false)
    private int id;
    @Column(nullable = false)
    private boolean isActive;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private String moderationStatus;
    private int moderatorId;
    @Column(nullable = false)
    private int userId;
    @Column(nullable = false)
    private Date time;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String text;
    @Column(nullable = false)
    private int viewCount;

}
