package com.cwj.gecco.pipelines;

import com.cwj.gecco.pojo.Blog;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

/**
 * @author cwj
 * 2017年8月6日
 * 运行完Blog.java 根据@PipelineName 来这里
 */
@PipelineName(value="blogPipelines")
public class BlogPipelines implements Pipeline<Blog>{

	public void process(Blog blog) {
		System.out.println(blog.getContent());
	}

}
