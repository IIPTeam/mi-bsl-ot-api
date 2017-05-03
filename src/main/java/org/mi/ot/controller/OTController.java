package org.mi.ot.controller;

import javax.validation.Valid;

import org.mi.ot.vo.OTResponse;
import org.mi.ot.vo.OTView;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ot")
public class OTController {
	@RequestMapping(value = "/submit",consumes = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public OTResponse submit(@RequestBody @Valid OTView userView) {
		OTResponse otResponse = new OTResponse();
		otResponse.setCode(200);
		otResponse.setMessage("OT submitted successfully");
		return otResponse;
	}

}
