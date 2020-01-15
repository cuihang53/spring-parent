package com.ch.web.controller;



import com.ch.entity.quartz.AjaxResult;
import com.ch.entity.quartz.QuartzJobEntity;
import com.ch.quartz.job.ScheduleQuartzJob;
import com.ch.quartz.service.TaskService;
import org.apache.log4j.Logger;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Description:    DOTO
 * @UpdateRemark:   修改内容
 * @Version: 1.0
 */
@Controller
@ResponseBody
@RequestMapping("/task")
public class QuartzController {
	Logger log = Logger.getLogger(QuartzController.class);
    @Autowired
    private TaskService taskService;

    /*******************************************
     缺陷：
            xxx.class:代表任务类，主要是任务需要执行的逻辑
            先写死是ScheduleQuartz.class
            新增加任务话就修改
     ***************************************/

    /**
     * 开启任务
     * @param group
     * @param name
     * @return
     * @throws Exception
     */
    @RequestMapping("/start")
    public AjaxResult start(String group, String name) throws Exception {
        return taskService.startTask(group, name, ScheduleQuartzJob.class);
    }

    /**
     * 终止任务
     * TODO 每次任务能够终止下来，但是会出现相同触发器定义的错误，但是不影响程序的运行
     * @param group
     * @param name
     * @param cron
     * @return
     * @throws Exception
     */
    @RequestMapping("/stop")
    public AjaxResult stop(String group, String name, String cron) throws Exception {
        return taskService.stopTask(group, name, ScheduleQuartzJob.class, cron);
    }

    /**
     * 暂停任务
     * @param group
     * @param name
     * @param cron
     * @return
     * @throws Exception
     */
    @RequestMapping("/pause")
    public AjaxResult pause(String group, String name, String cron) throws Exception {
        return taskService.pauseTask(group, name, ScheduleQuartzJob.class, cron);
    }

    /**
     * 恢复任务
     * @param group
     * @param name
     * @param cron
     * @return
     * @throws Exception
     */
    @RequestMapping("/resume")
    public AjaxResult resume(String group, String name, String cron) throws Exception {
        return taskService.resumeTask(group, name, ScheduleQuartzJob.class, cron);
    }

    /**
     * 查询所有任务
     * @return
     */
    @RequestMapping("/selectAllTask")
    public AjaxResult selectAllTask(){
        return taskService.selectAllTask();
    }

    /**
     * 更新执行频度
     * @param group
     * @param name
     * @param cron
     * @return
     */
    @RequestMapping("/updateCron")
    public AjaxResult updateCron(String group, String name,String cron) throws SchedulerException {
    	QuartzJobEntity job = new QuartzJobEntity();
    	job.setTaskGroup(group);
    	job.setTaskName(name);
    	job.setCron(cron);
        return taskService.updateCron(job);
    }

    /**
     * 新增任务
     * @param group
     * @param name
     * @param cron
     * @return
     */
    @RequestMapping("/insertTask")
    public AjaxResult insertTask(@RequestParam("group")String group,
                                 @RequestParam("name")String name,
                                 @RequestParam("cron")String cron){
        QuartzJobEntity job = new QuartzJobEntity();
    	job.setTaskGroup("group1");
    	job.setTaskName("test");
    	job.setCron("0 */1 * * * ?");
        
        
        //开启任务
    	job.setStatus("1");
        return taskService.insertTask(job,ScheduleQuartzJob.class);
    }
}

