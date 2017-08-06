package com.cwj.gecco.pojo;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.SpiderBean;

/**
 * @author cwj
 * 2017年8月6日
 * Blog实体类，运行主函数从这里开始解析
 * matchUrl:要抓包的目标地址
 * pipelines:跳转到下个pipelines
 */
@Gecco(matchUrl="http://www.cnblogs.com/boychen/p/7226831.html",pipelines="blogPipelines")
public class Blog implements SpiderBean{
	/**
	 * 向指定URL发送GET方法的请求
	 */
	@Request
	private HttpRequest request;
	
	/**
	 * 抓去这个路径下所有的内容
	 */
	@HtmlField(cssPath = "body div#cnblogs_post_body")
	private String content;

	public HttpRequest getRequest() {
		return request;
	}

	public void setRequest(HttpRequest request) {
		this.request = request;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	} 
	
	
}
