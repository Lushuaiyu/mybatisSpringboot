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
 * 骗保信息
 * </p>
 *
 * @author jobob
 * @since 2019-10-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("FRAUD_INSURANCE")
public class FraudInsurance implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private BigDecimal id;

    /**
     * 行政相对人名称
     */
    @TableField("ADM_COUNTERPART")
    private String admCounterpart;

    /**
     * 行政相对人代码_1(统一社会信用代码)
     */
    @TableField("USCC")
    private String uscc;

    /**
     * 行政相对人代码_2(组织机构代码)
     */
    @TableField("ORG_CODE")
    private String orgCode;

    /**
     * 行政相对人代码_3(工商登记码)
     */
    @TableField("REG_NUM")
    private String regNum;

    /**
     * 行政相对人代码_4(税务登记号)
     */
    @TableField("TAX_REG_NUM")
    private String taxRegNum;

    /**
     * 失信严重程度
     */
    @TableField("DISCREDIT_LEVEL")
    private String discreditLevel;

    /**
     * 失信信息使用有效期
     */
    @TableField("DISCREDIT_EXPIRATION_DATE")
    private LocalDate discreditExpirationDate;

    /**
     * 骗取险种
     */
    @TableField("DEFRAUDING")
    private String defrauding;

    /**
     * 骗保金额
     */
    @TableField("DEBT_AMOUNT")
    private BigDecimal debtAmount;

    /**
     * 骗保次数
     */
    @TableField("DEFRAUD")
    private BigDecimal defraud;

    /**
     * 认定日期
     */
    @TableField("IDENTIFY_DATE")
    private LocalDate identifyDate;

    /**
     * 认定机关全称
     */
    @TableField("IDENTIFY_AUTH")
    private String identifyAuth;

    /**
     * 信息源头部门全称
     */
    @TableField("SOURCE_UNIT")
    private String sourceUnit;

    /**
     * 提供日期
     */
    @TableField("PROVIDE_DATE")
    private LocalDate provideDate;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 证件类型
     */
    @TableField("CERT_TYPE")
    private String certType;

    /**
     * 证件号码
     */
    @TableField("CERT_NUM")
    private String certNum;

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
