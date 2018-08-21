package com.zk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zengkai
 * @since 2018-08-21
 */
public class Members extends Model<Members> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 登录用户名
     */
    @TableField("login_name")
    private String loginName;
    /**
     * 登录密码
     */
    @TableField("login_password")
    private String loginPassword;
    /**
     * 会员名字
     */
    @TableField("user_name")
    private String userName;
    /**
     * 电话
     */
    private String phone;
    /**
     * 身份证号码
     */
    @TableField("id_card_no")
    private String idCardNo;
    /**
     * 1是男 0是女
     */
    private Boolean sex;
    /**
     * 创建时间
     */
    @TableField("registration_time")
    private LocalDateTime registrationTime;
    /**
     * 注销时间
     */
    @TableField("cancel_time")
    private LocalDateTime cancelTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public LocalDateTime getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(LocalDateTime registrationTime) {
        this.registrationTime = registrationTime;
    }

    public LocalDateTime getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(LocalDateTime cancelTime) {
        this.cancelTime = cancelTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Members{" +
        ", id=" + id +
        ", loginName=" + loginName +
        ", loginPassword=" + loginPassword +
        ", userName=" + userName +
        ", phone=" + phone +
        ", idCardNo=" + idCardNo +
        ", sex=" + sex +
        ", registrationTime=" + registrationTime +
        ", cancelTime=" + cancelTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
