package meiyin.mapper;

import java.util.List;
import meiyin.domain.RiskLevel;
import meiyin.domain.RiskLevelExample;
import org.apache.ibatis.annotations.Param;

public interface RiskLevelMapper {
    int countByExample(RiskLevelExample example);

    int deleteByExample(RiskLevelExample example);

    int deleteByPrimaryKey(Long riskLevelId);

    int insert(RiskLevel record);

    int insertSelective(RiskLevel record);

    List<RiskLevel> selectByExample(RiskLevelExample example);

    RiskLevel selectByPrimaryKey(Long riskLevelId);

    int updateByExampleSelective(@Param("record") RiskLevel record, @Param("example") RiskLevelExample example);

    int updateByExample(@Param("record") RiskLevel record, @Param("example") RiskLevelExample example);

    int updateByPrimaryKeySelective(RiskLevel record);

    int updateByPrimaryKey(RiskLevel record);
}