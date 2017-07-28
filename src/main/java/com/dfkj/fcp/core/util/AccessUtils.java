package com.dfkj.fcp.core.util;

public class AccessUtils {
	/**
	 * 报警服务IP
	 */
	public static final String ALARM_SERVICE_HOST = "127.0.0.1";
	
	/**
	 * 报警服务端口
	 */
	public static final Integer ALARM_SERVICE_PORT = 8080;
	
	
	/**
	 * 报警服务请求地址
	 */
	public static final String ALARM_SERVICE = String.format("http://%s:%d/fcp/alarm/deviceAlarm/", ALARM_SERVICE_HOST, ALARM_SERVICE_PORT);

	
	/**
	 * 终端上线请求地址
	 */
	public static final String ONLINE_SERVICE = String.format("http://%s:%d/fcp/terminal/postOnline/", ALARM_SERVICE_HOST, ALARM_SERVICE_PORT);
}
