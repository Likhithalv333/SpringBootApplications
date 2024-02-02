package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Mobile;
import com.rest.repo.MobileRepo;
@Service
public class MobileSrviceImp implements MobileService {
@Autowired
private MobileRepo mobileRepo;
	@Override
	public Mobile saveRecord(Mobile mobile) {
	double price=mobile.getPrice();
	int quantity=mobile.getQuantity();
	double totalBill=price*quantity;
		double dis=0.0;
		double gst=1.8;
		if(totalBill<2500){
			dis=0.1;
		}
		else if(totalBill>=3000 && totalBill<50000){
			dis=0.5;
		}
		else if(totalBill>=50000){
			dis=0.3;		
		}
	mobile.setDis(dis);
	double total=totalBill-dis;
	double gst_amt=total*gst;
	mobile.setGst_amt(gst_amt);
	double invoiceBill=total+gst;
	mobile.setInvoice_bill(invoiceBill);
	mobile.setTotal(totalBill);
	Mobile mobile2=mobileRepo.save(mobile);
	return mobile2;
	
	
	
	}

	@Override
	public void deleteRecord(int cid) {
		mobileRepo.deleteById(cid);

	}

	@Override
	public Mobile updateRecord(Mobile mobile, int cid) {
		Mobile oldRecord=mobileRepo.findById(cid).get();
		oldRecord.setCname(mobile.getCname());
		oldRecord.setProNmae(mobile.getProNmae());
		oldRecord.setMobileNo(mobile.getMobileNo());
		oldRecord.setPrice(mobile.getPrice());
		oldRecord.setQuantity(mobile.getQuantity());
		double totalBill=mobile.getPrice()*mobile.getQuantity();
		double dis=0.0;
		double gst=0.0;
		if(totalBill<2500){
			dis=0.1;
			gst=0.18;
		}
		else if(totalBill>=3000 && totalBill<50000){
			dis=0.5;
			gst=4.6;
		}
		else if(totalBill>=50000){
			dis=0.3;
			gst=7.5;		
		}
	oldRecord.setDis(dis);
	double total=totalBill-dis;
	double gst_amt=total*gst;
	oldRecord.setGst_amt(gst_amt);
	double invoiceBill=total+gst;
	oldRecord.setInvoice_bill(invoiceBill);
	oldRecord.setTotal(totalBill);
	Mobile mobile2=mobileRepo.save(oldRecord);
	return mobile2;
	}

	@Override
	public Mobile getOneRecord(int cid) {
		Mobile mobile=mobileRepo.findById(cid).get();
		return mobile;
	}

	@Override
	public List<Mobile> getAllRecords() {
		List<Mobile> getOne=mobileRepo.findAll();
		return getOne;
	}

}
