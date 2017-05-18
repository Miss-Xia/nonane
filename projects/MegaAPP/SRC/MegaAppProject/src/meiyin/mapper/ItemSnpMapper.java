package meiyin.mapper;

import java.util.List;
import meiyin.domain.ItemSnp;
import meiyin.domain.ItemSnpExample;
import org.apache.ibatis.annotations.Param;

public interface ItemSnpMapper {
    int countByExample(ItemSnpExample example);

    int deleteByExample(ItemSnpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemSnp record);

    int insertSelective(ItemSnp record);

    List<ItemSnp> selectByExample(ItemSnpExample example);

    ItemSnp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemSnp record, @Param("example") ItemSnpExample example);

    int updateByExample(@Param("record") ItemSnp record, @Param("example") ItemSnpExample example);

    int updateByPrimaryKeySelective(ItemSnp record);

    int updateByPrimaryKey(ItemSnp record);
}