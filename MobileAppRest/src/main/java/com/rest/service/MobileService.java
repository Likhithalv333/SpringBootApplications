package com.rest.service;

import java.util.List;

import com.rest.model.Mobile;

public interface MobileService {
	public Mobile  saveRecord(Mobile mobile);
	public void deleteRecord(int cid);
	public Mobile updateRecord(Mobile mobile,int cid);
	public Mobile getOneRecord(int cid);
	public List<Mobile> getAllRecords();
}
