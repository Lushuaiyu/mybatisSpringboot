package com.lsy.shuaiyu.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 行政处罚信息
 * </p>
 *
 * @author jobob
 * @since 2019-10-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ADM_PENALTY")
public class AdmPenalty implements Serializable {

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
     * 行政相对人代码_2(工商注册号)
     */
    @TableField("REG_NUM")
    private String regNum;

    /**
     * 行政相对人代码_3(组织机构代码)
     */
    @TableField("ORG_CODE")
    private String orgCode;

    /**
     * 行政相对人代码_4(税务登记号)
     */
    @TableField("TAX_REG_NUM")
    private String taxRegNum;

    /**
     * 行政相对人代码_5(事业单位证书号)
     */
    @TableField("PUBLIC_INST_NUM")
    private String publicInstNum;

    /**
     * 行政相对人代码_6(社会组织登记证号)
     */
    @TableField("ORG_NUM")
    private String orgNum;

    /**
     * 法定代表人
     */
    @TableField("LEGAL_REP")
    private String legalRep;

    /**
     * 法定代表人证件号码
     */
    @TableField("LEGAL_REP_CERT_NUM")
    private String legalRepCertNum;

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
     * 行政处罚决定书文号
     */
    @TableField("ADM_PENALTY_DECIDE_NUM")
    private String admPenaltyDecideNum;

    /**
     * 违法行为类型
     */
    @TableField("ILLEGAL_ACT_TYPE")
    private String illegalActType;

    /**
     * 违法事实
     */
    @TableField("ILLEGAL_FACTS")
    private String illegalFacts;

    /**
     * 处罚依据
     */
    @TableField("PUNISHMENT_BASIS")
    private String punishmentBasis;

    /**
     * 处罚类别
     */
    @TableField("PUNISHMENT_CATEGORY")
    private String punishmentCategory;

    /**
     * 处罚内容
     */
    @TableField("PUNISHMENT_CONTENT")
    private String punishmentContent;

    /**
     * 罚款金额（万元）
     */
    @TableField("PENALTY")
    private BigDecimal penalty;

    /**
     * 没收违法所得、没收非法财物的金额（万元）
     */
    @TableField("ILLEGAL_INCOME")
    private BigDecimal illegalIncome;

    /**
     * 暂扣或吊销证照名称及编号
     */
    @TableField("LICENSE_NAME_NUM")
    private String licenseNameNum;

    /**
     * 处罚决定日期
     */
    @TableField("PUNISHMENT_DEC_DATE")
    private LocalDate punishmentDecDate;

    /**
     * 处罚有效期
     */
    @TableField("PUNISHMENT_VAILD_DATE")
    private LocalDate punishmentVaildDate;

    /**
     * 公示截止期
     */
    @TableField("PUBLIC_DEADLINE")
    private LocalDate publicDeadline;

    /**
     * 处罚机关
     */
    @TableField("PUNISHMENT_AUTH")
    private String punishmentAuth;

    /**
     * 处罚机关统一社会信用代码
     */
    @TableField("PUNISHMENT_AUTH_USCC")
    private String punishmentAuthUscc;

    /**
     * 数据来源单位
     */
    @TableField("SOURCE_UNIT")
    private String sourceUnit;

    /**
     * 数据来源单位统一社会信用代码
     */
    @TableField("SOURCE_UNIT_USCC")
    private String sourceUnitUscc;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 权利编码
     */
    @TableField("RIGHT_CODE")
    private String rightCode;

    /**
     * 信息使用范围
     */
    @TableField("USAGE_RANGE")
    private String usageRange;

    /**
     * 失信严重程度
     */
    @TableField("DISCREDIT_LEVEL")
    private String discreditLevel;

    /**
     * 违法行为
     */
    @TableField("ILLEGAL_BEHAVIOR")
    private String illegalBehavior;

    /**
     * 行政相对人类别
     */
    @TableField("ADM_COUNTERPART_CAT")
    private String admCounterpartCat;

    /**
     * 法定代表人证件类型
     */
    @TableField("LEGAL_REP_CERT_TYPE")
    private String legalRepCertType;

    /**
     * 归集部门
     */
    @TableField("COLLECTION_DEPARTMENT")
    private String collectionDepartment;

    @TableField("SOURCE_CREATE_DATE")
    private LocalDateTime sourceCreateDate;

    /**
     * 前置库数据主键
     */
    @TableField("SOURCE_ID")
    private String sourceId;

    /**
     * 前置库数据批次号
     */
    @TableField("SOURCE_RECORD_ID")
    private String sourceRecordId;


}
