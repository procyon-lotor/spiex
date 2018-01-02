package org.zhenchao.spi.ext5.impl;

import org.zhenchao.spi.Adaptive;
import org.zhenchao.spi.ext5.Extension;

/**
 * @author zhenchao.wang 2018-01-02 10:39
 * @version 1.0.0
 */
@Adaptive
public class ExtensionAdapter implements Extension {

    @Override
    public String hello(String name) {
        return "ExtensionWrapper-" + name;
    }
}
