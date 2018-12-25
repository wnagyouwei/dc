package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import com.dzy.support.platform.persistence.provider.FieldName;
import com.dzy.support.platform.persistence.provider.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName(name="dc_operation_log")
public class DcRecoveryStation extends PersistenceBean implements Serializable {
    
	@FieldName(name="ID")
	private String id;

	@FieldName(name="OBJECT_ID")
    private String objectId;

	@FieldName(name="DELETE_USER_ID")
    private String deleteUserId;

	@FieldName(name="DELETE_TIME")
    private Date deleteTime;

	@FieldName(name="DELETE_REASON")
    private String deleteReason;

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

    public String getDeleteUserId() {
        return deleteUserId;
    }

    public void setDeleteUserId(String deleteUserId) {
        this.deleteUserId = deleteUserId == null ? null : deleteUserId.trim();
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason == null ? null : deleteReason.trim();
    }
}