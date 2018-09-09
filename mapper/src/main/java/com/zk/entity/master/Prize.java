package com.zk.entity.master;

import java.util.Date;

public class Prize {
    private Integer id;

    private String prizeName;

    private Integer prizeNum;

    private Integer residueNum;

    private String userId;

    private Double prizeProb;

    private Date lotteryExp;

    private Boolean status;

    private Date creatTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public Integer getPrizeNum() {
        return prizeNum;
    }

    public void setPrizeNum(Integer prizeNum) {
        this.prizeNum = prizeNum;
    }

    public Integer getResidueNum() {
        return residueNum;
    }

    public void setResidueNum(Integer residueNum) {
        this.residueNum = residueNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getPrizeProb() {
        return prizeProb;
    }

    public void setPrizeProb(Double prizeProb) {
        this.prizeProb = prizeProb;
    }

    public Date getLotteryExp() {
        return lotteryExp;
    }

    public void setLotteryExp(Date lotteryExp) {
        this.lotteryExp = lotteryExp;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}