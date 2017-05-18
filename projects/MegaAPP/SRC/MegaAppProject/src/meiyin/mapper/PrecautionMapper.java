package meiyin.mapper;

import java.util.List;
import meiyin.domain.Precaution;
import meiyin.domain.PrecautionExample;
import org.apache.ibatis.annotations.Param;

public interface PrecautionMapper {
    int countByExample(PrecautionExample example);

    int deleteByExample(PrecautionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Precaution record);

    int insertSelective(Precaution record);

    List<Precaution> selectByExample(PrecautionExample example);

    Precaution selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Precaution record, @Param("example") PrecautionExample example);

    int updateByExample(@Param("record") Precaution record, @Param("example") PrecautionExample example);

    int updateByPrimaryKeySelective(Precaution record);

    int updateByPrimaryKey(Precaution record);
}