package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import com.dzy.support.platform.persistence.provider.FieldName;
import com.dzy.support.platform.persistence.provider.TableName;

import java.io.Serializable;

@TableName(name="dc_operation_log")
public class DcOperationLog extends PersistenceBean implements Serializable {
    
	@FieldName(name="ID")
	private String id;

	@FieldName(name="OP_TYPE")
    private String opType;

	@FieldName(name="OP_RESULT")
    private String opResult;

	@FieldName(name="OBJECT_ID")
    private String objectId;

	@FieldName(name="OP_USER_ID")
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