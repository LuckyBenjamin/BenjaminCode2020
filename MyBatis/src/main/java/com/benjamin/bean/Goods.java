package com.benjamin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "goods")
public class Goods implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 商户ID
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 一级类目ID
     */
    @Column(name = "category_first_id")
    private Integer categoryFirstId;

    /**
     * 二级类目ID
     */
    @Column(name = "category_second_id")
    private Integer categorySecondId;

    @Column(name = "valid")
    private Boolean valid;

    /**
     * 三级类目ID
     */
    @Column(name = "category_third_id")
    private Integer categoryThirdId;

    /**
     * 运费模板ID
     */
    @Column(name = "express_template_id")
    private Integer expressTemplateId;

    /**
     * 商品编号
     */
    @Column(name = "goods_no")
    private String goodsNo;

    /**
     * 商品SKU编码
     */
    @Column(name = "sku_no")
    private String skuNo;

    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 是否是赠品属性
     */
    @Column(name = "is_gift")
    private Integer isGift;

    /**
     * 是否是统一规格 0 否 1 是 
     */
    @Column(name = "is_uniform")
    private Boolean isUniform;

    /**
     * 封面图片
     */
    @Column(name = "cover_img")
    private String coverImg;

    /**
     * 商品详情页轮播图地址
     */
    @Column(name = "banner_img_paths")
    private String bannerImgPaths;

    /**
     * 商品详情页轮播视频地址
     */
    @Column(name = "video_paths")
    private String videoPaths;

    /**
     * 佣金百分比
     */
    @Column(name = "commission_rate")
    private BigDecimal commissionRate;

    /**
     * 实际销量
     */
    @Column(name = "actual_sales")
    private Integer actualSales;

    /**
     * 自定义起止销量
     */
    @Column(name = "custom_start_sales")
    private Integer customStartSales;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 销售价
     */
    @Column(name = "sale_price")
    private BigDecimal salePrice;

    /**
     * 市场价
     */
    @Column(name = "market_price")
    private BigDecimal marketPrice;

    /**
     * 详情文本
     */
    @Column(name = "intro_id")
    private Integer introId;

    /**
     * 每人限购数 0表示不限购
     */
    private Integer limitation;

    /**
     * 是否包邮
     */
    @Column(name = "free_post")
    private Boolean freePost;

    /**
     * 是否上架 0 否 1 是
     */
    @Column(name = "is_shelved")
    private Boolean isShelved;

    /**
     * 排序值
     */
    private Integer sort;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 是否删除
     */
    @Column(name = "is_del")
    private Boolean isDel;

    /**
     * 视频封面图片
     */
    @Column(name = "video_img")
    private String videoImg;

    /**
     * 拼团数量
     */
    @Column(name = "assemble_num")
    private Integer assembleNum;

    /**
     * 配送方式：0：寄货到家、1：寄货到店、2：顾客自选 默认是0
     */
    @Column(name = "shipping_mode")
    private Integer shippingMode;

    /**
     * 积分体系（默认为0：0 纯现金，1 积分+现金，2 纯积分)
     */
    @Column(name = "price_system")
    private Integer priceSystem;

    /**
     * 商品购买所需积分
     */
    @Column(name = "integral_points")
    private Long integralPoints;

    /**
     * 线下商品id
     */
    @Column(name = "offline_goods_id")
    private String offlineGoodsId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商户ID
     *
     * @return merchant_id - 商户ID
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * 设置商户ID
     *
     * @param merchantId 商户ID
     */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 获取一级类目ID
     *
     * @return category_first_id - 一级类目ID
     */
    public Integer getCategoryFirstId() {
        return categoryFirstId;
    }

    /**
     * 设置一级类目ID
     *
     * @param categoryFirstId 一级类目ID
     */
    public void setCategoryFirstId(Integer categoryFirstId) {
        this.categoryFirstId = categoryFirstId;
    }

    /**
     * 获取二级类目ID
     *
     * @return category_second_id - 二级类目ID
     */
    public Integer getCategorySecondId() {
        return categorySecondId;
    }

    /**
     * 设置二级类目ID
     *
     * @param categorySecondId 二级类目ID
     */
    public void setCategorySecondId(Integer categorySecondId) {
        this.categorySecondId = categorySecondId;
    }

    /**
     * 获取三级类目ID
     *
     * @return category_third_id - 三级类目ID
     */
    public Integer getCategoryThirdId() {
        return categoryThirdId;
    }

    /**
     * 设置三级类目ID
     *
     * @param categoryThirdId 三级类目ID
     */
    public void setCategoryThirdId(Integer categoryThirdId) {
        this.categoryThirdId = categoryThirdId;
    }

    /**
     * 获取运费模板ID
     *
     * @return express_template_id - 运费模板ID
     */
    public Integer getExpressTemplateId() {
        return expressTemplateId;
    }

    /**
     * 设置运费模板ID
     *
     * @param expressTemplateId 运费模板ID
     */
    public void setExpressTemplateId(Integer expressTemplateId) {
        this.expressTemplateId = expressTemplateId;
    }

    /**
     * 获取商品编号
     *
     * @return goods_no - 商品编号
     */
    public String getGoodsNo() {
        return goodsNo;
    }

    /**
     * 设置商品编号
     *
     * @param goodsNo 商品编号
     */
    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    /**
     * 获取商品SKU编码
     *
     * @return sku_no - 商品SKU编码
     */
    public String getSkuNo() {
        return skuNo;
    }

    /**
     * 设置商品SKU编码
     *
     * @param skuNo 商品SKU编码
     */
    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo == null ? null : skuNo.trim();
    }

    /**
     * 获取商品名称
     *
     * @return goods_name - 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置商品名称
     *
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 获取是否是赠品属性
     *
     * @return is_gift - 是否是赠品属性
     */
    public Integer getIsGift() {
        return isGift;
    }

    /**
     * 设置是否是赠品属性
     *
     * @param isGift 是否是赠品属性
     */
    public void setIsGift(Integer isGift) {
        this.isGift = isGift;
    }

    /**
     * 获取是否是统一规格 0 否 1 是 
     *
     * @return is_uniform - 是否是统一规格 0 否 1 是 
     */
    public Boolean getIsUniform() {
        return isUniform;
    }

    /**
     * 设置是否是统一规格 0 否 1 是 
     *
     * @param isUniform 是否是统一规格 0 否 1 是 
     */
    public void setIsUniform(Boolean isUniform) {
        this.isUniform = isUniform;
    }

    /**
     * 获取封面图片
     *
     * @return cover_img - 封面图片
     */
    public String getCoverImg() {
        return coverImg;
    }

    /**
     * 设置封面图片
     *
     * @param coverImg 封面图片
     */
    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg == null ? null : coverImg.trim();
    }

    /**
     * 获取商品详情页轮播图地址
     *
     * @return banner_img_paths - 商品详情页轮播图地址
     */
    public String getBannerImgPaths() {
        return bannerImgPaths;
    }

    /**
     * 设置商品详情页轮播图地址
     *
     * @param bannerImgPaths 商品详情页轮播图地址
     */
    public void setBannerImgPaths(String bannerImgPaths) {
        this.bannerImgPaths = bannerImgPaths == null ? null : bannerImgPaths.trim();
    }

    /**
     * 获取商品详情页轮播视频地址
     *
     * @return video_paths - 商品详情页轮播视频地址
     */
    public String getVideoPaths() {
        return videoPaths;
    }

    /**
     * 设置商品详情页轮播视频地址
     *
     * @param videoPaths 商品详情页轮播视频地址
     */
    public void setVideoPaths(String videoPaths) {
        this.videoPaths = videoPaths == null ? null : videoPaths.trim();
    }

    /**
     * 获取佣金百分比
     *
     * @return commission_rate - 佣金百分比
     */
    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    /**
     * 设置佣金百分比
     *
     * @param commissionRate 佣金百分比
     */
    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    /**
     * 获取实际销量
     *
     * @return actual_sales - 实际销量
     */
    public Integer getActualSales() {
        return actualSales;
    }

    /**
     * 设置实际销量
     *
     * @param actualSales 实际销量
     */
    public void setActualSales(Integer actualSales) {
        this.actualSales = actualSales;
    }

    /**
     * 获取自定义起止销量
     *
     * @return custom_start_sales - 自定义起止销量
     */
    public Integer getCustomStartSales() {
        return customStartSales;
    }

    /**
     * 设置自定义起止销量
     *
     * @param customStartSales 自定义起止销量
     */
    public void setCustomStartSales(Integer customStartSales) {
        this.customStartSales = customStartSales;
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取销售价
     *
     * @return sale_price - 销售价
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * 设置销售价
     *
     * @param salePrice 销售价
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * 获取市场价
     *
     * @return market_price - 市场价
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * 设置市场价
     *
     * @param marketPrice 市场价
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * 获取详情文本
     *
     * @return intro_id - 详情文本
     */
    public Integer getIntroId() {
        return introId;
    }

    /**
     * 设置详情文本
     *
     * @param introId 详情文本
     */
    public void setIntroId(Integer introId) {
        this.introId = introId;
    }

    /**
     * 获取每人限购数 0表示不限购
     *
     * @return limitation - 每人限购数 0表示不限购
     */
    public Integer getLimitation() {
        return limitation;
    }

    /**
     * 设置每人限购数 0表示不限购
     *
     * @param limitation 每人限购数 0表示不限购
     */
    public void setLimitation(Integer limitation) {
        this.limitation = limitation;
    }

    /**
     * 获取是否包邮
     *
     * @return free_post - 是否包邮
     */
    public Boolean getFreePost() {
        return freePost;
    }

    /**
     * 设置是否包邮
     *
     * @param freePost 是否包邮
     */
    public void setFreePost(Boolean freePost) {
        this.freePost = freePost;
    }

    /**
     * 获取是否上架 0 否 1 是
     *
     * @return is_shelved - 是否上架 0 否 1 是
     */
    public Boolean getIsShelved() {
        return isShelved;
    }

    /**
     * 设置是否上架 0 否 1 是
     *
     * @param isShelved 是否上架 0 否 1 是
     */
    public void setIsShelved(Boolean isShelved) {
        this.isShelved = isShelved;
    }

    /**
     * 获取排序值
     *
     * @return sort - 排序值
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序值
     *
     * @param sort 排序值
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @return gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取是否删除
     *
     * @return is_del - 是否删除
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除
     *
     * @param isDel 是否删除
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取视频封面图片
     *
     * @return video_img - 视频封面图片
     */
    public String getVideoImg() {
        return videoImg;
    }

    /**
     * 设置视频封面图片
     *
     * @param videoImg 视频封面图片
     */
    public void setVideoImg(String videoImg) {
        this.videoImg = videoImg == null ? null : videoImg.trim();
    }

    /**
     * 获取拼团数量
     *
     * @return assemble_num - 拼团数量
     */
    public Integer getAssembleNum() {
        return assembleNum;
    }

    /**
     * 设置拼团数量
     *
     * @param assembleNum 拼团数量
     */
    public void setAssembleNum(Integer assembleNum) {
        this.assembleNum = assembleNum;
    }

    /**
     * 获取配送方式：0：寄货到家、1：寄货到店、2：顾客自选 默认是0
     *
     * @return shipping_mode - 配送方式：0：寄货到家、1：寄货到店、2：顾客自选 默认是0
     */
    public Integer getShippingMode() {
        return shippingMode;
    }

    /**
     * 设置配送方式：0：寄货到家、1：寄货到店、2：顾客自选 默认是0
     *
     * @param shippingMode 配送方式：0：寄货到家、1：寄货到店、2：顾客自选 默认是0
     */
    public void setShippingMode(Integer shippingMode) {
        this.shippingMode = shippingMode;
    }

    /**
     * 获取积分体系（默认为0：0 纯现金，1 积分+现金，2 纯积分)
     *
     * @return price_system - 积分体系（默认为0：0 纯现金，1 积分+现金，2 纯积分)
     */
    public Integer getPriceSystem() {
        return priceSystem;
    }

    /**
     * 设置积分体系（默认为0：0 纯现金，1 积分+现金，2 纯积分)
     *
     * @param priceSystem 积分体系（默认为0：0 纯现金，1 积分+现金，2 纯积分)
     */
    public void setPriceSystem(Integer priceSystem) {
        this.priceSystem = priceSystem;
    }

    /**
     * 获取商品购买所需积分
     *
     * @return integral_points - 商品购买所需积分
     */
    public Long getIntegralPoints() {
        return integralPoints;
    }

    /**
     * 设置商品购买所需积分
     *
     * @param integralPoints 商品购买所需积分
     */
    public void setIntegralPoints(Long integralPoints) {
        this.integralPoints = integralPoints;
    }

    /**
     * 获取线下商品id
     *
     * @return offline_goods_id - 线下商品id
     */
    public String getOfflineGoodsId() {
        return offlineGoodsId;
    }

    /**
     * 设置线下商品id
     *
     * @param offlineGoodsId 线下商品id
     */
    public void setOfflineGoodsId(String offlineGoodsId) {
        this.offlineGoodsId = offlineGoodsId == null ? null : offlineGoodsId.trim();
    }
}