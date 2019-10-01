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
 * 社会法人欠税公告信息
 * </p>
 *
 * @author jobob
 * @since 2019-10-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("REP_TAX_ARREARS")
public class RepTaxArrears implements Serializable {

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
     * 欠税统计开始日期
     */
    @TableField("TAX_STAT_START_DATE")
    private LocalDate taxStatStartDate;

    /**
     * 欠税统计截止日期
     */
    @TableField("TAX_STAT_END_DATE")
    private LocalDate taxStatEndDate;

    /**
     * 欠税税种
     */
    @TableField("TAX_OWED_TYPE")
    private String taxOwedType;

    /**
     * 当期欠税金额（元）
     */
    @TableField("CUR_TAX_AMOUNT")
    private BigDecimal curTaxAmount;

    /**
     * 是否补缴
     */
    @TableField("WHETHER_TO_PAY")
    private String whetherToPay;

    /**
     * 失信严重程度
     */
    @TableField("DISCREDIT_LEVEL")
    private String discreditLevel;

    /**
     * 失信行为有效期
     */
    @TableField("DISCREDIT_DATE")
    private LocalDate discreditDate;

    /**
     * 征缴机关全称
     */
    @TableField("COLL_AUTH")
    private String collAuth;

    /**
     * 认定日期
     */
    @TableField("IDENTIFY_DATE")
    private LocalDate identifyDate;

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
