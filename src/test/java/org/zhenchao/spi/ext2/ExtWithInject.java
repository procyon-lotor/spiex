package org.zhenchao.spi.ext2;

import org.zhenchao.spi.SPI;

/**
 * @author zhenchao.wang 2017-12-30 12:32
 * @version 1.0.0
 */
@SPI
public interface ExtWithInject {

    String echo(int pt, String s);

}
