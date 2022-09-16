package com.example.sl4jlearn.learn1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zoh66
 * @Description
 * @create 2022-09-16 10:59 AM
 */
public class learn {

    public static void main(String[] args) {
        Logger  logger = LoggerFactory.getLogger("Samplelogger");
        logger.trace("aaaaaaa");
        logger.debug("bbbbbbb");
        logger.info("ccccccc");
        logger.warn("ddddddd");
        logger.error("eeeeeee");
    }
}
