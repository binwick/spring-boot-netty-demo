package com.fit2cloud.netty.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Tag implements Serializable {
    private Long id;

    private Long serverId;

    private Long groupId;

    private String name;

    private String value;

    private Long clusterId;

    private Long clusterRoleId;

    private String serverName;

    private String clusterName;

    private String clusterRoleName;

    private static final long serialVersionUID = 1L;
}