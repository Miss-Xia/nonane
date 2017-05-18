package meiyin.service;
import javax.security.auth.login.AccountException;

import meiyin.domain.Account;
import meiyin.domain.Authentication;
import meiyin.domain.Picture;
import meiyin.domain.User;
public interface AccountService {
/**
 * 手机验证接口
 * @param phonenumber
 * @param request
 * @return
 * @throws AccountException 
 * @throws Exception
 */
	public void checkAccount(String phonenumber) throws AccountException;
	public String sendMsg(String phoneNum, String password)throws Exception;
	public Authentication getPersonalAuthen(String login_type, String phoneNum)throws Exception;
	public Account getAccountById(Integer accountId)throws Exception;
	
}
