package srcelite.finalerp.web.boot.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import srcelite.finalerp.web.boot.logic.ApprovalLogic;

@Controller
@RequestMapping("/approval")
public class ApprovalController {

	private final ApprovalLogic approvalLogic;

	public ApprovalController(ApprovalLogic approvalLogic) {
		this.approvalLogic = approvalLogic;
	}
	// 결재양식리스트 조회
	/*
	 * public ModelAndView getApprovalFormList(HttpServletRequest request,
	 * HttpServletResponse response) { logger.info("getApprovalFormList 호출 성공");
	 * HashMapBinder hmb = new HashMapBinder(request); Map<String,Object> target =
	 * new HashMap<>(); hmb.bind(target); List<Map<String,Object>>
	 * getApprovalFormList = null;
	 * getApprovalFormList=ApprovalLogic.getApprovalFormList(target);
	 * logger.info("getApprovalFormList:"+getApprovalFormList);// ModelAndView mav =
	 * new ModelAndView(); mav.setViewName("getApprovalFormList");
	 * mav.addObject("getApprovalFormList", getApprovalFormList); return mav; }
	 */

	// 결재양식리스트에서 선택한 양식 출력
	@RequestMapping("")
	public String getApprovalForm(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {

		return "";
	}

	// 결재 신청
	@RequestMapping("")
	public String submitApproval(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		return "";
	}

	// 미확인 결재 수량 표시
	@RequestMapping("")
	public String getNumUnsignedApproval(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		return "";
	}

	// 수신 결재 조회
	@RequestMapping("")
	public String getReceiveApproval(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		HttpSession session = req.getSession();
		pMap.put("login_no", session.getAttribute("login_no"));
		List<Map<String, Object>> getReceiveApproval = null;
		getReceiveApproval = approvalLogic.getReceiveApproval(pMap);
		req.setAttribute("getReceiveApproval", getReceiveApproval);

		return "forward:getReceiveApproval";
	}

	// 수신 결재 상세조회
	@RequestMapping("")
	public String getDetailReceiveApproval(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		return "";
	}

	// 발신 결재 조회
	@RequestMapping("")
	public String getSendApproval(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		HttpSession session = req.getSession();
		pMap.put("login_no", session.getAttribute("login_no"));
		List<Map<String, Object>> sendApprovalList = null;
		sendApprovalList = approvalLogic.getSendApproval(pMap);
		req.setAttribute("sendApprovalList", sendApprovalList);

		return "forward:getSendApproval";
	}

	// 결재자 조회
	@RequestMapping("")
	public String getApproverEmp(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		HttpSession session = req.getSession();
		pMap.put("login_no", session.getAttribute("login_no"));
		List<Map<String, Object>> getApproverEmp = null;
		getApproverEmp = approvalLogic.getApproverEmp(pMap);
		req.setAttribute("getApproverEmp", getApproverEmp);

		return "forward:getSendApproval";
	}

	// 발신 결재 상세조회(휴가계획서인 경우)
	@RequestMapping("")
	public String getDetailSendApproval(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		HttpSession session = req.getSession();
		pMap.put("login_no", session.getAttribute("login_no"));
		List<Map<String, Object>> getDetailSendApproval = null;
		getDetailSendApproval = approvalLogic.getDetailSendApproval(pMap);
		req.setAttribute("getDetailSendApproval", getDetailSendApproval);

		return "forward:sendVacationPlan";
	}

	// 결재 라인 조회
	@RequestMapping("")
	public String getLineApproval(HttpServletRequest req, @RequestParam Map<String, Object> pMap) {
		return "";
	}
}
