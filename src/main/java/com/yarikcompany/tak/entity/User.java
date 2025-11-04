package com.yarikcompany.tak.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@Table(name="`user`")
public class User {

    @Id
    private String id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String oblastOrCity;

    @Column(nullable = false)
    private String whereFoundServer;

    @Column(nullable = false)
    private Boolean doKnowRules;

    @Column(nullable = false)
    private Boolean haveBeenOnSimilarServers;
}
