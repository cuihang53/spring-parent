package com.ch.entity.quartz;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:    任务调度 -- 自定义job -- 对应数据库，主要用来保存任务信息到数据库当中
 * @Version: 1.0
 */

public class QuartzJobEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//任务id
    private int id;
    //任务组别
    private String taskGroup;
    //任务名字
    private String taskName;
    //cron表达式
    private String cron;
    //任务状态
    private String status;
    //任务创建时间
    private Date gmt_create;
    //任务修改时间
    private Date gmt_modify;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskGroup() {
		return taskGroup;
	}
	public void setTaskGroup(String taskGroup) {
		this.taskGroup = taskGroup;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getCron() {
		return cron;
	}
	public void setCron(String cron) {
		this.cron = cron;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getGmt_create() {
		return gmt_create;
	}
	public void setGmt_create(Date gmt_create) {
		this.gmt_create = gmt_create;
	}
	public Date getGmt_modify() {
		return gmt_modify;
	}
	public void setGmt_modify(Date gmt_modify) {
		this.gmt_modify = gmt_modify;
	}

    
    
}
