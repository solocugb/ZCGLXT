package com.haina.zcglxt.contracts.domain;

import java.util.Date;

public class Contracts {
    private String contracttype;

    private String aggrementnumber;

    private String purchaser;

    private String supplier;

    private String equipmentname;

    private Double totalprice;

    private Date signdate;

    private Date auditdate;

    private String foreigntradenumber;

    private String foreigntradeagent;

    private String contractsignstatus;

    public String getContracttype() {
        return contracttype;
    }

    public void setContracttype(String contracttype) {
        this.contracttype = contracttype == null ? null : contracttype.trim();
    }

    public String getAggrementnumber() {
        return aggrementnumber;
    }

    public void setAggrementnumber(String aggrementnumber) {
        this.aggrementnumber = aggrementnumber == null ? null : aggrementnumber.trim();
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser == null ? null : purchaser.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname == null ? null : equipmentname.trim();
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public Date getSigndate() {
        return signdate;
    }

    public void setSigndate(Date signdate) {
        this.signdate = signdate;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public String getForeigntradenumber() {
        return foreigntradenumber;
    }

    public void setForeigntradenumber(String foreigntradenumber) {
        this.foreigntradenumber = foreigntradenumber == null ? null : foreigntradenumber.trim();
    }

    public String getForeigntradeagent() {
        return foreigntradeagent;
    }

    public void setForeigntradeagent(String foreigntradeagent) {
        this.foreigntradeagent = foreigntradeagent == null ? null : foreigntradeagent.trim();
    }

    public String getContractsignstatus() {
        return contractsignstatus;
    }

    public void setContractsignstatus(String contractsignstatus) {
        this.contractsignstatus = contractsignstatus == null ? null : contractsignstatus.trim();
    }
}