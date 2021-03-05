package com.awa.iocframework.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author awa
 *
 * Bean在容器中定义的信息
 */
public class BeanDefinition {

    // 实例化后的bean对象
    private Object bean;

    // bean的类型信息
    private Class beanClass;

    // bean的类名
    private String beanClassName;

    // 是否为单例bean
    private boolean isSingleton;

    // bean的属性列表
    private List<Property> properties;

    public BeanDefinition() {
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try{
            this.beanClass = Class.forName(beanClassName);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public boolean isSingleton() {
        return isSingleton;
    }

    public void setSingleton(boolean singleton) {
        isSingleton = singleton;
    }

    public List<Property> getProperties() {
        if(properties == null){
            properties = new ArrayList<>();
        }
        return properties;
    }
}
