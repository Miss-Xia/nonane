package meiyin.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import meiyin.demo.MySessionContext;
import meiyin.domain.outdata.InSession;
import meiyin.domain.outdata.OutAlladvice;
import meiyin.domain.outdata.risk.OutRisk;
import meiyin.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReportController {
	@Autowired
	private ReportService reportService;
	/**
	 * 查询检测列表
	 * @param access_token
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/examines/list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public @ResponseBody Map<String, Object> examinesList(String access_token, HttpServletRequest request) {
		String parameter = request.getParameter("sessionId");
		HttpSession session = MySessionContext.getSession(parameter);
		InSession attribute = (InSession) session.getAttribute("session");
		Integer accountId = attribute.getAccountId();
		
		List<Map<String, Object>> report = reportService.getReport(accountId);
		Map<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("examlist", report);
		return hashMap;
	}
	/**
	 * 根据报告id查询报告详情
	 * @param access_token
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/examine/detial", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public @ResponseBody Map<String, Object> examDetial(String reportId) {
		//报告性情，通过界面传来的reportId。
		long parseLong = Long.parseLong(reportId);
		Map<String, Object> examDetial = reportService.getExamDetial(parseLong);
		return examDetial;
		
	}
	
	/**
	 * 单项详情
	 * @param access_token
	 * @param itemId
	 * @return
	 */
	@RequestMapping(value = "/item/detial", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public @ResponseBody Map<String, Object> riskAndPre(String itemId ,String reportId) {
		Map<String, Object> riskAndprec = reportService.getRiskAndprec(itemId, reportId);
		return riskAndprec;
		}
	
	
	/**
	 * 风险总览
	 * @param access_token
	 * @param reportId
	 * @return
	 */
	@RequestMapping(value = "/riskall", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public @ResponseBody OutRisk riskAll(String reportId) {
		//Long suite_id=2L;
		Long report_id=Long.parseLong(reportId);
		 OutRisk riskAll = reportService.getRiskAll(report_id);
		return riskAll;
	}
	
	/**
	 * 个性化建议
	 * @param access_token
	 * @param reportId
	 * @return
	 */
	@RequestMapping(value = "/personaldvice", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public @ResponseBody OutAlladvice getPersonalad(Long reportId) {
		OutAlladvice personalad = reportService.getPersonalad(reportId);
		return personalad;
	}
	
	}