package com.jnshu.backendSystem.pojo;

public class User {
    private Long id;

    private String name;

    private String password;

    private String salt;

    private String phoneNum;

    private String headImage;

    private Long gmtCreate;

    private Long gmtUpdate;

    private String createBy;

    private String updateBy;

    public User(Long id, String name, String password, String salt, String phoneNum, String headImage, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.salt = salt;
        this.phoneNum = phoneNum;
        this.headImage = headImage;
        this.gmtCreate = gmtCreate;
        this.gmtUpdate = gmtUpdate;
        this.createBy = createBy;
        this.updateBy = updateBy;
    }

    public User (int number1){
       if (number1 == 1 ){
           this.id =1L;
           this.name = "张三";
           this.password = "123456";
           this.salt = "12345678";
           this.phoneNum = "135337288757";
           this.headImage = "111111111";
           this.gmtCreate = System.currentTimeMillis();
           this.gmtUpdate = System.currentTimeMillis();
           this.createBy = "admin";
           this.updateBy = "admin";
       } else if (number1 == 2 ){
            this.id =2L;
            this.name = "李四";
            this.password = "123456";
            this.salt = "asasasada";
            this.phoneNum = "13553055991";
            this.headImage = "222222222";
            this.gmtCreate = System.currentTimeMillis();
            this.gmtUpdate = System.currentTimeMillis();
            this.createBy = "RNG";
            this.updateBy = "RNG";
        }else if ( number1 == 3) {
           this.id =1L;
           this.name = "卓越";
           this.password = "123456";
           this.salt = "qwzdjicw";
           this.phoneNum = "15219840242";
           this.headImage = "333333333";
           this.gmtCreate = System.currentTimeMillis();
           this.gmtUpdate = System.currentTimeMillis();
           this.createBy = "IG";
           this.updateBy = "IG";
       }else if ( number1 == 4 ){
           this.id =1L;
           this.name = "亚马逊";
           this.password = "123456";
           this.salt = "12345678";
           this.phoneNum = "135337288757";
           this.headImage = "111111111";
           this.gmtCreate = System.currentTimeMillis();
           this.gmtUpdate = System.currentTimeMillis();
           this.createBy = "OMG";
           this.updateBy = "OMG";

        }

    }




    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage == null ? null : headImage.trim();
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Long gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }


}