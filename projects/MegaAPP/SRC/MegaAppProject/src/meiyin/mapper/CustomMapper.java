package meiyin.mapper;

import java.util.List;
import meiyin.domain.Custom;
import meiyin.domain.CustomExample;
import org.apache.ibatis.annotations.Param;

public interface CustomMapper {
    int countByExample(CustomExample example);

    int deleteByExample(CustomExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Custom record);

    int insertSelective(Custom record);

    List<Custom> selectByExampleWithBLOBs(CustomExample example);

    List<Custom> selectByExample(CustomExample example);

    Custom selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByExampleWithBLOBs(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByExample(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKeyWithBLOBs(Custom record);

    int updateByPrimaryKey(Custom record);
}