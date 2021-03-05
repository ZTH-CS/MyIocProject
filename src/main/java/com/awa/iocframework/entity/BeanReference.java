package com.awa.iocframework.entity;

/**
 * @author awa
 *
 * Bean中对其他Bean的引用
 */
public class BeanReference {

    // bean的名称
    private String name;

    public BeanReference(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
