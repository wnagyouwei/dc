package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import java.io.Serializable;

public class DcFileHistoryKey extends PersistenceBean implements Serializable {
    private String id;

    private Integer version;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}