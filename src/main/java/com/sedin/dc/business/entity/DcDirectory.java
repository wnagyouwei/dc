package com.sedin.dc.business.entity;

import java.io.Serializable;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import com.dzy.support.platform.persistence.provider.FieldName;
import com.dzy.support.platform.persistence.provider.TableName;

@TableName(name="dc_directory")
public class DcDirectory extends PersistenceBean implements Serializable {
    
	@FieldName(name="ID")
	private String id;

	@FieldName(name="FD_TYPE")
    private String fdType;

	@FieldName(name="FD_NAME")
    private String fdName;

	@FieldName(name="FD_PATH")
    private String fdPath;

	@FieldName(name="FD_LEVEL")
    private Long fdLevel;

	@FieldName(name="FD_MAX_SIZE")
    private String fdMaxSize;

	@FieldName(name="DEL_FLAG")
    private Boolean delFlag;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFdType() {
        return fdType;
    }

    public void setFdType(String fdType) {
        this.fdType = fdType == null ? null : fdType.trim();
    }

    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName == null ? null : fdName.trim();
    }

    public String getFdPath() {
        return fdPath;
    }

    public void setFdPath(String fdPath) {
        this.fdPath = fdPath == null ? null : fdPath.trim();
    }

    public Long getFdLevel() {
        return fdLevel;
    }

    public void setFdLevel(Long fdLevel) {
        this.fdLevel = fdLevel;
    }

    public String getFdMaxSize() {
        return fdMaxSize;
    }

    public void setFdMaxSize(String fdMaxSize) {
        this.fdMaxSize = fdMaxSize == null ? null : fdMaxSize.trim();
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }
}