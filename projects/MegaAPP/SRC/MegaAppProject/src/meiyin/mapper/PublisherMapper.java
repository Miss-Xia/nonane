package meiyin.mapper;

import java.util.List;
import meiyin.domain.Publisher;
import meiyin.domain.PublisherExample;
import org.apache.ibatis.annotations.Param;

public interface PublisherMapper {
    int countByExample(PublisherExample example);

    int deleteByExample(PublisherExample example);

    int deleteByPrimaryKey(Long publisherId);

    int insert(Publisher record);

    int insertSelective(Publisher record);

    List<Publisher> selectByExample(PublisherExample example);

    Publisher selectByPrimaryKey(Long publisherId);

    int updateByExampleSelective(@Param("record") Publisher record, @Param("example") PublisherExample example);

    int updateByExample(@Param("record") Publisher record, @Param("example") PublisherExample example);

    int updateByPrimaryKeySelective(Publisher record);

    int updateByPrimaryKey(Publisher record);
}