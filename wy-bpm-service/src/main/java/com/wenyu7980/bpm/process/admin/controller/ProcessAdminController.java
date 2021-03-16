package com.wenyu7980.bpm.process.admin.controller;

import com.wenyu7980.bpm.process.admin.handler.ProcessHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 *
 * @author wenyu
 */
@Api("流程管理(管理端)")
@RestController
@RequestMapping("admin/processes")
public class ProcessAdminController {
    @Autowired
    private ProcessHandler processHandler;

    @ApiOperation("上传流程")
    @PostMapping()
    public void add(@RequestParam("file") MultipartFile file) throws IOException {
        processHandler.add(file.getOriginalFilename(), file.getInputStream());
    }
}
