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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Tag other = (Tag) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getServerId() == null ? other.getServerId() == null : this.getServerId().equals(other.getServerId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getClusterId() == null ? other.getClusterId() == null : this.getClusterId().equals(other.getClusterId()))
            && (this.getClusterRoleId() == null ? other.getClusterRoleId() == null : this.getClusterRoleId().equals(other.getClusterRoleId()))
            && (this.getServerName() == null ? other.getServerName() == null : this.getServerName().equals(other.getServerName()))
            && (this.getClusterName() == null ? other.getClusterName() == null : this.getClusterName().equals(other.getClusterName()))
            && (this.getClusterRoleName() == null ? other.getClusterRoleName() == null : this.getClusterRoleName().equals(other.getClusterRoleName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getServerId() == null) ? 0 : getServerId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        result = prime * result + ((getClusterRoleId() == null) ? 0 : getClusterRoleId().hashCode());
        result = prime * result + ((getServerName() == null) ? 0 : getServerName().hashCode());
        result = prime * result + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        result = prime * result + ((getClusterRoleName() == null) ? 0 : getClusterRoleName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serverId=").append(serverId);
        sb.append(", groupId=").append(groupId);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", clusterId=").append(clusterId);
        sb.append(", clusterRoleId=").append(clusterRoleId);
        sb.append(", serverName=").append(serverName);
        sb.append(", clusterName=").append(clusterName);
        sb.append(", clusterRoleName=").append(clusterRoleName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}