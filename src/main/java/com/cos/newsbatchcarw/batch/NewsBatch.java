package com.cos.newsbatchcarw.batch;

import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cos.newsbatchcarw.domain.News;
import com.cos.newsbatchcarw.domain.NewsRepository;
import com.cos.newsbatchcarw.util.NaverNewsCraw;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class NewsBatch {
	private final NewsRepository newsRepository;
	private final NaverNewsCraw naverNewsCraw;
	
	int num = 1;
	
	
	
	@Scheduled(fixedDelay = 1000 * 60)
	public void NewsCrawAndSave() {
		System.out.println("크룰링 시작");
		List<News> newsList = naverNewsCraw.newsCraw5();
		newsRepository.saveAll(newsList);
	}

}
