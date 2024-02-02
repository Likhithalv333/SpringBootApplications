package com.rest.service;

import java.util.List;

import com.rest.model.Electricity;

public interface ElectricityService {

		public Electricity saveRecord(Electricity electricity);
		public Electricity updateRcord(Electricity electricity,int cid);
		public void deleteRcord(int cid);
		public Electricity getOneRecord(int cid);
		public List<Electricity> getAllRecords();
}
