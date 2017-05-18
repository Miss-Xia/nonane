package meiyin.mapper;

import java.util.List;
import meiyin.domain.SuiteChild;
import meiyin.domain.SuiteChildExample;
import org.apache.ibatis.annotations.Param;

public interface SuiteChildMapper {
    int countByExample(SuiteChildExample example);

    int deleteByExample(SuiteChildExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SuiteChild record);

    int insertSelective(SuiteChild record);

    List<SuiteChild> selectByExample(SuiteChildExample example);

    SuiteChild selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SuiteChild record, @Param("example") SuiteChildExample example);

    int updateByExample(@Param("record") SuiteChild record, @Param("example") SuiteChildExample example);

    int updateByPrimaryKeySelective(SuiteChild record);

    int updateByPrimaryKey(SuiteChild record);
}