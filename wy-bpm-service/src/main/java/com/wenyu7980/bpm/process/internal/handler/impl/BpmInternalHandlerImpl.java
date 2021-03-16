package com.wenyu7980.bpm.process.internal.handler.impl;

import com.wenyu7980.bpm.api.domain.BpmProcessInstance;
import com.wenyu7980.bpm.api.domain.BpmStart;
import com.wenyu7980.bpm.api.service.BpmInternalService;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author wenyu
 */
@Component
public class BpmInternalHandlerImpl implements BpmInternalService {
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private RuntimeService runtimeService;

    @Override
    public BpmProcessInstance start(BpmStart bpm) {
        ProcessDefinition definition = repositoryService.createProcessDefinitionQuery().active()
          .processDefinitionKey(bpm.getBpmKey()).singleResult();
        ProcessInstance processInstance = runtimeService
          .startProcessInstanceById(definition.getId(), bpm.getBusinessKey(), bpm.getParams());
        BpmProcessInstance instance = new BpmProcessInstance();
        instance.setId(processInstance.getId());
        return instance;
    }
}
