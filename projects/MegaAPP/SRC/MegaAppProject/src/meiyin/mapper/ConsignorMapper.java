package meiyin.mapper;

import java.util.List;
import meiyin.domain.Consignor;
import meiyin.domain.ConsignorExample;
import org.apache.ibatis.annotations.Param;

public interface ConsignorMapper {
    int countByExample(ConsignorExample example);

    int deleteByExample(ConsignorExample example);

    int deleteByPrimaryKey(Long consignorId);

    int insert(Consignor record);

    int insertSelective(Consignor record);

    List<Consignor> selectByExample(ConsignorExample example);

    Consignor selectByPrimaryKey(Long consignorId);

    int updateByExampleSelective(@Param("record") Consignor record, @Param("example") ConsignorExample example);

    int updateByExample(@Param("record") Consignor record, @Param("example") ConsignorExample example);

    int updateByPrimaryKeySelective(Consignor record);

    int updateByPrimaryKey(Consignor record);
}