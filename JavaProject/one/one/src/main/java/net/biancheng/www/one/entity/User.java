package net.biancheng.www.one.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable=false,unique=true)
    private String userName;

    @Column(nullable = false, unique = false)
    private String passWord;

    @Column(nullable=false,unique=true)
    private String email;

    @Column(nullable=true,unique=true)
    private String nickName;

    @Column(nullable = false, unique = false)
    private String regTime;

    //TODO add  user information

}
