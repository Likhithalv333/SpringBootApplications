package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Electricity;
import com.rest.repo.ElectricityRepo;
@Service
public class ElectricityImp implements ElectricityService {
@Autowired
private ElectricityRepo electricityRepo;
	@Override
	public Electricity saveRecord(Electricity electricity) {
		int unts;
		double total=0.0;
		unts=electricity.getCurrent_reading()-electricity.getPrevious_reading();
		electricity.setUnits(unts);
		if(unts<300) {
			total=unts*1.75;
		}
		else if(unts>=300 && unts<500) {
			total=unts*3.75;
		}
		else if(unts>=500) {
			total=unts*7.35;
		}
		electricity.setTotalBill(total);
		Electricity e=electricityRepo.save(electricity);
		return e;
	}

	@Override
	public Electricity updateRcord(Electricity electricity, int cid) {
		Electricity oldRecord=electricityRepo.findById(cid).get();
		oldRecord.setCname(electricity.getCname());
		oldRecord.setCurrent_reading(electricity.getCurrent_reading());
		oldRecord.setPrevious_reading(electricity.getPrevious_reading());
		int unts;
		double total=0.0;
		unts=electricity.getCurrent_reading()-electricity.getPrevious_reading();
		electricity.setUnits(unts);
		if(unts<300) {
			total=unts*1.75;
		}
		else if(unts>=300 && unts<500) {
			total=unts*3.75;
		}
		else if(unts>=500) {
			total=unts*7.35;
		}
		oldRecord.setTotalBill(total);
		Electricity e=electricityRepo.save(oldRecord);
		return e;
	
	}

	@Override
	public void deleteRcord(int cid) {
		electricityRepo.deleteById(cid);
	

	}

	@Override
	public Electricity getOneRecord(int cid) {
Electricity electricity=electricityRepo.findById(cid).get();
		return electricity;
	}

	@Override
	public List<Electricity> getAllRecords() {
	List<Electricity> getAll=electricityRepo.findAll();
		return getAll;
	}

}
