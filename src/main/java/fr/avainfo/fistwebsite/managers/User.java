package fr.avainfo.fistwebsite.managers;

public class User {
    public int personID;
    public String job;
    public String wifeName;
    public String husbandName;
    public Object children;

    public User(int personID, String job, String wifeName, String husbandName, Object children) {
        this.personID = personID;
        this.job = job;
        this.wifeName = wifeName;
        this.husbandName = husbandName;
        this.children = children;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public String getHusbandName() {
        return husbandName;
    }

    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    public int getChildren() {
        return (int) children;
    }

    public void setChildren(int children) {
        this.children = children;
    }
}
