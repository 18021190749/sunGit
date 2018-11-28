package com.study.test.abstractfactory.entity;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 9:37
 */
public class User {

    /**
     * id : 1
     * userName : test
     * allName : 测试
     * passWord : 123456
     */

    private String id;
    private String userName;
    private String allName;
    private String passWord;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAllName() {
        return allName;
    }

    public void setAllName(String allName) {
        this.allName = allName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
