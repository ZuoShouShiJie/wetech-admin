package tech.wetech.admin.modules.example.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "product_info")
public class ProductInfo {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 机构id
     */
    @Column(name = "merchant_id")
    private String merchantId;

    /**
     * 机构编码
     */
    @Column(name = "merchant_code")
    private String merchantCode;

    /**
     * 机构类型,1资产方(场景方)2资金方
     */
    @Column(name = "merchant_type")
    private String merchantType;

    /**
     * 产品代码
     */
    @Column(name = "product_code")
    private String productCode;

    /**
     * 产品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 映射的外部产品ID
     */
    @Column(name = "mapping_pid")
    private String mappingPid;

    /**
     * 单笔额度下限
     */
    @Column(name = "single_lower")
    private BigDecimal singleLower;

    /**
     * 单笔额度上限
     */
    @Column(name = "single_upper")
    private BigDecimal singleUpper;

    /**
     * 产品总额度上限
     */
    @Column(name = "total_lower")
    private BigDecimal totalLower;

    /**
     * 产品类型代码
     */
    @Column(name = "product_typecode")
    private String productTypecode;

    /**
     * 产品类型备注(未用字段)
     */
    @Column(name = "product_typeremarks")
    private String productTyperemarks;

    /**
     * 借款类型
     */
    @Column(name = "loan_type")
    private String loanType;

    /**
     * 产品计划利率(未用字段)
     */
    @Column(name = "interest_rate")
    private BigDecimal interestRate;

    /**
     * 产品状态【1激活，0未激活，2逻辑删除】
     */
    private String status;

    /**
     * 扩展信息用于后续补充信息，如盖产品需要公积金账户，工资，税收等，可以放Json串
     */
    @Column(name = "extra_info")
    private String extraInfo;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 平台码
     */
    @Column(name = "platform_code")
    private String platformCode;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取机构id
     *
     * @return merchant_id - 机构id
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * 设置机构id
     *
     * @param merchantId 机构id
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 获取机构编码
     *
     * @return merchant_code - 机构编码
     */
    public String getMerchantCode() {
        return merchantCode;
    }

    /**
     * 设置机构编码
     *
     * @param merchantCode 机构编码
     */
    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    /**
     * 获取机构类型,1资产方(场景方)2资金方
     *
     * @return merchant_type - 机构类型,1资产方(场景方)2资金方
     */
    public String getMerchantType() {
        return merchantType;
    }

    /**
     * 设置机构类型,1资产方(场景方)2资金方
     *
     * @param merchantType 机构类型,1资产方(场景方)2资金方
     */
    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    /**
     * 获取产品代码
     *
     * @return product_code - 产品代码
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 设置产品代码
     *
     * @param productCode 产品代码
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * 获取产品名称
     *
     * @return product_name - 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名称
     *
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取映射的外部产品ID
     *
     * @return mapping_pid - 映射的外部产品ID
     */
    public String getMappingPid() {
        return mappingPid;
    }

    /**
     * 设置映射的外部产品ID
     *
     * @param mappingPid 映射的外部产品ID
     */
    public void setMappingPid(String mappingPid) {
        this.mappingPid = mappingPid;
    }

    /**
     * 获取单笔额度下限
     *
     * @return single_lower - 单笔额度下限
     */
    public BigDecimal getSingleLower() {
        return singleLower;
    }

    /**
     * 设置单笔额度下限
     *
     * @param singleLower 单笔额度下限
     */
    public void setSingleLower(BigDecimal singleLower) {
        this.singleLower = singleLower;
    }

    /**
     * 获取单笔额度上限
     *
     * @return single_upper - 单笔额度上限
     */
    public BigDecimal getSingleUpper() {
        return singleUpper;
    }

    /**
     * 设置单笔额度上限
     *
     * @param singleUpper 单笔额度上限
     */
    public void setSingleUpper(BigDecimal singleUpper) {
        this.singleUpper = singleUpper;
    }

    /**
     * 获取产品总额度上限
     *
     * @return total_lower - 产品总额度上限
     */
    public BigDecimal getTotalLower() {
        return totalLower;
    }

    /**
     * 设置产品总额度上限
     *
     * @param totalLower 产品总额度上限
     */
    public void setTotalLower(BigDecimal totalLower) {
        this.totalLower = totalLower;
    }

    /**
     * 获取产品类型代码
     *
     * @return product_typecode - 产品类型代码
     */
    public String getProductTypecode() {
        return productTypecode;
    }

    /**
     * 设置产品类型代码
     *
     * @param productTypecode 产品类型代码
     */
    public void setProductTypecode(String productTypecode) {
        this.productTypecode = productTypecode;
    }

    /**
     * 获取产品类型备注(未用字段)
     *
     * @return product_typeremarks - 产品类型备注(未用字段)
     */
    public String getProductTyperemarks() {
        return productTyperemarks;
    }

    /**
     * 设置产品类型备注(未用字段)
     *
     * @param productTyperemarks 产品类型备注(未用字段)
     */
    public void setProductTyperemarks(String productTyperemarks) {
        this.productTyperemarks = productTyperemarks;
    }

    /**
     * 获取借款类型
     *
     * @return loan_type - 借款类型
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * 设置借款类型
     *
     * @param loanType 借款类型
     */
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    /**
     * 获取产品计划利率(未用字段)
     *
     * @return interest_rate - 产品计划利率(未用字段)
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * 设置产品计划利率(未用字段)
     *
     * @param interestRate 产品计划利率(未用字段)
     */
    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * 获取产品状态【1激活，0未激活，2逻辑删除】
     *
     * @return status - 产品状态【1激活，0未激活，2逻辑删除】
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置产品状态【1激活，0未激活，2逻辑删除】
     *
     * @param status 产品状态【1激活，0未激活，2逻辑删除】
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取扩展信息用于后续补充信息，如盖产品需要公积金账户，工资，税收等，可以放Json串
     *
     * @return extra_info - 扩展信息用于后续补充信息，如盖产品需要公积金账户，工资，税收等，可以放Json串
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * 设置扩展信息用于后续补充信息，如盖产品需要公积金账户，工资，税收等，可以放Json串
     *
     * @param extraInfo 扩展信息用于后续补充信息，如盖产品需要公积金账户，工资，税收等，可以放Json串
     */
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    /**
     * 获取创建人
     *
     * @return creater - 创建人
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 设置创建人
     *
     * @param creater 创建人
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * 获取修改人
     *
     * @return modifier - 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置修改人
     *
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取平台码
     *
     * @return platform_code - 平台码
     */
    public String getPlatformCode() {
        return platformCode;
    }

    /**
     * 设置平台码
     *
     * @param platformCode 平台码
     */
    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }
}