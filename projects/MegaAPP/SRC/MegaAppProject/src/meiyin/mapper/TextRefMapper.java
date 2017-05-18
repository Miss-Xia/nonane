package meiyin.mapper;

import java.util.List;
import meiyin.domain.TextRef;
import meiyin.domain.TextRefExample;
import org.apache.ibatis.annotations.Param;

public interface TextRefMapper {
    int countByExample(TextRefExample example);

    int deleteByExample(TextRefExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TextRef record);

    int insertSelective(TextRef record);

    List<TextRef> selectByExample(TextRefExample example);

    TextRef selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TextRef record, @Param("example") TextRefExample example);

    int updateByExample(@Param("record") TextRef record, @Param("example") TextRefExample example);

    int updateByPrimaryKeySelective(TextRef record);

    int updateByPrimaryKey(TextRef record);
}