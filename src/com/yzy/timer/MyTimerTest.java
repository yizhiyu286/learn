package com.yzy.timer;

import java.util.Timer;

/**
 * 定时任务Timer测试类
 * java.util.Timer 定时工具 通过该类实现对定时任务有频率的执行
 * java.util.TimerTask 实时任务 执行定时任务的任务类  自定义的定时任务需继承该抽象类
 */
public class MyTimerTest {

    public static void main(String[] args) {
        // 创建Timer实例
        Timer timer = new Timer();
        // 创建TimerTask实例
        MyTimeTask testTask1 = new MyTimeTask("testTask1");
        // 通过Timer类中的方法定时执行
        timer.schedule(testTask1, 2000L, 1000L);
    }
}
