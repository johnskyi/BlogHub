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
@Table(name="captcha_codes")
public class CaptchaCode {
    @Id
    @SequenceGenerator(name = "captchaIdSeq", sequenceName = "captcha_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "captchaIdSeq")
    @Column(nullable = false)
    private int id;
    @Column(nullable = false)
    private Date time;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private String secretCode;

}
