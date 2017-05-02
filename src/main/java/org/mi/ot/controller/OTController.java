package org.mi.ot.controller;

import javax.validation.Valid;

import org.mi.ot.vo.UserView;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ot")
public class OTController {
	@RequestMapping(consumes = "application/json", method = RequestMethod.POST)
	public UserView add(@RequestBody @Valid UserView userView) {
		RestTemplate restTemplate = new RestTemplate();
		//String url = config.userProcessAPIURL + "process/user";
		//UserView rsp = restTemplate.postForObject(url, userView, UserView.class);

		return null;
	}

}
