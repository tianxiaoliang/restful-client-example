package com.cloud.client.wsclient;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;

public class DummyAPIProvider extends DefaultApi10a{

	@Override
	public String getAccessTokenEndpoint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAuthorizationUrl(Token arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRequestTokenEndpoint() {
		// TODO Auto-generated method stub
		return null;
	}

}
