package fr.avainfo.fistwebsite.managers;

public enum Roles {

    SUCCESSFUL_MALE(true, true, false, true),
    SUCCESSFUL_FEMALE(true, false, true, true),
    HAPPY_WORKER_MALE(true, true, false, false),
    HAPPY_WORKER_FEMALE(true, false, true, false),
    SAD_WORKER(true, false, false, true),
    VERY_DEPRESSIVE(false, false, false, true),
    DEPRESSIVE(false, false, false, false),
    UNDEFINED(false, false, false, false);


    private final boolean job;
    private final boolean wifeName;
    private final boolean husbandName;
    private final boolean children;

    Roles(boolean job, boolean wifeName, boolean husbandName, boolean hasChildren) {
        this.job = job;
        this.wifeName = wifeName;
        this.husbandName = husbandName;
        this.children = hasChildren;
    }

    public boolean[] toArray() {
        return new boolean[]{job, wifeName, husbandName, children};
    }

}










