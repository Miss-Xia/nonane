package meiyin.mapper;

import java.util.List;
import meiyin.domain.Picture;
import meiyin.domain.PictureExample;
import org.apache.ibatis.annotations.Param;

public interface PictureMapper {
    int countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(Long picId);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExample(PictureExample example);

    Picture selectByPrimaryKey(Long picId);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}