package meiyin.mapper;

import java.util.List;
import meiyin.domain.Snp;
import meiyin.domain.SnpExample;
import org.apache.ibatis.annotations.Param;

public interface SnpMapper {
    int countByExample(SnpExample example);

    int deleteByExample(SnpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Snp record);

    int insertSelective(Snp record);

    List<Snp> selectByExample(SnpExample example);

    Snp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Snp record, @Param("example") SnpExample example);

    int updateByExample(@Param("record") Snp record, @Param("example") SnpExample example);

    int updateByPrimaryKeySelective(Snp record);

    int updateByPrimaryKey(Snp record);
}