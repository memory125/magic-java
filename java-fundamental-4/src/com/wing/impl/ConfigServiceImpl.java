package com.wing.impl;

import com.wing.interfaces.ConfigurationService;
import com.wing.interfaces.LoadService;

/**
 * @author memory125
 */
// 类 可以实现接口 implements 接口
// 实现了接口的类，就需要实现接口中的方法
// 类可以实现多个接口
public class ConfigServiceImpl implements ConfigurationService, LoadService {
    @Override
    public void config(String conf) {
        System.out.println(this.getClass() + ": config!" + conf);
    }

    @Override
    public void modify(String conf) {
        System.out.println(this.getClass() + ": modify!" + conf);

    }

    @Override
    public void delete() {
        System.out.println(this.getClass() + ": delete!");
    }

    @Override
    public void load() {
        System.out.println(this.getClass() + ": load!");

    }

    @Override
    public void launch() {
        System.out.println(this.getClass() + ": launch!");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass() + ": stop!");

    }
}
