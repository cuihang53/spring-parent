package com.ch.quartz.job;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * @Description:    任务器
 * @Version: 1.0
 */
public class ScheduleQuartzJob extends QuartzJobBean {
	
	private static Logger log = Logger.getLogger(ScheduleQuartzJob.class);
    public ScheduleQuartzJob(){

    }
    /**
     * 具体任务
     * @param jobExecutionContext
     * @throws JobExecutionException
     */
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //获取任务组名称
        String group = jobExecutionContext.getJobDetail().getJobDataMap().get("group").toString();
        //获取任务名
        String name = jobExecutionContext.getJobDetail().getJobDataMap().get("name").toString();
        //具体业务逻辑 ....
        log.info("任务组："+group+"的任务："+name+"执行了定时任务：...."+"执行时间："+new Date());
    }
}
