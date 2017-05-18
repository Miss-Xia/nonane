package meiyin.mapper;

import java.util.List;
import meiyin.domain.Suite;
import meiyin.domain.SuiteExample;
import org.apache.ibatis.annotations.Param;

public interface SuiteMapper {
    int countByExample(SuiteExample example);

    int deleteByExample(SuiteExample example);

    int deleteByPrimaryKey(Long suiteId);

    int insert(Suite record);

    int insertSelective(Suite record);

    List<Suite> selectByExample(SuiteExample example);

    Suite selectByPrimaryKey(Long suiteId);

    int updateByExampleSelective(@Param("record") Suite record, @Param("example") SuiteExample example);

    int updateByExample(@Param("record") Suite record, @Param("example") SuiteExample example);

    int updateByPrimaryKeySelective(Suite record);

    int updateByPrimaryKey(Suite record);
}