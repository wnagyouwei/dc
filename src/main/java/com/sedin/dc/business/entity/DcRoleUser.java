package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import com.dzy.support.platform.persistence.provider.FieldName;
import com.dzy.support.platform.persistence.provider.TableName;

import java.io.Serializable;

@TableName(name="dc_role_user")
public class DcRoleUser extends PersistenceBean implements Serializable {
	
	@FieldName(name="ID")
    private String id;

	@FieldName(name="ROLE_ID")
    private String roleId;

	@FieldName(name="USER_ID")
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