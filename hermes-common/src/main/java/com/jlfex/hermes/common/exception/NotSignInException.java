package com.jlfex.hermes.common.exception;

/**
 * 登录异常
 * 
 * @author ultrafrog
 * @version 1.0, 2014-01-13
 * @since 1.0
 */
public class NotSignInException extends ServiceException {

	private static final long serialVersionUID = -1272712119724615344L;
	
	/**
	 * 构造函数
	 */
	public NotSignInException() {
		super("user not sign in.");
	}
}
