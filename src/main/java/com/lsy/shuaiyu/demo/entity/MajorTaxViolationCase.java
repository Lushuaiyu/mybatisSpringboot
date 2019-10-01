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
 * 重大税收违法案件当事人信息
 * </p>
 *
 * @author jobob
 * @since 2019-10-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("MAJOR_TAX_VIOLATION_CASE")
public class MajorTaxViolationCase implements Serializable {

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
     * 纳税人识别号
     */
    @TableField("TAXPAYER_ID_NUM")
    private String taxpayerIdNum;

    /**
     * 注册地址
     */
    @TableField("REGISTERED_ADDRESS")
    private String registeredAddress;

    /**
     * 法定代表人或者负责人姓名
     */
    @TableField("LEGAL_REP")
    private String legalRep;

    /**
     * 性别
     */
    @TableField("GENDER")
    private String gender;

    /**
     * 法定代表人或者负责人身份号码
     */
    @TableField("LEGAL_REP_CERT_NUM")
    private String legalRepCertNum;

    /**
     * 负有直接责任的财务人员
     */
    @TableField("DIRECT_RES_OFFICER")
    private String directResOfficer;

    /**
     * 负有直接责任的财务人员性别
     */
    @TableField("DIRECT_RES_OFFICER_GENDER")
    private String directResOfficerGender;

    /**
     * 负有直接责任的财务人员身份证号码
     */
    @TableField("DIRECT_RES_OFFICER_ID")
    private String directResOfficerId;

    /**
     * 负有直接责任的涉税专业机构及从业人员
     */
    @TableField("TAX_AUTH_EMPLOYEE")
    private String taxAuthEmployee;

    /**
     * 主要违法事实
     */
    @TableField("MAIN_ILLEGAL_FACTS")
    private String mainIllegalFacts;

    /**
     * 相关法律依据
     */
    @TableField("RELEVANT_LEGAL_BASIS")
    private String relevantLegalBasis;

    /**
     * 税务处理处罚情况
     */
    @TableField("TAX_TREATMENT_PENALTY")
    private String taxTreatmentPenalty;

    /**
     * 实施检查的单位
     */
    @TableField("INSPECT_UNIT")
    private String inspectUnit;

    /**
     * 确认日期（年月日）
     */
    @TableField("CONFIRMATION_DATE")
    private LocalDate confirmationDate;

    /**
     * 公示截止日期（年月日）
     */
    @TableField("PUBLIC_DEADLINE")
    private LocalDate publicDeadline;

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
