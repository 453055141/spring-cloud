package com.zk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zengkai
 * @since 2018-08-21
 */
@TableName("d_user_login")
public class DUserLogin extends Model<DUserLogin> {

    private static final long serialVersionUID = 1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户编号
     */
    private Long uid;
    /**
     * 账号
     */
    private String account;
    private String name;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 手机类型
     */
    private Integer type;
    /**
     * 等级
     */
    private Integer level;
    /**
     * 元宝
     */
    private Long money;
    /**
     * 当前钻石
     */
    private Integer diamond;
    /**
     * 紫水晶数量
     */
    private Integer purple;
    /**
     * 绿水晶数量
     */
    private Integer green;
    /**
     * 积分
     */
    private Integer score;
    /**
     * 累计充值钻石
     */
    private Integer totalDiamond;
    /**
     * 时间
     */
    private LocalDateTime time;
    /**
     * 扩展附件
     */
    private String annex;
    /**
     * 渠道号
     */
    private String channel;
    /**
     * 设备id
     */
    private String device;
    private Integer serverId;
    private String ip;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Integer getDiamond() {
        return diamond;
    }

    public void setDiamond(Integer diamond) {
        this.diamond = diamond;
    }

    public Integer getPurple() {
        return purple;
    }

    public void setPurple(Integer purple) {
        this.purple = purple;
    }

    public Integer getGreen() {
        return green;
    }

    public void setGreen(Integer green) {
        this.green = green;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTotalDiamond() {
        return totalDiamond;
    }

    public void setTotalDiamond(Integer totalDiamond) {
        this.totalDiamond = totalDiamond;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "DUserLogin{" +
        ", id=" + id +
        ", uid=" + uid +
        ", account=" + account +
        ", name=" + name +
        ", sex=" + sex +
        ", type=" + type +
        ", level=" + level +
        ", money=" + money +
        ", diamond=" + diamond +
        ", purple=" + purple +
        ", green=" + green +
        ", score=" + score +
        ", totalDiamond=" + totalDiamond +
        ", time=" + time +
        ", annex=" + annex +
        ", channel=" + channel +
        ", device=" + device +
        ", serverId=" + serverId +
        ", ip=" + ip +
        "}";
    }
}
