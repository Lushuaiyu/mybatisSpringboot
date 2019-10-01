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
 * 社会法人公积金欠缴信息
 * </p>
 *
 * @author jobob
 * @since 2019-10-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("REP_ACC_FUND")
public class RepAccFund implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private BigDecimal id;

    /**
     * 机构全称(中文）
     */
    @TableField("INSTITUTION_NAME")
    private String institutionName;

    /**
     * 工商注册号
     */
    @TableField("REG_NUM")
    private String regNum;

    /**
     * 统一社会信用代码
     */
    @TableField("USCC")
    private String uscc;

    /**
     * 组织机构代码
     */
    @TableField("ORG_CODE")
    private String orgCode;

    /**
     * 类别
     */
    @TableField("CATEGORY")
    private String category;

    /**
     * 欠缴开始日期
     */
    @TableField("UNDERPAID_START_DATE")
    private String underpaidStartDate;

    /**
     * 欠缴截止日期
     */
    @TableField("UNDERPAID_END_DATE")
    private String underpaidEndDate;

    /**
     * 当期欠缴金额
     */
    @TableField("CUR_OWE_AMOUNT")
    private String curOweAmount;

    /**
     * 累计欠缴金额合计
     */
    @TableField("TOTAL_ACCUMULATED_AMOUNT")
    private String totalAccumulatedAmount;

    /**
     * 是否补缴
     */
    @TableField("WHETHER_TO_PAY")
    private String whetherToPay;

    /**
     * 严重失信程度
     */
    @TableField("DISCREDIT_LEVEL")
    private String discreditLevel;

    /**
     * 失信行为有效期
     */
    @TableField("DISCREDIT_DATE")
    private String discreditDate;

    /**
     * 经办机关全称
     */
    @TableField("PROCESS_AUTH")
    private String processAuth;

    /**
     * 认定日期
     */
    @TableField("IDENTIFY_DATE")
    private String identifyDate;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 欠缴时段
     */
    @TableField("UNDERPAID_PERIOD")
    private String underpaidPeriod;

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
