package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import java.io.Serializable;

public class DcDirectory extends PersistenceBean implements Serializable {
    private String id;

    private String fdType;

    private String fdName;

    private String fdPath;

    private Long fdLevel;

    private String fdMaxSize;

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