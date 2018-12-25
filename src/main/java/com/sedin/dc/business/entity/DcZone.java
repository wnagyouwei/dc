package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import com.dzy.support.platform.persistence.provider.FieldName;
import com.dzy.support.platform.persistence.provider.TableName;

import java.io.Serializable;

@TableName(name="dc_zone")
public class DcZone extends PersistenceBean implements Serializable {
	
	@FieldName(name="ID")
    private String id;

	@FieldName(name="ZONG_CODE")
    private String zongCode;

	@FieldName(name="ZONG_NAME")
    private String zongName;

	@FieldName(name="ZONG_MAX_SIZE")
    private String zongMaxSize;

	@FieldName(name="ZONE_DESCRIPT")
    private String zoneDescript;

	@FieldName(name="DEL_FLAG")
    private Boolean delFlag;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getZongCode() {
        return zongCode;
    }

    public void setZongCode(String zongCode) {
        this.zongCode = zongCode == null ? null : zongCode.trim();
    }

    public String getZongName() {
        return zongName;
    }

    public void setZongName(String zongName) {
        this.zongName = zongName == null ? null : zongName.trim();
    }

    public String getZongMaxSize() {
        return zongMaxSize;
    }

    public void setZongMaxSize(String zongMaxSize) {
        this.zongMaxSize = zongMaxSize == null ? null : zongMaxSize.trim();
    }

    public String getZoneDescript() {
        return zoneDescript;
    }

    public void setZoneDescript(String zoneDescript) {
        this.zoneDescript = zoneDescript == null ? null : zoneDescript.trim();
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }
}