/**
 * 科技公司源代码，版权归科技公司所有。
 * 项目名称 : 工厂设计模式-消息工厂
 * 创建日期 :  2019/5/27
 * 修改历史 :
 * 1. [ 2019/5/27]创建文件 by Administrator
 */
package com.wangcai.api.service.impl;

/**
 *TODO 添加类/接口功能描述
 *@author:Administrator
 */
public class MailFactory implements  Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}