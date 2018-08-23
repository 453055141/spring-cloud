package com.zk.entity.master;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * @since 2018-08-23
 */
@TableName("prize_user")
public class PrizeUser extends Model<PrizeUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 奖品ID
     */
    @TableField("prize_id")
    private Integer prizeId;

    /**
     * 奖品兑换码
     */
    @TableField("cd_key")
    private String cdKey;

    /**
     * 兑换码状态：0未使用；1使用
     */
    private Boolean status;

    /**
     * 获得时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 使用时间
     */
    @TableField("use_time")
    private LocalDateTime useTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPrizeId() {
        return prizeId;
    }

    public void setPrizeId(Integer prizeId) {
        this.prizeId = prizeId;
    }

    public String getCdKey() {
        return cdKey;
    }

    public void setCdKey(String cdKey) {
        this.cdKey = cdKey;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUseTime() {
        return useTime;
    }

    public void setUseTime(LocalDateTime useTime) {
        this.useTime = useTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "PrizeUser{" +
        ", id=" + id +
        ", userId=" + userId +
        ", prizeId=" + prizeId +
        ", cdKey=" + cdKey +
        ", status=" + status +
        ", createTime=" + createTime +
        ", useTime=" + useTime +
        "}";
    }
}
