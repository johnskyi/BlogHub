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
@Table(name="post_votes")
public class PostVotes {
    @Id
    @SequenceGenerator(name = "postVoteIdSeq", sequenceName = "post_vote_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "postVoteIdSeq")
    @Column(nullable = false)
    private int id;
    @Column(nullable = false)
    private int userId;
    @Column(nullable = false)
    private int postId;
    @Column(nullable = false)
    private Date time;
    @Column(nullable = false)
    private int value;

}
