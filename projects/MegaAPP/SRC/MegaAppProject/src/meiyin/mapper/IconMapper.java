package meiyin.mapper;

import java.util.List;
import meiyin.domain.Icon;
import meiyin.domain.IconExample;
import org.apache.ibatis.annotations.Param;

public interface IconMapper {
    int countByExample(IconExample example);

    int deleteByExample(IconExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Icon record);

    int insertSelective(Icon record);

    List<Icon> selectByExample(IconExample example);

    Icon selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Icon record, @Param("example") IconExample example);

    int updateByExample(@Param("record") Icon record, @Param("example") IconExample example);

    int updateByPrimaryKeySelective(Icon record);

    int updateByPrimaryKey(Icon record);
}