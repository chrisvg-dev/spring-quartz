package com.cvg.quartzapp.controller;

import com.cvg.quartzapp.configuration.SchedulerJobInfo;
import com.cvg.quartzapp.configuration.SchedulerJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private SchedulerJobService scheduleJobService;

    @GetMapping("/index")
    public String index(Model model){
        List<SchedulerJobInfo> jobList = scheduleJobService.getAllJobList();
        model.addAttribute("jobs", jobList);
        return "index";
    }

}