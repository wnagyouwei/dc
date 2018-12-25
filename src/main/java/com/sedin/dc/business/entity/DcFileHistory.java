package com.sedin.dc.business.entity;

import java.io.Serializable;

import com.dzy.support.platform.persistence.provider.FieldName;
import com.dzy.support.platform.persistence.provider.TableName;

@TableName(name="dc_file_history")
public class DcFileHistory extends DcFileHistoryKey implements Serializable {
    
	@FieldName(name="FILE_NAME")
    private String fileName;

	@FieldName(name="FILE_TYPE")
    private String fileType;

	@FieldName(name="FILE_SIZE")
    private String fileSize;

	@FieldName(name="FS_PATH")
    private String fsPath;

	@FieldName(name="HD_PATH")
    private String hdPath;

	@FieldName(name="CHECKSUM")
    private String checksum;

	@FieldName(name="REMARKS")
    private String remarks;

	@FieldName(name="DEL_FLAG")
    private Boolean delFlag;

    private static final long serialVersionUID = 1L;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize == null ? null : fileSize.trim();
    }

    public String getFsPath() {
        return fsPath;
    }

    public void setFsPath(String fsPath) {
        this.fsPath = fsPath == null ? null : fsPath.trim();
    }

    public String getHdPath() {
        return hdPath;
    }

    public void setHdPath(String hdPath) {
        this.hdPath = hdPath == null ? null : hdPath.trim();
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum == null ? null : checksum.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }
}