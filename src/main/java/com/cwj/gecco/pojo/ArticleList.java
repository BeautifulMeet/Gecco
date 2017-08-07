package com.cwj.gecco.pojo;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.SpiderBean;

@Gecco(matchUrl="http://www.cnblogs.com/boychen/",pipelines="articleListPipelines")
public class ArticleList implements SpiderBean{

	
	@Request
	private HttpRequest request;
	
	/**
	 * 文章创建日期
	 */
	@HtmlField(cssPath="body div.day  div.dayTitle a")
	private List<String> createDates;

	/**
	 * 文章标题
	 */
	@Text
	@HtmlField(cssPath="body div.day  div.postTitle a")
	private List<String> titles;
	
	/**
	 * 文章内容
	 */
	@Text
	@HtmlField(cssPath="body div.day  div.postCon > div.c_b_p_desc")
	private List<String> contents;
	
	/**
	 * 阅读排行榜
	 */
	@HtmlField(cssPath="body div.catListTitle")
	private List<String> readRanks;
	
	public HttpRequest getRequest() {
		return request;
	}

	public void setRequest(HttpRequest request) {
		this.request = request;
	}

	public List<String> getCreateDates() {
		return createDates;
	}

	public void setCreateDates(List<String> createDates) {
		this.createDates = createDates;
	}

	public List<String> getTitles() {
		return titles;
	}

	public void setTitles(List<String> titles) {
		this.titles = titles;
	}

	public List<String> getContents() {
		return contents;
	}

	public void setContents(List<String> contents) {
		this.contents = contents;
	}

	public List<String> getReadRanks() {
		return readRanks;
	}

	public void setReadRanks(List<String> readRanks) {
		this.readRanks = readRanks;
	}

	

}
