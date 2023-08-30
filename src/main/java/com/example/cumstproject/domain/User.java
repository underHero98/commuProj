package com.example.cumstproject.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String name;
    private String pw;
    private LocalDateTime localDateTime;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Board> board = new ArrayList<>();


}
