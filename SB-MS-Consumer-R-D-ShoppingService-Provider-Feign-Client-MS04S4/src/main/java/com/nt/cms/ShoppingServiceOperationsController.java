package com.nt.cms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingServiceConsumingClient;

@RestController
@RequestMapping("/shopping-api")
public class ShoppingServiceOperationsController {

	@Autowired
	private BillingServiceConsumingClient clientComp;

	@GetMapping("/shopping")
	public ResponseEntity<String> show() {

		// Provider MS
		String billingInfo = clientComp.getBillingInfo();
		try {
			Thread.sleep(50000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Get Shopping MS Result
		String shoppingInfo = "The Shopping BillAmount is :: " + new Random().nextInt(20000);

		// String final result
		String finalResult = shoppingInfo + " ... " + billingInfo;
		
		return new ResponseEntity<>(finalResult, HttpStatus.OK);
	}
}
