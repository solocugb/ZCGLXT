package com.haina.zcglxt.audits.domain;

import java.util.Date;

public class Audits {
    private String auditcontents;

    private Integer auditlevel;

    private String auditserialnum;

    private String appendconditions;

    private Integer appendmaxlevel;

    private Date updatedate;

    public String getAuditcontents() {
        return auditcontents;
    }

    public void setAuditcontents(String auditcontents) {
        this.auditcontents = auditcontents == null ? null : auditcontents.trim();
    }

    public Integer getAuditlevel() {
        return auditlevel;
    }

    public void setAuditlevel(Integer auditlevel) {
        this.auditlevel = auditlevel;
    }

    public String getAuditserialnum() {
        return auditserialnum;
    }

    public void setAuditserialnum(String auditserialnum) {
        this.auditserialnum = auditserialnum == null ? null : auditserialnum.trim();
    }

    public String getAppendconditions() {
        return appendconditions;
    }

    public void setAppendconditions(String appendconditions) {
        this.appendconditions = appendconditions == null ? null : appendconditions.trim();
    }

    public Integer getAppendmaxlevel() {
        return appendmaxlevel;
    }

    public void setAppendmaxlevel(Integer appendmaxlevel) {
        this.appendmaxlevel = appendmaxlevel;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}