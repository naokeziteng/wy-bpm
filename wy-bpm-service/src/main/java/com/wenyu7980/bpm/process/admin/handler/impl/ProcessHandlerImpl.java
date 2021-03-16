package com.wenyu7980.bpm.process.admin.handler.impl;

import com.wenyu7980.bpm.process.admin.handler.ProcessHandler;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.repository.Deployment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.InputStream;

/**
 *
 * @author wenyu
 */
@Component
public class ProcessHandlerImpl implements ProcessHandler {
    @Autowired
    private RepositoryService repositoryService;

    @Override
    public void add(String originalFilename, InputStream inputStream) {
        Deployment deploy = repositoryService.createDeployment().addInputStream(originalFilename, inputStream).deploy();
    }
}
