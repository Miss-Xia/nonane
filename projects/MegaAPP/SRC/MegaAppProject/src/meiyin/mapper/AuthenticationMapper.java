package meiyin.mapper;

import java.util.List;
import java.util.Map;

import meiyin.domain.Authentication;
import meiyin.domain.AuthenticationExample;
import org.apache.ibatis.annotations.Param;

public interface AuthenticationMapper {
    int countByExample(AuthenticationExample example);

    int deleteByExample(AuthenticationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Authentication record);

    int insertSelective(Authentication record);

    List<Authentication> selectByExample(AuthenticationExample example);

    Authentication selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Authentication record, @Param("example") AuthenticationExample example);

    int updateByExample(@Param("record") Authentication record, @Param("example") AuthenticationExample example);

    int updateByPrimaryKeySelective(Authentication record);

    int updateByPrimaryKey(Authentication record);
    List<Map<String, Object>> checkAccount(String phone_number);
    void adduser(Map<String, Object> map);
}