package com.learn.sam;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.learn.sam.fault.InvalidInputExcepton;

@WebService
@SOAPBinding(style = Style.RPC)
public class ShopInfo {

	private static final String SINCE_PROPERTY_VALUE = "since 2018";
	private static final String SINCE_PROPERTY = "since";
	private static final String SHOP_NAME_VALUE = "Test Mart";
	private static final String SHOP_NAME_PROPERTY = "shopName";
	private static final String INVALID_PROPERTY = "Invalid property";

	@WebResult(name = "lookupResult")
	public String getShopInfo(@WebParam(name = "lookupProperty") String property) throws InvalidInputExcepton {

		String response = INVALID_PROPERTY;
		if (SHOP_NAME_PROPERTY.equals(property)) {
			response = SHOP_NAME_VALUE;
		} else if (SINCE_PROPERTY.equals(property)) {
			response = SINCE_PROPERTY_VALUE;
		} else {
			throw new InvalidInputExcepton("Invalid property", property + " is not known");
		}

		return response;
	}

}
