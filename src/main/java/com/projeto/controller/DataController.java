package com.projeto.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/date/compare")
public class DataController {
	
	@PostMapping
	public String compare(
			@RequestParam("data1") String txtdata1, 
			@RequestParam("data2") String txtdata2) throws ParseException
	{
		 SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
	        Date data1 = sdformat.parse(txtdata1);
	        Date data2 = sdformat.parse(txtdata2);
	        long timeDiff = data2.getTime()-data1.getTime();
	        int daysDiff = (int) ((timeDiff / (1000 * 60 * 60* 24))+1);
	        
	        String dateReturn = "Resultado: " + daysDiff + " dias";
		    return dateReturn;
	       
	}

	
	
}
