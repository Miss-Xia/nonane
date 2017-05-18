package meiyin.mapper;

import java.util.List;
import meiyin.domain.SuiteCustomAdvice;
import meiyin.domain.SuiteCustomAdviceExample;
import org.apache.ibatis.annotations.Param;

public interface SuiteCustomAdviceMapper {
    int countByExample(SuiteCustomAdviceExample example);

    int deleteByExample(SuiteCustomAdviceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SuiteCustomAdvice record);

    int insertSelective(SuiteCustomAdvice record);

    List<SuiteCustomAdvice> selectByExample(SuiteCustomAdviceExample example);

    SuiteCustomAdvice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SuiteCustomAdvice record, @Param("example") SuiteCustomAdviceExample example);

    int updateByExample(@Param("record") SuiteCustomAdvice record, @Param("example") SuiteCustomAdviceExample example);

    int updateByPrimaryKeySelective(SuiteCustomAdvice record);

    int updateByPrimaryKey(SuiteCustomAdvice record);
}