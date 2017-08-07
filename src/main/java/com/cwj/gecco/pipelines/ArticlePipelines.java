package com.cwj.gecco.pipelines;

import com.cwj.gecco.pojo.Article;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

@PipelineName(value="articlePipelines")
public class ArticlePipelines implements Pipeline<Article>{

	public void process(Article article) {
		System.out.println("------START--------");
		
		
		System.out.println(article.getTitle());
		
		
		System.out.println(article.getContent());
	}
	
}
