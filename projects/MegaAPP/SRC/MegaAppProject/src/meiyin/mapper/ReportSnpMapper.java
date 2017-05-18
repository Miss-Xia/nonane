package meiyin.mapper;

import java.util.List;
import meiyin.domain.ReportSnp;
import meiyin.domain.ReportSnpExample;
import org.apache.ibatis.annotations.Param;

public interface ReportSnpMapper {
    int countByExample(ReportSnpExample example);

    int deleteByExample(ReportSnpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReportSnp record);

    int insertSelective(ReportSnp record);

    List<ReportSnp> selectByExample(ReportSnpExample example);

    ReportSnp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ReportSnp record, @Param("example") ReportSnpExample example);

    int updateByExample(@Param("record") ReportSnp record, @Param("example") ReportSnpExample example);

    int updateByPrimaryKeySelective(ReportSnp record);

    int updateByPrimaryKey(ReportSnp record);
}