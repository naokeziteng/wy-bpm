package com.wenyu7980.bpm.process.internal.controller;

import com.wenyu7980.bpm.api.domain.BpmProcessInstance;
import com.wenyu7980.bpm.api.domain.BpmStart;
import com.wenyu7980.bpm.api.service.BpmInternalService;
import com.wenyu7980.bpm.process.internal.handler.BpmInternalHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 *
 * @author wenyu
 */
@ApiIgnore
@RestController
@RequestMapping("internal/processes")
public class BpmInternalController implements BpmInternalService {
    @Autowired
    private BpmInternalHandler bpmInternalHandler;

    @Override
    public BpmProcessInstance start(@RequestBody BpmStart bpm) {
        return bpmInternalHandler.start(bpm);
    }
}
