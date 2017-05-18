package meiyin.serviceimpl;
import java.util.List;

import javax.security.auth.login.AccountException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import meiyin.domain.Account;
import meiyin.domain.Authentication;
import meiyin.domain.AuthenticationExample;
import meiyin.domain.AuthenticationExample.Criteria;
import meiyin.mapper.AccountMapper;
import meiyin.mapper.AuthenticationMapper;
import meiyin.service.AccountService;
import meiyin.utils.SMSTool;
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AuthenticationMapper authenticationMapper;
	@Autowired
	private AccountMapper accountMapper;
	
	public void checkAccount(String phone_number) throws AccountException{
		AuthenticationExample authenticationExample = new AuthenticationExample();
		Criteria criteria = authenticationExample.createCriteria();
		criteria.andAuthCredentialEqualTo(phone_number);
		List<Authentication> example = authenticationMapper.selectByExample(authenticationExample);
		
		if (example==null || example.size()==0 ) {
			throw new AccountException("对不起，您不是我们的用户，请检测后登陆");
			
		}
	}
		/**
		 * 1 调取手机验证接口
		 * 2 发送消息到手机用户
		 * 
		 */
	public String sendMsg(String phoneNum, String password) {
		String MSG_Template_0 = "【美因】尊敬的美因基因客户，您好！你的验证码为";
		String MSG_Template_1 = "请于2分钟内在APP中输入它，完成手机验证。如需咨询，请致电美因基因客服热线400-008-0280。";
		String message = MSG_Template_0 + password + MSG_Template_1;
		if(SMSTool.sendMsg(message, phoneNum))
			return password;
		else
			return "";
	}
		
	/**
	 * 通过认证信息查询用户情况
	 */
	public Authentication getPersonalAuthen(String login_type, String phoneNum)throws Exception{
		AuthenticationExample authenticationExample = new AuthenticationExample();
		Criteria criteria = authenticationExample.createCriteria();
		criteria.andAuthCredentialEqualTo(phoneNum);
		criteria.andAuthTypeEqualTo(login_type);
		List<Authentication> list = authenticationMapper.selectByExample(authenticationExample);
		
		if(list!=null && !list.isEmpty()){
			Authentication authentication = list.get(0);
			return authentication;
			}else{
			Authentication authentication = new Authentication();
			authentication.setAccountId(650);
			return authentication;
			}
		
		
	}
	/**
	 * 通过账户id查找账号信息
	 */
	public Account getAccountById(Integer accountId)throws Exception{
		Account account = accountMapper.selectByPrimaryKey(accountId);
		return account;
	}

}
