package com.sedin.dc.business.entity;

import java.io.Serializable;

public class DcFileHistory extends DcFileHistoryKey implements Serializable {
    private String fileName;

    private String fileType;

    private String fileSize;

    private String fsPath;

    private String hdPath;

    private String checksum;

    private String remarks;

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