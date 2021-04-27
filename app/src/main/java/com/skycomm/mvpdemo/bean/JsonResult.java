package com.skycomm.mvpdemo.bean;

public class JsonResult {

	/**
	 * 杩斿洖鐘舵�鏄惁鎴愬姛
	 */
	private boolean flag = false;

	/**
	 * 鎻愮ず淇℃伅
	 */
	private String message;

	/**
	 * 璇锋眰杩斿洖鐨刯son缁撴灉
	 */
	private String result;

	/**
	 * 鐘舵�鐮�
	 */
	private int statusCode;

	public JsonResult() {

	}

	public JsonResult(boolean flag, String message, String result, int statusCode) {
		this.flag = flag;
		this.message = message;
		this.result = result;
		this.statusCode = statusCode;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "JsonResult{" +
				"flag=" + flag +
				", message='" + message + '\'' +
				", result='" + result + '\'' +
				", statusCode=" + statusCode +
				'}';
	}
}
