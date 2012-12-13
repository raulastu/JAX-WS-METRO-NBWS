package com.raul.ws;

import javax.jws.WebService;

//Service Implementation Bean
@WebService(endpointInterface = "com.raul.ws.UserProfile")
public class UserProfileImpl implements UserProfile{

	@Override
	public String getUserName() {

		return "getUserName(junkie) : returned value";

	}

}