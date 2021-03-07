package com.awa.iocframework.reader;

import com.awa.iocframework.entity.BeanDefinition;
import com.awa.iocframework.resource.UrlResource;

import java.util.HashMap;
import java.util.Map;

/**
 * 抽象Bean信息读取器
 *
 * @author awa
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private Map<String, BeanDefinition> beanDefinitionCache;

    private UrlResource urlResource;

    public AbstractBeanDefinitionReader(UrlResource urlResource) {
        this.beanDefinitionCache = new HashMap<>();
        this.urlResource = urlResource;
    }

    public Map<String, BeanDefinition> getBeanDefinitionCache() {
        return beanDefinitionCache;
    }

    public UrlResource getUrlResource() {
        return urlResource;
    }
}
