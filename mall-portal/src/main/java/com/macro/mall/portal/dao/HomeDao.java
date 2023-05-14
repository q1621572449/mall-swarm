package com.macro.mall.portal.dao;

import com.macro.mall.model.CmsSubject;
import com.macro.mall.model.PmsBrand;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.portal.domain.FlashPromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 首页内容管理自定义Dao
 * 在JavaWeb中，DAO（Data Access Object）是一种数据访问设计模式，
 * 用于在业务逻辑层和数据源（如数据库、文件、缓存等）之间进行数据交互，将数据持久化到数据源中或从数据源中获取数据。
 * Created by macro on 2019/1/28.
 */
public interface HomeDao {

    /**
     * 获取推荐品牌
     */
    List<PmsBrand> getRecommendBrandList(@Param("offset") Integer offset,@Param("limit") Integer limit);

    /**
     * 获取秒杀商品
     */
    List<FlashPromotionProduct> getFlashProductList(@Param("flashPromotionId") Long flashPromotionId, @Param("sessionId") Long sessionId);

    /**
     * 获取新品推荐
     */
    List<PmsProduct> getNewProductList(@Param("offset") Integer offset,@Param("limit") Integer limit);
    /**
     * 获取人气推荐
     */
    List<PmsProduct> getHotProductList(@Param("offset") Integer offset,@Param("limit") Integer limit);

    /**
     * 获取推荐专题
     */
    List<CmsSubject> getRecommendSubjectList(@Param("offset") Integer offset, @Param("limit") Integer limit);
}
