package com.greendotcorp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.greendotcorp.soap.GetAccountRequest;
import com.greendotcorp.soap.GetAccountResponse;

@Endpoint
public class AccountEndpoint {
	private static final String NAMESPACE_URI = "http://greendotcorp.com/soap";
	@Autowired
	private AccountUtility accountUtility;	

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAccountRequest")
	@ResponsePayload
	public GetAccountResponse getAccount(@RequestPayload GetAccountRequest request) {
		GetAccountResponse response = new GetAccountResponse();
		response.setAccount(accountUtility.getAccount(request.getAccountId()));
		return response;
	}
}
