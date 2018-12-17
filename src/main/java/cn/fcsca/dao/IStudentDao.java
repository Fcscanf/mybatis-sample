package cn.fcsca.dao;

import cn.fcsca.beans.Student;
import org.apache.ibatis.annotations.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IStudentDao {

    /*
    * 注解通过sql语句替代了mapper映射语句
    * 使用注解时要更改mybatis.xml配置文件对mapper.xml的映射为package
    * 对于多属性参数value需要要{}*/
//    @Insert(value = {"insert into student(name,age,score) values (#{name},#{age},#{score})"})
    void insertStudent(Student student);

    @Insert("insert into student(name,age,score) values (#{name},#{age},#{score})")
    @SelectKey(statement = "select @@identity",resultType = int.class,keyProperty = "id",before = false)
    void insertStudentCacheId(Student student);

//    @Delete(value = "delete from student where id=#{xxx}")
    void deleteStudentById(int id);

//    @Update("update student set name=#{name},age=#{age},score=#{score} where id=#{id}")
    void updataStudent(Student student);

    Map<String, Object> selectAllStudentsMap();

//    @Select("select id,name,age,score from student where id=#{id}")
    List<Student> selectAllStudent();

    Student selectStudentById(int id);

    List<Student> selectStudentsByConditionMap(Map<String,Object> map);

    List<Student> selectStudentsByCondition(String name,int age);

    List<Student> selectStudentsByIf(Student student);

    List<Student> selectStudentsByWhere(Student student);

    List<Student> selectStudentsByChoose(Student student);

    List<Student> selectStudentsByForeachArray(int[] ids);

    List<Student> selectStudentsByForeachList(List<Integer> ids);

    List<Student> selectStudentsByForeachStudent(List<Student> ids);

    List<Student> selectStudentsByForeachStudentSql(List<Student> ids);
}
