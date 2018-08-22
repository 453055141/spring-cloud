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
 * @since 2018-08-22
 */
public class Prize extends Model<Prize> {

    private static final long serialVersionUID = 1L;

    /**
     * 奖品ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 奖品名字
     */
    @TableField("prize_name")
    private String prizeName;
    /**
     * 奖品数量
     */
    @TableField("prize_num")
    private Integer prizeNum;
    /**
     * 剩余数量
     */
    @TableField("residue_num")
    private Integer residueNum;
    /**
     * 指定中奖的用户
     */
    @TableField("user_id")
    private String userId;
    /**
     * 中奖概率 n%
     */
    @TableField("prize_prob")
    private Double prizeProb;
    /**
     * 领奖的有效时间
     */
    @TableField("lottery_exp")
    private LocalDateTime lotteryExp;
    /**
     * 奖品状态：0不启用；1启用
     */
    private Boolean status;
    /**
     * 创建时间
     */
    @TableField("creat_time")
    private LocalDateTime creatTime;


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

    public LocalDateTime getLotteryExp() {
        return lotteryExp;
    }

    public void setLotteryExp(LocalDateTime lotteryExp) {
        this.lotteryExp = lotteryExp;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDateTime getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(LocalDateTime creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Prize{" +
        ", id=" + id +
        ", prizeName=" + prizeName +
        ", prizeNum=" + prizeNum +
        ", residueNum=" + residueNum +
        ", userId=" + userId +
        ", prizeProb=" + prizeProb +
        ", lotteryExp=" + lotteryExp +
        ", status=" + status +
        ", creatTime=" + creatTime +
        "}";
    }
}
