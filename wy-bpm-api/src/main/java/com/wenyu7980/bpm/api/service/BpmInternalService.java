package com.wenyu7980.bpm.api.service;

import com.wenyu7980.bpm.api.domain.BpmProcessInstance;
import com.wenyu7980.bpm.api.domain.BpmStart;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author wenyu
 */
@FeignClient(name = "wy-bpm", path = "internal", contextId = "wy-bpm")
public interface BpmInternalService {
    /**
     * 开启
     * @param bpm
     * @return
     */
    @PostMapping("processes/start")
    BpmProcessInstance start(@RequestBody BpmStart bpm);
}
