package com.cwj.gecco.pipelines;

import com.cwj.gecco.pojo.ArticleList;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

@PipelineName(value="articleListPipelines")
public class ArticleListPipelines implements Pipeline<ArticleList>{

	public void process(ArticleList articles) {
		
		System.out.println("总共"+articles.getReadRanks().size()+"条数据.");
		for (int i = 0; i < articles.getReadRanks().size(); i++) {
			System.out.println("第"+i+"条数据：");
			System.out.println(articles.getReadRanks().get(i));
		}
	}

}
