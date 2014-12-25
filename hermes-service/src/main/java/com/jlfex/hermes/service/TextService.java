package com.jlfex.hermes.service;

import com.jlfex.hermes.model.Text;

/**
 * 文本业务接口
 * 
 * @author ultrafrog
 * @version 1.0, 2013-12-19
 * @since 1.0
 */
public interface TextService {

	/**
	 * 通过关系和类型加载文本
	 * 
	 * @param reference
	 * @param type
	 * @return
	 */
	public Text loadByReferenceAndType(String reference, String type);
}
