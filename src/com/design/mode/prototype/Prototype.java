package com.design.mode.prototype;

/**
 * Created by zhangyuan on 2020/2/19 0019.
 */
public interface Prototype extends Cloneable{
    <T extends Prototype> T cloneSelf();
}
