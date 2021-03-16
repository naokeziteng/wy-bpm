package com.wenyu7980.bpm.process.admin.handler;

import java.io.InputStream;

/**
 *
 * @author wenyu
 */
public interface ProcessHandler {
    /**
     * 添加
     * @param originalFilename
     * @param inputStream
     */
    void add(String originalFilename, InputStream inputStream);
}
