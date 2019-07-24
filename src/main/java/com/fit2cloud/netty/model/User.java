package com.fit2cloud.netty.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private Long id;

    private String name;

    private String email;

    private String source;

    private String accessToken;

    private String status;

    private Date created;

    private Boolean admin;

    private String company;

    private Long phone;

    private String activeCode;

    private Date activeTimeout;

    private String forgetCode;

    private Date forgetTimeout;

    private Date lastLogin;

    private String description;

    private String ldapId;

    private String staffId;

    private String lastMode;

    private Long currentGroupId;

    private Integer userType;

    private Long costCenterId;

    private static final long serialVersionUID = 1L;
}