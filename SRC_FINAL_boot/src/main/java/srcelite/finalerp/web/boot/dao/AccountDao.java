package srcelite.finalerp.web.boot.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {
	private final SqlSessionTemplate sqlSessionTemplate;

	public AccountDao(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	/**
	 * 급여 정보 변경
	 * 
	 * @param pMap
	 * @return
	 */
	public int updateSalary(Map<String, Object> pMap) {
		int result = 0;
		result = sqlSessionTemplate.update("updateSalary", pMap);
		return result;
	}

	/**
	 * 급여 정보 추가
	 * 
	 * @param pMap
	 * @return
	 */
	public int insertSalary(Map<String, Object> pMap) {
		int result = 0;
		result = sqlSessionTemplate.insert("insertSalary", pMap);
		return result;
	}

	// 수익 관리 조회
	public List<Map<String, Object>> getProfitList(Map<String, Object> pMap) {
		List<Map<String, Object>> profitList = null;
		profitList = sqlSessionTemplate.selectList("getProfitList", pMap);
		return profitList;
	}

	// 수익 관리 수정
	public int updateProfit(Map<String, Object> pMap) {
		int result = 0;
		result = sqlSessionTemplate.update("updateProfit", pMap);
		return result;
	}

	// 수익 관리 추가
	public int insertProfit(Map<String, Object> pMap) {
		int result = 0;
		result = sqlSessionTemplate.insert("insertProfit", pMap);
		return result;
	}

	// 지출 관리 조회
	public List<Map<String, Object>> getExpenseList(Map<String, Object> pMap) {
		List<Map<String, Object>> expenseList = null;
		expenseList = sqlSessionTemplate.selectList("getExpenseList", pMap);
		return expenseList;
	}

	// 지출 관리 수정
	public int updateExpense(Map<String, Object> pMap) {
		int result = 0;
		result = sqlSessionTemplate.update("updateExpense", pMap);
		return result;
	}

	// 지출 관리 추가
	public int insertExpense(Map<String, Object> pMap) {
		int result = 0;
		result = sqlSessionTemplate.insert("insertExpense", pMap);
		return result;
	}

	// 손익 조회
	public List<Map<String, Object>> getBalanceList(Map<String, Object> pMap) {
		List<Map<String, Object>> balanceList = null;
		balanceList = sqlSessionTemplate.selectList("getBalanceList", pMap);
		return balanceList;
	}

	// 연말 결산
	public List<Map<String, Object>> getMonthStatement(Map<String, Object> pMap) {
		List<Map<String, Object>> list = null;
		return list;
	}
}
