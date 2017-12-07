package com.haina.zcglxt.dictionaries.domain;

public class Dictionaries {
    private String deprecitionpattern;

    private String nationality;

    private String nationstandardcode;

    private String measuerunit;

    private String equipmentuse;

    private String equipmentname;

    private String offices;

    public String getDeprecitionpattern() {
        return deprecitionpattern;
    }

    public void setDeprecitionpattern(String deprecitionpattern) {
        this.deprecitionpattern = deprecitionpattern == null ? null : deprecitionpattern.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
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

    public String getEquipmentuse() {
        return equipmentuse;
    }

    public void setEquipmentuse(String equipmentuse) {
        this.equipmentuse = equipmentuse == null ? null : equipmentuse.trim();
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname == null ? null : equipmentname.trim();
    }

    public String getOffices() {
        return offices;
    }

    public void setOffices(String offices) {
        this.offices = offices == null ? null : offices.trim();
    }
}