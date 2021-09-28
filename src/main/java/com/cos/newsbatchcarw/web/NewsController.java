package com.cos.newsbatchcarw.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.newsbatchcarw.domain.News;
import com.cos.newsbatchcarw.domain.NewsRepository;
import com.cos.newsbatchcarw.util.NaverNewsCraw;
import com.cos.newsbatchcarw.web.dto.CMRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class NewsController {

	private final NewsRepository newsRepository;
	private final NaverNewsCraw naverNewsCraw;

	@GetMapping("/news")
	public CMRespDto<List<News>> findAll() {
		List<News> newsList = naverNewsCraw.newsCraw5();
		newsRepository.saveAll(newsList);
		return new CMRespDto<>(1, "성공", newsRepository.findAll());
	}
}