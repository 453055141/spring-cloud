package com.zk.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @Author zengkai
 * @Date 2018/8/25 15:15
 */
@Data
  //lombok注解，会自动生成setter/getter,需要引入lombok的包才能使用。
//indexName索引名称 可以理解为数据库名 必须为小写 不然会报org.elasticsearch.indices.InvalidIndexNameException异常
//type类型 可以理解为表名
@Document(indexName = "members", type = "doc", refreshInterval = "0s")
public class User implements Serializable {
    /**
     * 主键ID
     */
    @Id
    private Integer id;

    /**
     * 登录用户名
     */
    private String login_name;

    /**
     * 登录密码
     */
    private String login_password;

    /**
     * 会员名字
     */
    private String user_name;

    /**
     * 电话
     */
    private String phone;

    /**
     * 身份证号码
     */
    private String id_card_no;

    /**
     * 1是男 0是女
     */
    private Boolean sex;

    /**
     * 创建时间
     */
    private Date registration_time;

    /**
     * 注销时间
     */
    private Date cancel_time;

    /**
     * 更新时间
     */
    private Date update_time;

}
