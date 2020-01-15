package com.ch.quartz.listener;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
import org.quartz.SchedulerException;

public class QuartzListener implements JobListener {
	Logger loggger = Logger.getLogger(QuartzListener.class);
    private String JOBLISTERNER_ALLJOB_NAME = "allListener";

    @Override
    public String getName() {
        return JOBLISTERNER_ALLJOB_NAME;
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext jobExecutionContext) {
        loggger.info(">>>>>>>>>>>Job即将执行的通知>>>>>>>>>>>>>>>>>>");
    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext jobExecutionContext) {
    	loggger.info("job拒绝执行的通知");
    }

    @Override
    public void jobWasExecuted(JobExecutionContext jobExecutionContext, JobExecutionException e) {
    	loggger.info(">>>>>>>>>>>Job完成执行时的通知>>>>>>>>>>>>>>>>>");
    }
}
