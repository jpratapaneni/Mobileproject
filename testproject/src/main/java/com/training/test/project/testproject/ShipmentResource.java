package com.training.test.project.testproject;


import java.awt.PageAttributes.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.test.project.domain.OrderShipmentRequest;
import com.training.test.project.domain.OrderShipmentResponse;

@Controller
@RequestMapping("/api")
public class ShipmentResource 
{
	
	@RequestMapping( value = "/order/shipment", produces= {"application/json"}, method= RequestMethod.POST, consumes = {"application/json"} )
	public ResponseEntity<OrderShipmentResponse> process(@RequestHeader(name = "globalTrackingId" ) String globalTrackingId ,
			                          @RequestParam(name = "sc", required = false) String sc,
			@RequestBody(required = false) OrderShipmentRequest ordershipment)
	{
		OrderShipmentResponse orderShipmentResponse = new OrderShipmentResponse();
		 return new ResponseEntity<>(orderShipmentResponse , HttpStatus.OK);

	}

}


