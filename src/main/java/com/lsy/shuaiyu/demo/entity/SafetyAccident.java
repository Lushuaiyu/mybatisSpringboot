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
 * 生产经营单位生产安全责任事故信息
 * </p>
 *
 * @author jobob
 * @since 2019-10-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("SAFETY_ACCIDENT")
public class SafetyAccident implements Serializable {

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
     * 单位主要负责人姓名
     */
    @TableField("UNIT_RESPONSIBLE")
    private String unitResponsible;

    /**
     * 单位主要负责人身份证号码
     */
    @TableField("UNIT_RESPONSIBLE_ID")
    private String unitResponsibleId;

    /**
     * 事故事件
     */
    @TableField("ACCIDENT_EVENT")
    private String accidentEvent;

    /**
     * 事故发生日期
     */
    @TableField("ACCIDENT_DATE")
    private LocalDate accidentDate;

    /**
     * 事故等级
     */
    @TableField("ACCIDENT_LEVEL")
    private String accidentLevel;

    /**
     * 事故简况
     */
    @TableField("ACCIDENT_PROFILE")
    private String accidentProfile;

    /**
     * 死亡人数（单位：个）
     */
    @TableField("NUM_DEATHS")
    private BigDecimal numDeaths;

    /**
     * 重伤人数（单位：个）
     */
    @TableField("SERIOUS_INJURIES_NUM")
    private BigDecimal seriousInjuriesNum;

    /**
     * 轻伤人数（单位：个）
     */
    @TableField("MINOR_INJURIES_NUM")
    private BigDecimal minorInjuriesNum;

    /**
     * 急性工业中毒人数（单位：个）
     */
    @TableField("POISONING_NUM")
    private BigDecimal poisoningNum;

    /**
     * 直接经济损失（单位：万元）
     */
    @TableField("DIRECT_ECONOMI_CLOSS")
    private BigDecimal directEconomiCloss;

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
     * 执法单位
     */
    @TableField("ENFORCEMENT_UNIT")
    private String enforcementUnit;

    /**
     * 执法日期
     */
    @TableField("ENFORCEMENT_DATE")
    private LocalDate enforcementDate;

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
