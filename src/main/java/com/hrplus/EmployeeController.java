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
	
	@GetMapping("/viewAddFinance")
	public String viewAddForm(Model finModel) {
		
		//Model attribute for data binding
		
		FinanceEmp theFinance = new FinanceEmp();
		
		finModel.addAttribute("finance", theFinance);
		
		return "finance/finance-form";
	}
	
	@GetMapping("/viewAddHR")
	public String viewAddFormHR(Model hrModel) {
		
		//Model attribute for data binding
		
		HREmp theHR = new HREmp();
		
		hrModel.addAttribute("hr", theHR);
		
		return "hr/hr-form";
	}
	
	@GetMapping("/viewAddMark")
	public String viewAddFormMark(Model markModel) {
		
		//Model attribute for data binding
		
		MarketingEmp theMarketing = new MarketingEmp();
		
		markModel.addAttribute("marketing", theMarketing);
		
		return "marketing/marketing-form";
	}
	
	@GetMapping("/viewAddProdDev")
	public String viewAddFormProdDev(Model prodDevModel) {
		
		//Model attribute for data binding
		
		ProdDevEmp theProdDev = new ProdDevEmp();
		
		prodDevModel.addAttribute("prodDev", theProdDev);
		
		return "prodDev/proddev-form";
	}
	
	@PostMapping("/saveFin")
	public String saveFinance(@ModelAttribute("finance")FinanceEmp theFinance) {
		
		//Register the faculty that has been entered
		financeService.save(theFinance);
		
		//Block duplicate submissions
		return "redirect:/Employee/Finance";
	}
	
	@PostMapping("/saveHR")
	public String saveHR(@ModelAttribute("hr")HREmp theHR) {
		
		//Register the faculty that has been entered
		hrService.save(theHR);
		
		//Block duplicate submissions
		return "redirect:/Employee/HR";
	}
	
	@PostMapping("/saveMark")
	public String saveMark(@ModelAttribute("marketing")MarketingEmp theMarketing) {
		
		//Register the faculty that has been entered
		marketingService.save(theMarketing);
		
		//Block duplicate submissions
		return "redirect:/Employee/Marketing";
	}

	@PostMapping("/saveProdDev")
	public String saveProdDev(@ModelAttribute("proddev")ProdDevEmp theProdDev) {
		
		//Register the faculty that has been entered
		prodDevService.save(theProdDev);
		
		//Block duplicate submissions
		return "redirect:/Employee/ProdDev";
	}
	
	@GetMapping("/viewUpdateFinance")
	public String viewUpdateFinance(@RequestParam("financeId")int theId, Model finModel) {
		
		//Retrieve the Faculty Info from the service layer
		FinanceEmp theFinance = financeService.findById(theId);
		
		//Pre populate the form by setting the faculty as a model attribute
		finModel.addAttribute("finance", theFinance);
		
		//Redirect to the Faculty Form
		return "finance/finance-form";
	}
	
	@GetMapping("/viewUpdateHR")
	public String viewUpdateHR(@RequestParam("hrId")int theId, Model hrModel) {
		
		//Retrieve the Faculty Info from the service layer
		HREmp theHR = hrService.findById(theId);
		
		//Pre populate the form by setting the faculty as a model attribute
		hrModel.addAttribute("hr", theHR);
		
		//Redirect to the Faculty Form
		return "hr/hr-form";
	}
	
	@GetMapping("/viewUpdateMark")
	public String viewUpdateMark(@RequestParam("marketingId")int theId, Model markModel) {
		
		//Retrieve the Faculty Info from the service layer
		MarketingEmp theMarketing = marketingService.findById(theId);
		
		//Pre populate the form by setting the faculty as a model attribute
		markModel.addAttribute("marketing", theMarketing);
		
		//Redirect to the Faculty Form
		return "marketing/marketing-form";
	}
	
	@GetMapping("/viewUpdateProdDev")
	public String viewUpdateProdDev(@RequestParam("prodDevId")int theId, Model prodDevModel) {
		
		//Retrieve the Faculty Info from the service layer
		ProdDevEmp theProdDev = prodDevService.findById(theId);
		
		//Pre populate the form by setting the faculty as a model attribute
		prodDevModel.addAttribute("prodDev", theProdDev);
		
		//Redirect to the Faculty Form
		return "prodDev/proddev-form";
	}
	
}
