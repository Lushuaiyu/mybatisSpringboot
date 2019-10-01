package com.lsy.shuaiyu.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 非正常户认定
 * </p>
 *
 * @author jobob
 * @since 2019-10-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ABNORMAL_HOUSEHOLD")
public class AbnormalHousehold implements Serializable {

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
     * 税务管理码
     */
    @TableField("TAX_MANAGEMENT_CODE")
    private String taxManagementCode;

    /**
     * 信息提供部门
     */
    @TableField("INFO_PROVIDE_DEPT")
    private String infoProvideDept;

    /**
     * 纳税人状态
     */
    @TableField("TAXPAYER_STATUS")
    private String taxpayerStatus;

    /**
     * 法定代表人
     */
    @TableField("LEGAL_REP")
    private String legalRep;

    /**
     * 法定代表人证件名称
     */
    @TableField("LEGAL_REP_CERT_TYPE")
    private String legalRepCertType;

    /**
     * 法定代表人证件号码
     */
    @TableField("LEGAL_REP_CERT_NUM")
    private String legalRepCertNum;

    /**
     * 登记注册类型
     */
    @TableField("REG_TYPE")
    private String regType;

    /**
     * 注册地址
     */
    @TableField("REG_ADDRESS")
    private String regAddress;

    /**
     * 认定日期
     */
    @TableField("IDENTIFY_DATE")
    private String identifyDate;

    /**
     * 数据时点
     */
    @TableField("DATA_POINT")
    private String dataPoint;

    /**
     * 应用年限
     */
    @TableField("APPLICATION_PERIOD")
    private String applicationPeriod;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private String createTime;

    /**
     * 管理机构
     */
    @TableField("MANAGE_AGENCY")
    private String manageAgency;

    /**
     * 纳税人识别号
     */
    @TableField("TAXPAYER_ID_NUM")
    private String taxpayerIdNum;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

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
