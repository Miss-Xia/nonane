package meiyin.mapper;

import java.util.List;
import meiyin.domain.LongText;
import meiyin.domain.LongTextExample;
import org.apache.ibatis.annotations.Param;

public interface LongTextMapper {
    int countByExample(LongTextExample example);

    int deleteByExample(LongTextExample example);

    int deleteByPrimaryKey(Integer textId);

    int insert(LongText record);

    int insertSelective(LongText record);

    List<LongText> selectByExampleWithBLOBs(LongTextExample example);

    List<LongText> selectByExample(LongTextExample example);

    LongText selectByPrimaryKey(Integer textId);

    int updateByExampleSelective(@Param("record") LongText record, @Param("example") LongTextExample example);

    int updateByExampleWithBLOBs(@Param("record") LongText record, @Param("example") LongTextExample example);

    int updateByExample(@Param("record") LongText record, @Param("example") LongTextExample example);

    int updateByPrimaryKeySelective(LongText record);

    int updateByPrimaryKeyWithBLOBs(LongText record);
}