package com.yzy.timer;

import java.util.TimerTask;

/**
 * 定时任务--任务类 实现TimerTask接口
 */
public class MyTimeTask extends TimerTask {

    private String name;

    public MyTimeTask(String name) {
        this.name = name;
    }

    /**
     * 任务执行时执行的方法
     */
    @Override
    public void run() {
        System.out.println("this task name is :" + this.name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
