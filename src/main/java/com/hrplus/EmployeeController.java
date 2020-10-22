package com.hrplus;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hrplus.model.Employee;
import com.hrplus.model.FinanceEmp;
import com.hrplus.model.HREmp;
import com.hrplus.model.MarketingEmp;
import com.hrplus.model.ProdDevEmp;
import com.hrplus.service.IEmployeeService;

/**
 * Handle /Employee endpoint
 * @author Administrator
 *
 */

@Controller
@RequestMapping("/Employee")
public class EmployeeController {

	private List<FinanceEmp> Finance;
	private List<HREmp> HR;
	private List<MarketingEmp> Marketing;
	private List<ProdDevEmp> ProdDev;
	
	private List<Employee> Employees = new ArrayList<>(); 
	
	@Autowired
	private IEmployeeService employeeServiceStub; 

	@PostConstruct
	private void LoadData() {

		// Create Finance Dept
		FinanceEmp fin1 = new FinanceEmp(1, "Adam Brown", "$100,000", "21", "6", "15", "$230,000");
		FinanceEmp fin2 = new FinanceEmp(2, "Tiffany Litteral", "$120,000", "21", "6", "15", "$300,000");
		FinanceEmp fin3 = new FinanceEmp(3, "Jacob Difrank", "$130,000", "21", "6", "15", "$350,000");
		FinanceEmp fin4 = new FinanceEmp(4, "Alen Anand", "$140,000", "21", "6", "15", "$210,000");

		// Create List For Finance Employees
		Finance = new ArrayList<>();

		// Add Finance Employees to List
		Finance.add(fin1);
		Finance.add(fin2);
		Finance.add(fin3);
		Finance.add(fin4);

		// Create Marketing Dept
		MarketingEmp mark1 = new MarketingEmp(1, "Tiffany Litteral", "$250,000", "21", "6", "15", "$400,000");
		MarketingEmp mark2 = new MarketingEmp(2, "Jacob Difrank", "$300,000", "21", "6", "15", "$290,000");
		MarketingEmp mark3 = new MarketingEmp(3, "Alen Anand", "$200,000", "21", "6", "15", "$360,000");
		MarketingEmp mark4 = new MarketingEmp(4, "Adam Brown", "$150,000", "21", "6", "15", "$350,000");

		// Create List for Marketing Employees
		Marketing = new ArrayList<>();

		// Add Marketing Employees to List
		Marketing.add(mark1);
		Marketing.add(mark2);
		Marketing.add(mark3);
		Marketing.add(mark4);

		// Create HR Dept
		HREmp hr1 = new HREmp(1, "Jacob Difrank", "$120,000", "21", "6", "15", "$690,000");
		HREmp hr2 = new HREmp(2, "Alen Anand", "$500,000", "21", "6", "15", "$560,000");
		HREmp hr3 = new HREmp(3, "Adam Brown", "$370,000", "21", "6", "15", "$340,000");
		HREmp hr4 = new HREmp(4, "Tiffany Litteral", "$230,000", "21", "6", "15", "$270,000");

		// Create List for HR Employees
		HR = new ArrayList<>();

		// Add HR Employees to List
		HR.add(hr1);
		HR.add(hr2);
		HR.add(hr3);
		HR.add(hr4);

		// Create Product Development Dept
		ProdDevEmp pd1 = new ProdDevEmp(1, "Alen Anand", "$600,000", "21", "6", "15", "$700,000");
		ProdDevEmp pd2 = new ProdDevEmp(2, "Adam Brown", "$400,000", "21", "6", "15", "$540,000");
		ProdDevEmp pd3 = new ProdDevEmp(3, "Tiffany Litteral", "$540,000", "21", "6", "15", "$800,000");
		ProdDevEmp pd4 = new ProdDevEmp(4, "Jacob Difrank", "$570,000", "21", "6", "15", "$780,000");

		// Create List for Product Development Employees
		ProdDev = new ArrayList<>();

		// Add Product Development EMployees to List
		ProdDev.add(pd1);
		ProdDev.add(pd2);
		ProdDev.add(pd3);
		ProdDev.add(pd4);

	}

	
	@GetMapping("/Finance")
	public String listFinance(Model finModel) {
		
		//finModel.addAttribute("Finance", Finance);
		
		Employees = employeeServiceStub.fetchByEmpType("Finance"); 
		finModel.addAttribute("Finance", Employees); 

		return "list-Finance";
	}

	// Mapping for /Marketing
	@GetMapping("/Marketing")
	public String listMarketing(Model markModel) {

		markModel.addAttribute("Marketing", Marketing);

		return "list-Marketing";
	}

	// Mapping for /HR
	@GetMapping("/HR")
	public String listHR(Model hrModel) {

		hrModel.addAttribute("HR", HR);

		return "list-HR";
	}

	// Mapping for /ProdDev
	@GetMapping("/ProdDev")
	public String listProdDev(Model prodDevModel) {

		prodDevModel.addAttribute("ProdDev", ProdDev);

		return "list-ProdDev";
	}
}
