package com.haina.zcglxt.receipts.domain;

import java.util.Date;

public class Receipts {
    private String equipmentname;

    private String equipmentsimplename;

    private String equipmentenglishname;

    private String nationstandardcode;

    private String measuerunit;

    private Double singleprice;

    private Integer amount;

    private String aggrementnumber;

    private String specification;

    private String modeltype;

    private String maintainmanufacture;

    private String productregistcertificate;

    private String equipmentmanufacturingnum;

    private Date equipmentmanufacturingdate;

    private String manageregist;

    private String manufacturecountry;

    private String nationality;

    private String inlandagent;

    private String foreigntradeagent;

    private String dealerbankaccount;

    private String agentbankaccount;

    private String purchaseway;

    private String capitalsource;

    private String officeuse;

    private String acceptor;

    private Date acceptdate;

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

    public String getNationstandardcode() {
        return nationstandardcode;
    }

    public void setNationstandardcode(String nationstandardcode) {
        this.nationstandardcode = nationstandardcode == null ? null : nationstandardcode.trim();
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getAggrementnumber() {
        return aggrementnumber;
    }

    public void setAggrementnumber(String aggrementnumber) {
        this.aggrementnumber = aggrementnumber == null ? null : aggrementnumber.trim();
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

    public String getMaintainmanufacture() {
        return maintainmanufacture;
    }

    public void setMaintainmanufacture(String maintainmanufacture) {
        this.maintainmanufacture = maintainmanufacture == null ? null : maintainmanufacture.trim();
    }

    public String getProductregistcertificate() {
        return productregistcertificate;
    }

    public void setProductregistcertificate(String productregistcertificate) {
        this.productregistcertificate = productregistcertificate == null ? null : productregistcertificate.trim();
    }

    public String getEquipmentmanufacturingnum() {
        return equipmentmanufacturingnum;
    }

    public void setEquipmentmanufacturingnum(String equipmentmanufacturingnum) {
        this.equipmentmanufacturingnum = equipmentmanufacturingnum == null ? null : equipmentmanufacturingnum.trim();
    }

    public Date getEquipmentmanufacturingdate() {
        return equipmentmanufacturingdate;
    }

    public void setEquipmentmanufacturingdate(Date equipmentmanufacturingdate) {
        this.equipmentmanufacturingdate = equipmentmanufacturingdate;
    }

    public String getManageregist() {
        return manageregist;
    }

    public void setManageregist(String manageregist) {
        this.manageregist = manageregist == null ? null : manageregist.trim();
    }

    public String getManufacturecountry() {
        return manufacturecountry;
    }

    public void setManufacturecountry(String manufacturecountry) {
        this.manufacturecountry = manufacturecountry == null ? null : manufacturecountry.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getInlandagent() {
        return inlandagent;
    }

    public void setInlandagent(String inlandagent) {
        this.inlandagent = inlandagent == null ? null : inlandagent.trim();
    }

    public String getForeigntradeagent() {
        return foreigntradeagent;
    }

    public void setForeigntradeagent(String foreigntradeagent) {
        this.foreigntradeagent = foreigntradeagent == null ? null : foreigntradeagent.trim();
    }

    public String getDealerbankaccount() {
        return dealerbankaccount;
    }

    public void setDealerbankaccount(String dealerbankaccount) {
        this.dealerbankaccount = dealerbankaccount == null ? null : dealerbankaccount.trim();
    }

    public String getAgentbankaccount() {
        return agentbankaccount;
    }

    public void setAgentbankaccount(String agentbankaccount) {
        this.agentbankaccount = agentbankaccount == null ? null : agentbankaccount.trim();
    }

    public String getPurchaseway() {
        return purchaseway;
    }

    public void setPurchaseway(String purchaseway) {
        this.purchaseway = purchaseway == null ? null : purchaseway.trim();
    }

    public String getCapitalsource() {
        return capitalsource;
    }

    public void setCapitalsource(String capitalsource) {
        this.capitalsource = capitalsource == null ? null : capitalsource.trim();
    }

    public String getOfficeuse() {
        return officeuse;
    }

    public void setOfficeuse(String officeuse) {
        this.officeuse = officeuse == null ? null : officeuse.trim();
    }

    public String getAcceptor() {
        return acceptor;
    }

    public void setAcceptor(String acceptor) {
        this.acceptor = acceptor == null ? null : acceptor.trim();
    }

    public Date getAcceptdate() {
        return acceptdate;
    }

    public void setAcceptdate(Date acceptdate) {
        this.acceptdate = acceptdate;
    }
}