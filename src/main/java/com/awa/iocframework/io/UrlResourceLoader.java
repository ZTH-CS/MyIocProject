package com.awa.iocframework.io;

import java.io.InputStream;
import java.net.URL;

/**
 * 默认资源加载器
 *
 * @author awa
 */
public class UrlResourceLoader {

    public InputStream getResourceInputStream(String location) throws Exception {
        // 根据当前类路径获取url地址
        URL url = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(url).getInputStream();
    }

}
