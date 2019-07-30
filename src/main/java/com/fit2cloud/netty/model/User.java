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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getAccessToken() == null ? other.getAccessToken() == null : this.getAccessToken().equals(other.getAccessToken()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getAdmin() == null ? other.getAdmin() == null : this.getAdmin().equals(other.getAdmin()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getActiveCode() == null ? other.getActiveCode() == null : this.getActiveCode().equals(other.getActiveCode()))
            && (this.getActiveTimeout() == null ? other.getActiveTimeout() == null : this.getActiveTimeout().equals(other.getActiveTimeout()))
            && (this.getForgetCode() == null ? other.getForgetCode() == null : this.getForgetCode().equals(other.getForgetCode()))
            && (this.getForgetTimeout() == null ? other.getForgetTimeout() == null : this.getForgetTimeout().equals(other.getForgetTimeout()))
            && (this.getLastLogin() == null ? other.getLastLogin() == null : this.getLastLogin().equals(other.getLastLogin()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getLdapId() == null ? other.getLdapId() == null : this.getLdapId().equals(other.getLdapId()))
            && (this.getStaffId() == null ? other.getStaffId() == null : this.getStaffId().equals(other.getStaffId()))
            && (this.getLastMode() == null ? other.getLastMode() == null : this.getLastMode().equals(other.getLastMode()))
            && (this.getCurrentGroupId() == null ? other.getCurrentGroupId() == null : this.getCurrentGroupId().equals(other.getCurrentGroupId()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getCostCenterId() == null ? other.getCostCenterId() == null : this.getCostCenterId().equals(other.getCostCenterId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getAdmin() == null) ? 0 : getAdmin().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getActiveCode() == null) ? 0 : getActiveCode().hashCode());
        result = prime * result + ((getActiveTimeout() == null) ? 0 : getActiveTimeout().hashCode());
        result = prime * result + ((getForgetCode() == null) ? 0 : getForgetCode().hashCode());
        result = prime * result + ((getForgetTimeout() == null) ? 0 : getForgetTimeout().hashCode());
        result = prime * result + ((getLastLogin() == null) ? 0 : getLastLogin().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getLdapId() == null) ? 0 : getLdapId().hashCode());
        result = prime * result + ((getStaffId() == null) ? 0 : getStaffId().hashCode());
        result = prime * result + ((getLastMode() == null) ? 0 : getLastMode().hashCode());
        result = prime * result + ((getCurrentGroupId() == null) ? 0 : getCurrentGroupId().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getCostCenterId() == null) ? 0 : getCostCenterId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", source=").append(source);
        sb.append(", accessToken=").append(accessToken);
        sb.append(", status=").append(status);
        sb.append(", created=").append(created);
        sb.append(", admin=").append(admin);
        sb.append(", company=").append(company);
        sb.append(", phone=").append(phone);
        sb.append(", activeCode=").append(activeCode);
        sb.append(", activeTimeout=").append(activeTimeout);
        sb.append(", forgetCode=").append(forgetCode);
        sb.append(", forgetTimeout=").append(forgetTimeout);
        sb.append(", lastLogin=").append(lastLogin);
        sb.append(", description=").append(description);
        sb.append(", ldapId=").append(ldapId);
        sb.append(", staffId=").append(staffId);
        sb.append(", lastMode=").append(lastMode);
        sb.append(", currentGroupId=").append(currentGroupId);
        sb.append(", userType=").append(userType);
        sb.append(", costCenterId=").append(costCenterId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}