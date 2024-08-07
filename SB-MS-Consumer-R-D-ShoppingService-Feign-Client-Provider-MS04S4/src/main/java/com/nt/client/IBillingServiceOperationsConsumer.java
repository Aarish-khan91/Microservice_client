package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Billing-Service")
public interface IBillingServiceOperationsConsumer {

	@GetMapping("/billing-api/billing")
	public ResponseEntity<String> getPaymentOptions();
}
