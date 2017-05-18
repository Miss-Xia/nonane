package meiyin.test;

import meiyin.utils.SMSTool;

import org.springframework.stereotype.Service;



@Service
public class ImSmsService implements InSmsService {
	private final static String MSG_Template_0 = "【美因】尊敬的美因基因客户，您好！您的基因检测报告已生成。请您登陆“美因基因”官网或关注“美因”微信公众号，点击“报告查询”查看报告！报告查询账号（样本编号）：";
	//private final static String MSG_Template_0 = "【美因】尊敬的美因基因客户，您好！您的基因检测报告已生成。请您登陆“美因基因”官网或关注“美因”微信公众号后查询电子版报告！报告查询账号（样本编号）:";
	private final static String MSG_Template_1 = "密码：";
	private final static String MSG_Template_2 = " 。如需纸质版报告，请在2-3天后联系体检中心或到店领取。如需咨询，请致电美因基因客服热线400-008-0280。";

	public String sendMsg(String phoneNum, String sampleNum, String password) {
		
		
		String message = MSG_Template_0 + sampleNum + MSG_Template_1 + password + MSG_Template_2;
		
		if(SMSTool.sendMsg(message, phoneNum))
			return password;
		else
			return "";
	}

}
