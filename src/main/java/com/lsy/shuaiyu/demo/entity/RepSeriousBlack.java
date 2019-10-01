package com.lsy.shuaiyu.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 社会法人严重失信黑名单信息
 * </p>
 *
 * @author jobob
 * @since 2019-10-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("REP_SERIOUS_BLACK")
public class RepSeriousBlack implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private BigDecimal id;

    /**
     * 统一社会信用代码
     */
    @TableField("USCC")
    private String uscc;

    /**
     * 机构全称（中文）
     */
    @TableField("INSTITUTION_NAME")
    private String institutionName;

    /**
     * 组织机构代码
     */
    @TableField("ORG_CODE")
    private String orgCode;

    /**
     * 认定依据
     */
    @TableField("IDENTIFY_BASIS")
    private String identifyBasis;

    /**
     * 认定部门（单位）全称
     */
    @TableField("IDENTIFY_AUTH")
    private String identifyAuth;

    /**
     * 认定文号
     */
    @TableField("IDENTIFY_NUM")
    private String identifyNum;

    /**
     * 注册地址
     */
    @TableField("REGISTERED_ADDRESS")
    private String registeredAddress;

    /**
     * 法定代表人（或单位负责人）
     */
    @TableField("LEGAL_REP")
    private String legalRep;

    /**
     * 法定代表人（或单位负责人）身份证件类型
     */
    @TableField("LEGAL_REP_CERT_TYPE")
    private String legalRepCertType;

    /**
     * 法定代表人（或单位负责人）身份证件号码
     */
    @TableField("LEGAL_REP_CERT_NUM")
    private String legalRepCertNum;

    /**
     * 违法失信行为事实
     */
    @TableField("ILLEGAL_BEHAVIOR")
    private String illegalBehavior;

    /**
     * 行政处理处罚或法院判决决定的主要内容
     */
    @TableField("MAIN_CONTENT")
    private String mainContent;

    /**
     * 确认严重失信日期
     */
    @TableField("CON_VERY_DISCREDIT_DATE")
    private LocalDate conVeryDiscreditDate;

    /**
     * 公示截止日期
     */
    @TableField("PUBLIC_DEADLINE")
    private LocalDate publicDeadline;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 信息源头部门全称
     */
    @TableField("SOURCE_UNIT")
    private String sourceUnit;

    /**
     * 提供单位全称
     */
    @TableField("PROVIDE_UNIT_NAME")
    private String provideUnitName;

    /**
     * 提供日期
     */
    @TableField("PROVIDE_DATE")
    private LocalDate provideDate;

    /**
     * 归集部门
     */
    @TableField("COLLECTION_DEPARTMENT")
    private String collectionDepartment;

    /**
     * 前置库数据批次号
     */
    @TableField("SOURCE_RECORD_ID")
    private String sourceRecordId;

    /**
     * 前置库数据主键
     */
    @TableField("SOURCE_ID")
    private String sourceId;


}
