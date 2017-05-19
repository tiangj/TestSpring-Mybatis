package com.test.bean.mapper;

import com.test.bean.TestEnum;
import com.test.bean.TestEnumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestEnumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testenum
     *
     * @mbggenerated
     */
    int countByExample(TestEnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testenum
     *
     * @mbggenerated
     */
    int deleteByExample(TestEnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testenum
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testenum
     *
     * @mbggenerated
     */
    int insert(TestEnum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testenum
     *
     * @mbggenerated
     */
    int insertSelective(TestEnum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testenum
     *
     * @mbggenerated
     */
    List<TestEnum> selectByExample(TestEnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testenum
     *
     * @mbggenerated
     */
    TestEnum selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testenum
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TestEnum record, @Param("example") TestEnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testenum
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TestEnum record, @Param("example") TestEnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testenum
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TestEnum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testenum
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TestEnum record);
}