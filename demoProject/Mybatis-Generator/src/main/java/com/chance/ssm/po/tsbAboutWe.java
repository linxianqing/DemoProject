package com.chance.ssm.po;

public class tsbAboutWe {
    private Integer aboutWeId;

    private String title;

    private String companyBrief;

    private String teamBrief;

    private String wePhone;

    private String type;

    private String weImg1;

    public Integer getAboutWeId() {
        return aboutWeId;
    }

    public void setAboutWeId(Integer aboutWeId) {
        this.aboutWeId = aboutWeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCompanyBrief() {
        return companyBrief;
    }

    public void setCompanyBrief(String companyBrief) {
        this.companyBrief = companyBrief == null ? null : companyBrief.trim();
    }

    public String getTeamBrief() {
        return teamBrief;
    }

    public void setTeamBrief(String teamBrief) {
        this.teamBrief = teamBrief == null ? null : teamBrief.trim();
    }

    public String getWePhone() {
        return wePhone;
    }

    public void setWePhone(String wePhone) {
        this.wePhone = wePhone == null ? null : wePhone.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getWeImg1() {
        return weImg1;
    }

    public void setWeImg1(String weImg1) {
        this.weImg1 = weImg1 == null ? null : weImg1.trim();
    }
}