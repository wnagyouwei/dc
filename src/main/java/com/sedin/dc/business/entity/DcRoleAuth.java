package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import java.io.Serializable;

public class DcRoleAuth extends PersistenceBean implements Serializable {
    private String id;

    private String roleId;

    private String oAuthorityId;

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

    public String getoAuthorityId() {
        return oAuthorityId;
    }

    public void setoAuthorityId(String oAuthorityId) {
        this.oAuthorityId = oAuthorityId == null ? null : oAuthorityId.trim();
    }
}