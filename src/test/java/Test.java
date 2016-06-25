/*
* Copyright (c) 2014 Huangpf. All Rights Reserved.
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Calendar;
import java.util.Locale;

/**
 * TODO 类的描述
 *
 * @author: Huangpf  Date: 2016/5/18 Time: 17:22.
 */
public class Test {

    public static void main(String[] args){
        ApplicationContext ctx=new FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/applicationContext.xml");
        Object[] arg = new Object[]{
                "Erica",
                Calendar.getInstance().getTime()
        };
        //以系统默认Locale加载信息(对于中文WinXP而言，默认为zh_CN)
        String msg = ctx.getMessage("userinfo", arg, Locale.CHINA);
        System.out.println("Message is ===> "+msg);
    }
}
