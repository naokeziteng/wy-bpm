package com.wenyu7980.bpm.process.internal.handler;

import com.wenyu7980.bpm.api.domain.BpmProcessInstance;
import com.wenyu7980.bpm.api.domain.BpmStart;

/**
 *
 * @author wenyu
 */
public interface BpmInternalHandler {
    /**
     * 启动
     * @param bpm
     * @return
     */
    BpmProcessInstance start(BpmStart bpm);
}
