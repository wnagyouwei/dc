package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import com.dzy.support.platform.persistence.provider.FieldName;
import com.dzy.support.platform.persistence.provider.TableName;

import java.io.Serializable;

@TableName(name="dc_object_role")
public class DcObjectRole extends PersistenceBean implements Serializable {
    
	@FieldName(name="ID")
	private String id;

	@FieldName(name="OBJECT_ID")
    private String objectId;

	@FieldName(name="ROLE_ID")
    private String roleId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }
}