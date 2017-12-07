package com.haina.zcglxt.equipmentdetails.domain;

public class Equipmentdetails {
    private String equipmentname;

    private String equipmentsimplename;

    private String equipmentenglishname;

    private String specification;

    private String modeltype;

    private Integer amount;

    private String measuerunit;

    private Double singleprice;

    private Double expenditure;

    private String equipmentuse;

    private String purchaseway;

    private String nationality;

    private String manufacturer;

    private String equipstatus;

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

    public String getMeasuerunit() {
        return measuerunit;
    }

    public void setMeasuerunit(String measuerunit) {
        this.measuerunit = measuerunit == null ? null : measuerunit.trim();
    }

    public Double getSingleprice() {
        return singleprice;
    }

    public void setSingleprice(Double singleprice) {
        this.singleprice = singleprice;
    }

    public Double getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(Double expenditure) {
        this.expenditure = expenditure;
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

    public String getEquipstatus() {
        return equipstatus;
    }

    public void setEquipstatus(String equipstatus) {
        this.equipstatus = equipstatus == null ? null : equipstatus.trim();
    }
}