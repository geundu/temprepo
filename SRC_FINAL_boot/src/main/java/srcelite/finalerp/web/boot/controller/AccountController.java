package srcelite.finalerp.web.boot.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import srcelite.finalerp.web.boot.logic.AccountLogic;

@Controller
@RequestMapping("/account")
public class AccountController {

	private final AccountLogic accountLogic;

	public AccountController(AccountLogic accountLogic) {
		this.accountLogic = accountLogic;
	}

	// 급여 정보 변경
	@RequestMapping("/updateSalary.src1")
	public String updateSalary(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		int result = 0;
		result = accountLogic.updateSalary(pMap);

		if (result == 1) {
			return "redirect:";
		}
		else {
			return "redirect:";
		}
	}

	// 급여 정보 추가
	@RequestMapping("/insertSalary.src1")
	public String insertSalary(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		int result = 0;
		result = accountLogic.insertSalary(pMap);

		if (result == 1) {
			return "redirect:";
		}
		else {
			return "redirect:";
		}
	}

	// 수익 관리 조회
	@RequestMapping("/getProfitList.src1")
	public String getProfitList(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		List<Map<String, Object>> profitList = null;
		profitList = accountLogic.getProfitList(pMap);
		req.setAttribute("profitList", profitList);

		return "forward:getProfitList";
	}

	// 수익 관리 수정
	@RequestMapping("/updateProfit.src1")
	public String updateProfit(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		int result = 0;
		result = accountLogic.updateProfit(pMap);

		if (result == 1) {
			return "redirect:";
		}
		else {
			return "redirect:";
		}
	}

	// 수익 관리 추가
	@RequestMapping("/insertProfit.src1")
	public String insertProfit(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		int result = 0;
		result = accountLogic.insertProfit(pMap);

		if (result == 1) {
			return "redirect:";
		}
		else {
			return "redirect:";
		}
	}

	// 지출 관리 조회
	@RequestMapping("/getExpenseList.src1")
	public String getExpenseList(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		List<Map<String, Object>> expenseList = null;
		expenseList = accountLogic.getExpenseList(pMap);
		req.setAttribute("expenseList", expenseList);

		return "forward:getExpenseList";
	}

	// 지출 관리 수정
	@RequestMapping("/updateExpense.src1")
	public String updateExpense(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		int result = 0;
		result = accountLogic.updateExpense(pMap);

		if (result == 1) {
			return "redirect:";
		}
		else {
			return "redirect:";
		}
	}

	// 지출 관리 추가
	@RequestMapping("/insertExpense.src1")
	public String insertExpense(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		int result = 0;
		result = accountLogic.insertExpense(pMap);

		if (result == 1) {
			return "redirect:";
		}
		else {
			return "redirect:";
		}
	}

	// 손익 조회
	@RequestMapping("/getBalanceList.src1")
	public String getBalanceList(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		List<Map<String, Object>> balanceList = null;
		balanceList = accountLogic.getBalanceList(pMap);
		req.setAttribute("balanceList", balanceList);

		return "forward:getBalanceList";
	}

	// 월말결산
	@RequestMapping("/getMonthStatement.src1")
	public String getMonthStatement(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {

		return "";
	}
}
