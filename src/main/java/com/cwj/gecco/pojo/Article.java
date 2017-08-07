package com.cwj.gecco.pojo;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.SpiderBean;

@Gecco(matchUrl="http://www.cnblogs.com/boychen/p/{aId}.html",pipelines="articlePipelines")
public class Article implements SpiderBean{
	
	@Request
	private HttpRequest request;
	
	/**
	 * 文章的Id 判断进入哪篇文章
	 */
	@RequestParameter
	private String aId;
	
	
	@HtmlField(cssPath="#topics > div > h1 > a")
	private String title;
	
	@HtmlField(cssPath="#topics > div")
	private String content;

	public HttpRequest getRequest() {
		return request;
	}

	public void setRequest(HttpRequest request) {
		this.request = request;
	}

	public String getaId() {
		return aId;
	}

	public void setaId(String aId) {
		this.aId = aId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
