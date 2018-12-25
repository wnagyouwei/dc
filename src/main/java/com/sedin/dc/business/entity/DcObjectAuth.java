package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import java.io.Serializable;

public class DcObjectAuth extends PersistenceBean implements Serializable {
    private String id;

    private String objectId;

    private String oAuthorityId;

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

    public String getoAuthorityId() {
        return oAuthorityId;
    }

    public void setoAuthorityId(String oAuthorityId) {
        this.oAuthorityId = oAuthorityId == null ? null : oAuthorityId.trim();
    }
}