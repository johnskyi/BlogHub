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
@Table(name="post_comments")
public class PostComment {
    @Id
    @SequenceGenerator(name = "postCommentIdSeq", sequenceName = "post_comment_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "postCommentIdSeq")
    @Column(nullable = false)
    private int id;
    private int parentId;
    @Column(nullable = false)
    private int userId;
    @Column(nullable = false)
    private int postId;
    @Column(nullable = false)
    private Date time;
    @Column(nullable = false)
    private String text;
}
