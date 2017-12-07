package com.haina.zcglxt.equipmentconsume.domain;

import java.util.Date;

public class Equipmentconsume {
    private String storageincode;

    private Date storagedate;

    private String equipmentname;

    private String equipcode;

    private String modeltype;

    private String specification;

    private Double singleprice;

    private String nationality;

    private String supplier;

    private String equipstatus;

    private String consumeoffice;

    private String keepplace;

    private Integer useyearslimit;

    private String euquipkeeper;

    public String getStorageincode() {
        return storageincode;
    }

    public void setStorageincode(String storageincode) {
        this.storageincode = storageincode == null ? null : storageincode.trim();
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname == null ? null : equipmentname.trim();
    }

    public String getEquipcode() {
        return equipcode;
    }

    public void setEquipcode(String equipcode) {
        this.equipcode = equipcode == null ? null : equipcode.trim();
    }

    public String getModeltype() {
        return modeltype;
    }

    public void setModeltype(String modeltype) {
        this.modeltype = modeltype == null ? null : modeltype.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public Double getSingleprice() {
        return singleprice;
    }

    public void setSingleprice(Double singleprice) {
        this.singleprice = singleprice;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getEquipstatus() {
        return equipstatus;
    }

    public void setEquipstatus(String equipstatus) {
        this.equipstatus = equipstatus == null ? null : equipstatus.trim();
    }

    public String getConsumeoffice() {
        return consumeoffice;
    }

    public void setConsumeoffice(String consumeoffice) {
        this.consumeoffice = consumeoffice == null ? null : consumeoffice.trim();
    }

    public String getKeepplace() {
        return keepplace;
    }

    public void setKeepplace(String keepplace) {
        this.keepplace = keepplace == null ? null : keepplace.trim();
    }

    public Integer getUseyearslimit() {
        return useyearslimit;
    }

    public void setUseyearslimit(Integer useyearslimit) {
        this.useyearslimit = useyearslimit;
    }

    public String getEuquipkeeper() {
        return euquipkeeper;
    }

    public void setEuquipkeeper(String euquipkeeper) {
        this.euquipkeeper = euquipkeeper == null ? null : euquipkeeper.trim();
    }
}