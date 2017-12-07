package com.haina.zcglxt.auditlevel.domain;

import java.util.Date;

public class Auditlevel {
    private String auditcontents;

    private Integer levels;

    private String levelstatus;

    private String descriptions;

    private Date updatedate;

    private String appendconditioncontents;

    public String getAuditcontents() {
        return auditcontents;
    }

    public void setAuditcontents(String auditcontents) {
        this.auditcontents = auditcontents == null ? null : auditcontents.trim();
    }

    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    public String getLevelstatus() {
        return levelstatus;
    }

    public void setLevelstatus(String levelstatus) {
        this.levelstatus = levelstatus == null ? null : levelstatus.trim();
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions == null ? null : descriptions.trim();
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getAppendconditioncontents() {
        return appendconditioncontents;
    }

    public void setAppendconditioncontents(String appendconditioncontents) {
        this.appendconditioncontents = appendconditioncontents == null ? null : appendconditioncontents.trim();
    }
}