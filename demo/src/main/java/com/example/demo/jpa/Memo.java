package com.example.demo.jpa;

import lombok.*;

import javax.persistence.*;

/*
객체와 테이블 매핑 : @Entity, @Table
기본 키 매핑(PK) : @Id
필드와 컬럼 매핑 : @Column
연관관계 매핑 : @ManyToOne, @JoinColumn
*/

@Entity
@Table(name = "tbl_memo")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL의 AUTO_INCREMENT를 사용
    private Long id;

    @Column(length = 200, nullable = false)
    private String memoText;
}
