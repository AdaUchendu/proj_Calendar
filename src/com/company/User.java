package com.company;

/**
 * Created by adakuuchendu on 12/5/17.
 */


 interface userInterface {
    String getUserID();
    String getUserFile();
    void setUserFile(String user);
    void setUserID(String iD);

}


 class User implements userInterface{
    String iD;
    String userFile;

    //no-arg constructor
    public User() {
        iD = "00";
        userFile = "C:\\PlanIt\\Users\\00.txt.";
    }

    public void setUserFile(String user) {
        userFile = user;
    }
    public void setUserID(String iD) {
        this.iD = iD;
    }
    public String getUserFile() {
        return userFile;
    }
    public String getUserID() {
        return iD;
    }
}
