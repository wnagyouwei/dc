package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import java.io.Serializable;
import java.util.Date;

public class DcRecoveryStation extends PersistenceBean implements Serializable {
    private String id;

    private String objectId;

    private String deleteUserId;

    private Date deleteTime;

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