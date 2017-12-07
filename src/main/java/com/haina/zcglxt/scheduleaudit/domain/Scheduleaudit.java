package com.haina.zcglxt.scheduleaudit.domain;

import java.util.Date;

public class Scheduleaudit {
    private String schedulenumber;

    private String equipmentname;

    private String equipmentsimplename;

    private String equipmentenglishname;

    private String specification;

    private String modeltype;

    private Integer amount;

    private Double singleprice;

    private Double totalprice;

    private Double expenditure;

    private String measuerunit;

    private Double predictprice;

    private String capitalsource;

    private String equipmentuse;

    private String purchaseway;

    private String nationality;

    private String manufacturer;

    private String applyoffice;

    private String applicant;

    private Date applydate;

    private String auditor;

    private Date auditdate;

    private String auditresult;

    private String auditstatus;

    public String getSchedulenumber() {
        return schedulenumber;
    }

    public void setSchedulenumber(String schedulenumber) {
        this.schedulenumber = schedulenumber == null ? null : schedulenumber.trim();
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname == null ? null : equipmentname.trim();
    }

    public String getEquipmentsimplename() {
        return equipmentsimplename;
    }

    public void setEquipmentsimplename(String equipmentsimplename) {
        this.equipmentsimplename = equipmentsimplename == null ? null : equipmentsimplename.trim();
    }

    public String getEquipmentenglishname() {
        return equipmentenglishname;
    }

    public void setEquipmentenglishname(String equipmentenglishname) {
        this.equipmentenglishname = equipmentenglishname == null ? null : equipmentenglishname.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getModeltype() {
        return modeltype;
    }

    public void setModeltype(String modeltype) {
        this.modeltype = modeltype == null ? null : modeltype.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getSingleprice() {
        return singleprice;
    }

    public void setSingleprice(Double singleprice) {
        this.singleprice = singleprice;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public Double getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(Double expenditure) {
        this.expenditure = expenditure;
    }

    public String getMeasuerunit() {
        return measuerunit;
    }

    public void setMeasuerunit(String measuerunit) {
        this.measuerunit = measuerunit == null ? null : measuerunit.trim();
    }

    public Double getPredictprice() {
        return predictprice;
    }

    public void setPredictprice(Double predictprice) {
        this.predictprice = predictprice;
    }

    public String getCapitalsource() {
        return capitalsource;
    }

    public void setCapitalsource(String capitalsource) {
        this.capitalsource = capitalsource == null ? null : capitalsource.trim();
    }

    public String getEquipmentuse() {
        return equipmentuse;
    }

    public void setEquipmentuse(String equipmentuse) {
        this.equipmentuse = equipmentuse == null ? null : equipmentuse.trim();
    }

    public String getPurchaseway() {
        return purchaseway;
    }

    public void setPurchaseway(String purchaseway) {
        this.purchaseway = purchaseway == null ? null : purchaseway.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getApplyoffice() {
        return applyoffice;
    }

    public void setApplyoffice(String applyoffice) {
        this.applyoffice = applyoffice == null ? null : applyoffice.trim();
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public String getAuditresult() {
        return auditresult;
    }

    public void setAuditresult(String auditresult) {
        this.auditresult = auditresult == null ? null : auditresult.trim();
    }

    public String getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus == null ? null : auditstatus.trim();
    }
}