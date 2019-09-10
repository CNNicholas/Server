package com.shsxt.server.core;
/**
 * 服务器小脚本接口
 * 
 * @author 朱致宇1999
 *
 */
public interface Servlet {
	void service(Request request,Response response);
}
