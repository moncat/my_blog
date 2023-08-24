package com.site.blog.my.core;

import org.junit.jupiter.api.Test;
import org.moon.tools.DemoUtils;
import org.moon.tools.MoMapUtil;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
public class MyBlogApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("test");
	}


		public static void main(String[] args) {
			String ss = DemoUtils.print("123");
			System.out.println(ss);
			String map = MoMapUtil.map("123455");
			System.out.println(map);
			final HashMap ddd = MoMapUtil.map2("ddd");
			ddd.forEach((key, value) -> System.out.println(key + " -> " + value));

		}
}
