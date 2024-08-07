package com.nt.cms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingServiceConsumingClient;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/shopping-api")
@Slf4j
public class ShoppingServiceOperationsController {

	@Autowired
	private BillingServiceConsumingClient clientComp;

	@GetMapping("/info")
	public ResponseEntity<String> show() {
		log.debug("from the shoppingclass show(-) method: " + clientComp.getClass());
		// Provider MS
		String billingInfo = clientComp.getBillingInfo();
		log.info("Through client component server component using feign client");

		// Get Shopping MS Result
		String shoppingInfo = "The Shopping BillAmount is :: " + new Random().nextInt(20000);
		log.info("shoppingInfo message  :: " + shoppingInfo);

		// String final result
		String finalResult = shoppingInfo + " ... " + billingInfo;
		log.info("Final message  :: " + finalResult);

		return new ResponseEntity<>(finalResult, HttpStatus.OK);
	}
}
