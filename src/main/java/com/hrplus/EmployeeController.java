package com.hrplus;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hrplus.entity.FinanceEmp;
import com.hrplus.entity.HREmp;
import com.hrplus.entity.MarketingEmp;
import com.hrplus.entity.ProdDevEmp;
import com.hrplus.service.FinanceService;
import com.hrplus.service.HRService;
import com.hrplus.service.MarketingService;
import com.hrplus.service.ProdDevService;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {

	public HRService hrService;
	public FinanceService financeService;
	public MarketingService marketingService;
	public ProdDevService prodDevService;

	public EmployeeController(HRService theHrService, FinanceService theFinanceService, MarketingService theMarketingService, ProdDevService theProdDevService) {
		hrService = theHrService;
		financeService = theFinanceService;
		marketingService = theMarketingService;
		prodDevService = theProdDevService;
	}

	// Mapping for /Finance
	@GetMapping("/Finance")
	public String listFinance(Model finModel) {

		// Retrieve faculties from the Database
		List<FinanceEmp> theFinance = financeService.findAll();

		// Add faculties to the spring model
		finModel.addAttribute("Finance", theFinance);

		return "finance/list-Finance";
	}

	// Mapping for /Marketing
	@GetMapping("/Marketing")
	public String listMarketing(Model markModel) {

		// Retrieve faculties from the Database
		List<MarketingEmp> theMarketing = marketingService.findAll();

		// Add faculties to the spring model
		markModel.addAttribute("Marketing", theMarketing);

		return "marketing/list-Marketing";
	}

	// Mapping for /HR
	@GetMapping("/HR")
	public String listHR(Model hrModel) {

		// Retrieve faculties from the Database
		List<HREmp> theHR = hrService.findAll();

		// Add faculties to the spring model
		hrModel.addAttribute("HR", theHR);

		return "hr/list-HR";
	}

	// Mapping for /ProdDev
	@GetMapping("/ProdDev")
	public String listProdDev(Model prodDevModel) {

		// Retrieve faculties from the Database
		List<ProdDevEmp> theProdDev = prodDevService.findAll();

		// Add faculties to the spring model
		prodDevModel.addAttribute("ProdDev", theProdDev);

		return "prodDev/list-ProdDev";
	}
	
	@GetMapping("/delete") 
	public String delete(@RequestParam("financeId") int theId) {
		
		//Remove faculty
		financeService.deleteById(theId);
		
		//Return to the faculties
		return "redirect:/Employee/Finance";
	}
	
	@GetMapping("/delete1") 
	public String delete1(@RequestParam("hrId") int theId) {
		
		//Remove faculty
		hrService.deleteById(theId);
		
		//Return to the faculties
		return "redirect:/Employee/HR";
	}
	
	@GetMapping("/delete2") 
	public String delete2(@RequestParam("marketingId") int theId) {
		
		//Remove faculty
		marketingService.deleteById(theId);
		
		//Return to the faculties
		return "redirect:/Employee/Marketing";
	}
	
	
	@GetMapping("/delete3") 
	public String delete3(@RequestParam("prodDevId") int theId) {
		
		//Remove faculty
		prodDevService.deleteById(theId);
		
		//Return to the faculties
		return "redirect:/Employee/ProdDev";
	}
	
	
	
}
