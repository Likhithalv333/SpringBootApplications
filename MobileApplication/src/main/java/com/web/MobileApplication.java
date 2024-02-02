package com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.entity.Mobile;
import com.web.repo.MobileRepo;

@SpringBootApplication
public class MobileApplication implements CommandLineRunner {
    
	@Autowired
	private MobileRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(MobileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Mobile mobile = new Mobile("90876","15promax","apple",12,512, "mac","A15 Bionic chip","32mp",
//				"64mp+64mp+64mp",153000.90,"AEF7654");
//		Mobile mobile1 = new Mobile("67654","S23Ultra","samsung",12,512, "android","octacore/2gHz","12mp",
//				"104mp+32mp+322mp",150000.90,"AEF875tgg");
//		Mobile mobile2 = new Mobile("634412","Reno7","oppo",8,128, "android","octacore/3.5GHz","32mp",
//				"12mp+12mp+12mp",23000.90,"hjuo809");
//		Mobile mobile3 = new Mobile("67893","v32","vivo",8,128, "android","octacore/3.2Ghz","12mp",
//				"32mp+48mp+12mp",19000.90,"nijhy9879");
//		Mobile mobile4 = new Mobile("79976","9pro","realme",12,512, "android","octacore/3.8GHz","32mp",
//				"64mp+48mp+12mp+",45000.90,"bhjgigmk098");
//		Mobile mobile5 = new Mobile("23467","13promax","apple",8,256, "mac","A15 Bionic chip","12mp",
//				"12mp+12mp+12mp",93000.90,"09ojikjnh");
//		Mobile mobile6 = new Mobile("87654","15promax","apple",12,512, "mac","A15 Bionic chip","12mp",
//				"12mp+12mp+12mp",150000.90,"9ujuihjuh");
//		repo.save(mobile);
//		repo.save(mobile1);
//		repo.save(mobile2);
//		repo.save(mobile3);
//		repo.save(mobile);
//		repo.save(mobile1);
//		repo.save(mobile2);
//		System.out.println("data inserted sucessfully...");
//        System.out.println("UPDATE MOBILE RECORD");
//        Mobile oldMobile = repo.findById("67893").get();
//		Mobile newMobile = new Mobile();
//		newMobile.setMobile_Name("A30");
//		newMobile.setCompany_Name("samsung");
//		newMobile.setRam(4);
//		newMobile.setRom(64);
//		newMobile.setF_cam("32mp");
//		newMobile.setB_cam("64mp");
//		newMobile.setPrice(18000.90);
//		newMobile.setImei_no("ASDRETG89");
//		
//		oldMobile.setMobile_Name(newMobile.getMobile_Name());
//		oldMobile.setCompany_Name(newMobile.getCompany_Name());
//		oldMobile.setRam(newMobile.getRam());
//		oldMobile.setRom(newMobile.getRom());
//		oldMobile.setF_cam(newMobile.getF_cam());
//		oldMobile.setB_cam(newMobile.getB_cam());
//		oldMobile.setPrice(newMobile.getPrice());
//		oldMobile.setImei_no(newMobile.getImei_no());
//		repo.save(oldMobile);
//		System.out.println("record updated successfully..........");
//		
//		System.out.println("GET ONE RECORD");
//		Mobile mobile = repo.findById("67893").get();
//		System.out.println(mobile);
		
//		System.out.println("GET ALL RECORDS");
//		List<Mobile> listOfAllMobiles = (List<Mobile>) repo.findAll();
//		for (Mobile mobile : listOfAllMobiles) {
//			System.out.println(mobile);
//		}
		System.out.println("DELETE ONE RECORD");
		repo.deleteById("67893");
		System.out.println("deleted successfully............");
	}

}