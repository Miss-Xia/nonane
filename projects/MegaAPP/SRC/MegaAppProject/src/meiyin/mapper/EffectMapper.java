package meiyin.mapper;

import java.util.List;
import meiyin.domain.Effect;
import meiyin.domain.EffectExample;
import org.apache.ibatis.annotations.Param;

public interface EffectMapper {
    int countByExample(EffectExample example);

    int deleteByExample(EffectExample example);

    int deleteByPrimaryKey(Long effectId);

    int insert(Effect record);

    int insertSelective(Effect record);

    List<Effect> selectByExample(EffectExample example);

    Effect selectByPrimaryKey(Long effectId);

    int updateByExampleSelective(@Param("record") Effect record, @Param("example") EffectExample example);

    int updateByExample(@Param("record") Effect record, @Param("example") EffectExample example);

    int updateByPrimaryKeySelective(Effect record);

    int updateByPrimaryKey(Effect record);
}