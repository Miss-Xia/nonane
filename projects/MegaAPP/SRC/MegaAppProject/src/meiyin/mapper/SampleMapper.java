package meiyin.mapper;

import java.util.List;
import meiyin.domain.Sample;
import meiyin.domain.SampleExample;
import org.apache.ibatis.annotations.Param;

public interface SampleMapper {
    int countByExample(SampleExample example);

    int deleteByExample(SampleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sample record);

    int insertSelective(Sample record);

    List<Sample> selectByExample(SampleExample example);

    Sample selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sample record, @Param("example") SampleExample example);

    int updateByExample(@Param("record") Sample record, @Param("example") SampleExample example);

    int updateByPrimaryKeySelective(Sample record);

    int updateByPrimaryKey(Sample record);
}