package com.sedin.dc.business.entity;

import com.dzy.support.platform.persistence.common.PersistenceBean;
import com.dzy.support.platform.persistence.provider.FieldName;
import com.dzy.support.platform.persistence.provider.TableName;

import java.io.Serializable;


@TableName(name="dc_dictionary_value")
public class DictionaryValue extends PersistenceBean implements Serializable {
	
	@FieldName(name="ID")
	private String id;

	@FieldName(name="DATA_TYPE_ID")
    private String dataTypeId;

	@FieldName(name="LABEL")
    private String label;

	@FieldName(name="VALUE")
    private String value;

	@FieldName(name="SORT")
    private String sort;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDataTypeId() {
        return dataTypeId;
    }

    public void setDataTypeId(String dataTypeId) {
        this.dataTypeId = dataTypeId == null ? null : dataTypeId.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }
}