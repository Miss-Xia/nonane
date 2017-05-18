package meiyin.mapper;

import java.util.List;
import meiyin.domain.PrecautionAdvice;
import meiyin.domain.PrecautionAdviceExample;
import org.apache.ibatis.annotations.Param;

public interface PrecautionAdviceMapper {
    int countByExample(PrecautionAdviceExample example);

    int deleteByExample(PrecautionAdviceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrecautionAdvice record);

    int insertSelective(PrecautionAdvice record);

    List<PrecautionAdvice> selectByExampleWithBLOBs(PrecautionAdviceExample example);

    List<PrecautionAdvice> selectByExample(PrecautionAdviceExample example);

    PrecautionAdvice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrecautionAdvice record, @Param("example") PrecautionAdviceExample example);

    int updateByExampleWithBLOBs(@Param("record") PrecautionAdvice record, @Param("example") PrecautionAdviceExample example);

    int updateByExample(@Param("record") PrecautionAdvice record, @Param("example") PrecautionAdviceExample example);

    int updateByPrimaryKeySelective(PrecautionAdvice record);

    int updateByPrimaryKeyWithBLOBs(PrecautionAdvice record);

    int updateByPrimaryKey(PrecautionAdvice record);
}