package com.cwj.gecco.main;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		
		String msg = "posted @ 2017-08-06 12:06 那个男孩很坏 阅读(15) 评论(0)";
        List<String> list = getTeacherList(msg);  
        for (int i = 0; i < list.size(); i++) {  
            System.out.println(i+"-->"+list.get(i));  
        }  
				
	}
	
	
    /** 
     * 使用正则表达式提取中括号中的内容 
     * @param msg 
     * @return  
     */  
	public static List<String> getTeacherList(String managers){
        List<String> ls=new ArrayList<String>();
        Pattern pattern = Pattern.compile("(?<=\\()(.+?)(?=\\))");
        Matcher matcher = pattern.matcher(managers);
        while(matcher.find())
            ls.add(matcher.group());
        return ls;
    }  
}
