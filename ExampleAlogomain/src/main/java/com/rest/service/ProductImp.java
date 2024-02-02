package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Charges;
import com.rest.model.Product;
import com.rest.repo.ProductRepo;
@Service
public class ProductImp implements ProductService {

		@Autowired
		private ProductRepo productRepo;
		@Override
		public Product saveRecord(Product product) {
		    double dis = 0.0;
		    double gst = 0.0;
		   double finalPrice;
		    double dilervaryCharges = 0.0;
		    double price = product.getProPrice();
		    double finalBill;

		    if (product != null) {
		        if (product.getProductCategory().equalsIgnoreCase("Electronics")) {
		            dis = 0.15;
		            gst = 0.18;
		            dilervaryCharges = 350;
		        } else if (product.getProductCategory().equalsIgnoreCase("Home Applianaces")) {
		            dis = 0.22;
		            gst = 0.24;
		            dilervaryCharges = 800;
		        } else if (product.getProductCategory().equalsIgnoreCase("Clothing")) {
		            dis = 0.4;
		            gst = 0.12;
		            dilervaryCharges = 0.0;
		        } else if (product.getProductCategory().equalsIgnoreCase("Furniture")) {
		            dis = 0.1;
		            gst = 0.18;
		            dilervaryCharges = 300.0;
		        }
		       
		    }

		    System.out.println("Discount: " + dis);
		    System.out.println("GST: " + gst);
		    System.out.println("Delivery Charges: " + dilervaryCharges);

		    Charges charges=new Charges();
		    charges.setDiscount(dis);
		    charges.setGst(gst);
		  charges.setDileveryCharges(dilervaryCharges);
		    product.setCharge(charges);

		    double disAmt = price * dis;
		    double gstAmt = price * gst;
		    finalBill = price - disAmt + gstAmt;
		    product.setFinalPrice(finalBill);

		    Product product2 = productRepo.save(product);
		    return product2;
	}

	@Override
	public List<Product> getAllRecords() {
		List<Product> list=productRepo.findAll();
		return list;
	}

}
