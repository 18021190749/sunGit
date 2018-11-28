package com.sun.ormMappings;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-16 14:21
 */
@Entity
@Data
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String allname;
    private String password;
    private String phone;
    private Date birthday;
    private String status;
    private Date createTime;
    private Date updateTime;

    public User() {
    }
}
