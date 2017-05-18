package meiyin.mapper;

import java.util.List;
import meiyin.domain.SampleType;
import meiyin.domain.SampleTypeExample;
import org.apache.ibatis.annotations.Param;

public interface SampleTypeMapper {
    int countByExample(SampleTypeExample example);

    int deleteByExample(SampleTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SampleType record);

    int insertSelective(SampleType record);

    List<SampleType> selectByExample(SampleTypeExample example);

    SampleType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SampleType record, @Param("example") SampleTypeExample example);

    int updateByExample(@Param("record") SampleType record, @Param("example") SampleTypeExample example);

    int updateByPrimaryKeySelective(SampleType record);

    int updateByPrimaryKey(SampleType record);
}