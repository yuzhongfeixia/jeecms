package com.jeecms.core.security;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;

/**
 * 密码验证的地方
 * @author chengen
 *
 */
public class CmsCredentialsMatcher extends HashedCredentialsMatcher{
	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		return super.doCredentialsMatch(token, info);
	}
	
	@Override
	protected boolean equals(Object tokenCredentials, Object accountCredentials) {
		return super.equals(tokenCredentials, accountCredentials);
	}
}
