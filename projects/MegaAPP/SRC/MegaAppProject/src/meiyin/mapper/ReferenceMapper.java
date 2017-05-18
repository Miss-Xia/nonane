package meiyin.mapper;

import java.util.List;
import meiyin.domain.Reference;
import meiyin.domain.ReferenceExample;
import org.apache.ibatis.annotations.Param;

public interface ReferenceMapper {
    int countByExample(ReferenceExample example);

    int deleteByExample(ReferenceExample example);

    int deleteByPrimaryKey(Long refId);

    int insert(Reference record);

    int insertSelective(Reference record);

    List<Reference> selectByExampleWithBLOBs(ReferenceExample example);

    List<Reference> selectByExample(ReferenceExample example);

    Reference selectByPrimaryKey(Long refId);

    int updateByExampleSelective(@Param("record") Reference record, @Param("example") ReferenceExample example);

    int updateByExampleWithBLOBs(@Param("record") Reference record, @Param("example") ReferenceExample example);

    int updateByExample(@Param("record") Reference record, @Param("example") ReferenceExample example);

    int updateByPrimaryKeySelective(Reference record);

    int updateByPrimaryKeyWithBLOBs(Reference record);

    int updateByPrimaryKey(Reference record);
}