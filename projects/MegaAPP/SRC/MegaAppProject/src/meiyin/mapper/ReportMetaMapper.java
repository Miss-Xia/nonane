package meiyin.mapper;

import java.util.List;
import meiyin.domain.ReportMeta;
import meiyin.domain.ReportMetaExample;
import org.apache.ibatis.annotations.Param;

public interface ReportMetaMapper {
    int countByExample(ReportMetaExample example);

    int deleteByExample(ReportMetaExample example);

    int insert(ReportMeta record);

    int insertSelective(ReportMeta record);

    List<ReportMeta> selectByExampleWithBLOBs(ReportMetaExample example);

    List<ReportMeta> selectByExample(ReportMetaExample example);

    int updateByExampleSelective(@Param("record") ReportMeta record, @Param("example") ReportMetaExample example);

    int updateByExampleWithBLOBs(@Param("record") ReportMeta record, @Param("example") ReportMetaExample example);

    int updateByExample(@Param("record") ReportMeta record, @Param("example") ReportMetaExample example);
}