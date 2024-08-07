package com.nt.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumingClient {

	@Autowired
	private DiscoveryClient discoveryClient;

	public String getBillingInfo() {
		// Get provider MS service instances
		List<ServiceInstance> list = discoveryClient.getInstances("Billing-Service");

		// Get first instance
		ServiceInstance serviceInstance = list.get(0);

		// Get URI -- Uniform Resource Indicator of Provider MS
		URI uri = serviceInstance.getUri();

		// prepare the URL from URI pointing business method of the Provider MS
		String url = uri.toString() + "/billing-api/billing";

		// Invoke the provider MS business method using RestTemplate
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> resp = template.getForEntity(url, String.class);
		String result = resp.getBody();
		return result;

	}

}
