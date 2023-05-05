package es.tragsatec.pssa.mapper;

import es.tragsatec.pssa.model.Animales;
import es.tragsatec.pssa.model.AnimalesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnimalesMapper {
    long countByExample(AnimalesExample example);

    int deleteByExample(AnimalesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Animales row);

    int insertSelective(Animales row);

    List<Animales> selectByExample(AnimalesExample example);

    Animales selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Animales row, @Param("example") AnimalesExample example);

    int updateByExample(@Param("row") Animales row, @Param("example") AnimalesExample example);

    int updateByPrimaryKeySelective(Animales row);

    int updateByPrimaryKey(Animales row);
}