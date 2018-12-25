package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import java.io.Serializable;

public class DcUser extends PersistenceBean implements Serializable {
    private String id;

    private String userName;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}