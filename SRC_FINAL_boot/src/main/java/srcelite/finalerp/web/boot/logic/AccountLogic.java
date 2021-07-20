package srcelite.finalerp.web.boot.logic;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import srcelite.finalerp.web.boot.dao.AccountDao;

@Service
public class AccountLogic {

	private final AccountDao accountDao;

	public AccountLogic(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	// 급여 정보 변경
	public int updateSalary(Map<String, Object> pMap) {
		int result = 0;
		result = accountDao.updateSalary(pMap);
		return result;
	}

	// 급여 정보 추가
	public int insertSalary(Map<String, Object> pMap) {
		int result = 0;
		result = accountDao.insertSalary(pMap);
		return result;
	}

	// 수익 관리 조회
	public List<Map<String, Object>> getProfitList(Map<String, Object> pMap) {
		List<Map<String, Object>> profitList = null;
		profitList = accountDao.getProfitList(pMap);
		return profitList;
	}

	// 수익 관리 수정
	public int updateProfit(Map<String, Object> pMap) {
		int result = 0;
		result = accountDao.updateProfit(pMap);
		return result;
	}

	// 수익 관리 추가
	public int insertProfit(Map<String, Object> pMap) {
		int result = 0;
		result = accountDao.insertProfit(pMap);
		return result;
	}

	// 지출 관리 조회
	public List<Map<String, Object>> getExpenseList(Map<String, Object> pMap) {
		List<Map<String, Object>> expenseList = null;
		expenseList = accountDao.getExpenseList(pMap);
		return expenseList;
	}

	// 지출 관리 수정
	public int updateExpense(Map<String, Object> pMap) {
		int result = 0;
		result = accountDao.updateExpense(pMap);
		return result;
	}

	// 지출 관리 추가
	public int insertExpense(Map<String, Object> pMap) {
		int result = 0;
		result = accountDao.insertExpense(pMap);
		return result;
	}

	// 손익 조회
	public List<Map<String, Object>> getBalanceList(Map<String, Object> pMap) {
		List<Map<String, Object>> expenseList = null;
		expenseList = accountDao.getBalanceList(pMap);
		return expenseList;
	}

	// 월말 결산
	public List<Map<String, Object>> getMonthStatement(Map<String, Object> pMap) {

		return null;
	}
}
