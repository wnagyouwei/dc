package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import java.io.Serializable;

public class DcRoleUser extends PersistenceBean implements Serializable {
    private String id;

    private String roleId;

    private String userId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}