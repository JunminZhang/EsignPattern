package com.zjm.pattern.factory.practice.factoryPattern.AbstractFactory;

/**
 * Create by zjm on 2019/3/8
 */
public interface AbstractPhoneFactory {

    Brand getBrand();

    Battery getBattery();
}
