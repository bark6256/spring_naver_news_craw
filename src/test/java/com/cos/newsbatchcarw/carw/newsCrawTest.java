package com.cos.newsbatchcarw.carw;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

public class newsCrawTest {
	
	@Test
	public void test1() {
		RestTemplate rt = new RestTemplate();
		
		String url = "https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=102&oid=022&aid=0000000001";
		
		String html = rt.getForObject(url, String.class);
		
		Document doc = Jsoup.parse(html);
		Element companyElement = doc.selectFirst(".press_logo img");
		Element titleElement = doc.selectFirst("#articleTitle");
		Element createdAtElement = doc.selectFirst(".t11");
		 
		String company = companyElement.attr("alt");
		String title = titleElement.text();
		String createdAt = createdAtElement.text();
		
		System.out.println(company);
		System.out.println(title);
		System.out.println(createdAt);
	}
}
