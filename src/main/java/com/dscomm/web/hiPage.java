package com.dscomm.web;

import com.dscomm.SpringbootJdbcApplication;
import com.dscomm.dao.IAccountDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;


/**
 * Created by fangzhipeng on 2017/4/20.
 */

@RestController
//@RequestMapping("/Outline")
@EnableScheduling
public class hiPage {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootJdbcApplication.class);


	@Autowired
	IAccountDAO accountService;


	// 测试
	@RequestMapping(value = "/helloworld", method = { RequestMethod.GET })
	public String hello(@RequestParam(value = "name") String name) {
		System.out.println(name);
		return "success";
	}

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String test1(
			@RequestBody(required = true) String date) {

		return date;
	}




}

