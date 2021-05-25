package com.rxc.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter

public class User {

    @Id
    @Column
    private String id;

    @Column
    private String phoneNumber;
}
