package meiyin.mapper;

import java.util.List;
import meiyin.domain.ItemPrecautionAdvice;
import meiyin.domain.ItemPrecautionAdviceExample;
import org.apache.ibatis.annotations.Param;

public interface ItemPrecautionAdviceMapper {
    int countByExample(ItemPrecautionAdviceExample example);

    int deleteByExample(ItemPrecautionAdviceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemPrecautionAdvice record);

    int insertSelective(ItemPrecautionAdvice record);

    List<ItemPrecautionAdvice> selectByExample(ItemPrecautionAdviceExample example);

    ItemPrecautionAdvice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemPrecautionAdvice record, @Param("example") ItemPrecautionAdviceExample example);

    int updateByExample(@Param("record") ItemPrecautionAdvice record, @Param("example") ItemPrecautionAdviceExample example);

    int updateByPrimaryKeySelective(ItemPrecautionAdvice record);

    int updateByPrimaryKey(ItemPrecautionAdvice record);
}