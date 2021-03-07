package com.awa.iocframework.reader;

import com.awa.iocframework.entity.BeanDefinition;
import com.awa.iocframework.io.UrlResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * 抽象Bean信息读取器
 *
 * @author awa
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private Map<String, BeanDefinition> registry;

    private UrlResourceLoader urlResourceLoader;

    public AbstractBeanDefinitionReader(UrlResourceLoader urlResourceLoader) {
        this.registry = new HashMap<>();
        this.urlResourceLoader = urlResourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public UrlResourceLoader getUrlResourceLoader() {
        return urlResourceLoader;
    }
}
