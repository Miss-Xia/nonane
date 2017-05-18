package meiyin.mapper;

import java.util.List;
import meiyin.domain.CustomAdvice;
import meiyin.domain.CustomAdviceExample;
import org.apache.ibatis.annotations.Param;

public interface CustomAdviceMapper {
    int countByExample(CustomAdviceExample example);

    int deleteByExample(CustomAdviceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomAdvice record);

    int insertSelective(CustomAdvice record);

    List<CustomAdvice> selectByExample(CustomAdviceExample example);

    CustomAdvice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomAdvice record, @Param("example") CustomAdviceExample example);

    int updateByExample(@Param("record") CustomAdvice record, @Param("example") CustomAdviceExample example);

    int updateByPrimaryKeySelective(CustomAdvice record);

    int updateByPrimaryKey(CustomAdvice record);
}