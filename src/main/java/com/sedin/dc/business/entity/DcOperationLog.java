package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import java.io.Serializable;

public class DcOperationLog extends PersistenceBean implements Serializable {
    private String id;

    private String opType;

    private String opResult;

    private String objectId;

    private String opUserId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
    }

    public String getOpResult() {
        return opResult;
    }

    public void setOpResult(String opResult) {
        this.opResult = opResult == null ? null : opResult.trim();
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public String getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(String opUserId) {
        this.opUserId = opUserId == null ? null : opUserId.trim();
    }
}