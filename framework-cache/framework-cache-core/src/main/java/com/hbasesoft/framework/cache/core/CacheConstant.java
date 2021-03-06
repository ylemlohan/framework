/**
 * 
 */
package com.hbasesoft.framework.cache.core;

/**
 * <Description> <br>
 * 
 * @author xgf<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年11月2日 <br>
 * @since V1.0<br>
 * @see com.hbasesoft.framework.common.constant <br>
 */

public interface CacheConstant {

    /**
     * 默认缓存目录
     */
    String DEFAULT_CACHE_DIR = "/";

    /**
     * 缓存模式:redis
     */
    String CACHE_MODEL_REDIS = "REDIS";

    /**
     * 数据库配置缓存
     */
    String CACHE_KEY_CONFIGITEM = "/CACHE_KEY_CONFIGITEM";

    /**
     * 缓存日志
     */
    String CACHE_LOGS = "/CACHE_LOGS";

    /** sql模板目录 */
    String SQL_DIR = "/SQL_TEMPLATE";

    /** dao 参数目录 */
    String SQL_PARAM_DIR = "/SQL_PARAM";

    /** 普通字符串目录 */
    String COMMON_DIR = "/COMMON_DIR";

    /** 模块代码 */
    String MODULE_CODE = "project.code";

    /** 缓存时间 */
    String CONFIG_CACHE_TIME = "CONFIG_CACHE_TIME";

    /** 路径 */
    String URL_RESOURCE = "/URL_RESOURCE";

    /** 事件 */
    String EVENT = "/EVENT";

    /** 字典表 */
    String DICTIONARY_DATA = "/DICTIONARY_DATA";

    /**
     * MODULE_DATA
     */
    String MODULE_DATA = "/MODULE_DATA";

}
