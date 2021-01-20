package com.wing.interfaces;

/**
 * @author memory125
 */
// interface 定义的关键字  接口都需要有实现类
public interface ConfigurationService {
    // 接口中的所有定义其实都是抽象的 public abstract
    void config(String conf);
    void modify(String conf);
    void delete();
}
