package com.elastic.search;


public class ElasticSearchConnectionException extends Throwable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5763367913167987826L;

	public ElasticSearchConnectionException(String message){
		super(message);
	}
	
	public ElasticSearchConnectionException(Throwable e){
		super(e);
	}
	
	public ElasticSearchConnectionException(String message,Throwable e){
		super(message,e);
	}
}
