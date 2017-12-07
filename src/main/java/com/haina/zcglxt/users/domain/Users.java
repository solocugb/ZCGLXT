package com.haina.zcglxt.users.domain;

public class Users {
    private String username;

    private String password;

    private String offices;

    private String realname;

    private String userstatus;

    private String permissionlist;

    private String auditlist;

    private String characters;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getOffices() {
        return offices;
    }

    public void setOffices(String offices) {
        this.offices = offices == null ? null : offices.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus == null ? null : userstatus.trim();
    }

    public String getPermissionlist() {
        return permissionlist;
    }

    public void setPermissionlist(String permissionlist) {
        this.permissionlist = permissionlist == null ? null : permissionlist.trim();
    }

    public String getAuditlist() {
        return auditlist;
    }

    public void setAuditlist(String auditlist) {
        this.auditlist = auditlist == null ? null : auditlist.trim();
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters == null ? null : characters.trim();
    }
}