package com.mx.sura.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/general")
public class DefautController {

	@RequestMapping(method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public String name() {
		return "{\"username\"	:	\"LENNKENG\", \"password\"	:	\"Pruebas2019\"}";
	}
}
