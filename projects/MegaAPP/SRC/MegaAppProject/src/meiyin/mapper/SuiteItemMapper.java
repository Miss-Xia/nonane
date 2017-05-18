package meiyin.mapper;

import java.util.List;
import meiyin.domain.SuiteItem;
import meiyin.domain.SuiteItemExample;
import org.apache.ibatis.annotations.Param;

public interface SuiteItemMapper {
    int countByExample(SuiteItemExample example);

    int deleteByExample(SuiteItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SuiteItem record);

    int insertSelective(SuiteItem record);

    List<SuiteItem> selectByExample(SuiteItemExample example);

    SuiteItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SuiteItem record, @Param("example") SuiteItemExample example);

    int updateByExample(@Param("record") SuiteItem record, @Param("example") SuiteItemExample example);

    int updateByPrimaryKeySelective(SuiteItem record);

    int updateByPrimaryKey(SuiteItem record);
}