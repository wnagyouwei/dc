package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import com.dzy.support.platform.persistence.provider.FieldName;
import com.dzy.support.platform.persistence.provider.TableName;

import java.io.Serializable;

@TableName(name="dc_object")
public class DcObject extends PersistenceBean implements Serializable {
	
	@FieldName(name="ID")
    private String id;

	@FieldName(name="TYPE")
    private String type;

	@FieldName(name="OBJECT_ID")
    private String objectId;

	@FieldName(name="PID")
    private String pid;

	@FieldName(name="KEYWORD")
    private String keyword;

	@FieldName(name="STATUS")
    private String status;

	@FieldName(name="PROP_DATAS")
    private String propDatas;

	@FieldName(name="VERSION")
    private Integer version;

	@FieldName(name="DEL_FLAG")
    private Boolean delFlag;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPropDatas() {
        return propDatas;
    }

    public void setPropDatas(String propDatas) {
        this.propDatas = propDatas == null ? null : propDatas.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }
}