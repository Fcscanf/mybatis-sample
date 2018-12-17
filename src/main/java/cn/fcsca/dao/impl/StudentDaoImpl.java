package cn.fcsca.dao.impl;

import cn.fcsca.beans.Student;
import cn.fcsca.dao.IStudentDao;
import cn.fcsca.utils.MyBatisUtils;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDaoImpl implements IStudentDao {
    private SqlSession sqlSession;

    @Override
    public void insertStudent(Student student){
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.insert("insertStudent", student);
            sqlSession.commit();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public void insertStudentCacheId(Student student) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.insert("insertStudentCacheId", student);
            sqlSession.commit();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public void deleteStudentById(int id) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.delete("deleteStudentById",id);
            sqlSession.commit();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public void updataStudent(Student student) {
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.update("updataStudent",student);
            sqlSession.commit();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Override
    public List<Student> selectAllStudent() {
        List<Student> students = new ArrayList<>();
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            students = sqlSession.selectList("selectAllStudent");
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return students;
    }

    @Override
    public Map<String, Object> selectAllStudentsMap() {
        Map<String, Object> map = new HashMap<>();
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            map = sqlSession.selectMap("selectAllStudent","name");
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return map;
    }

    @Override
    public Student selectStudentById(int id) {
        Student student = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            student = sqlSession.selectOne("selectStudentById",id);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return student;
    }

    @Override
    public List<Student> selectStudentsByConditionMap(Map<String,Object> map) {
        List<Student> students = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            students = sqlSession.selectList("selectStudentsByName",map);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return students;
    }

    /*
    * mapper数据库映射文件的id改至dao层后直接从dao层映射，无需通过实现类
    * 其中测试类的也要定义新的dao*/
    @Override
    public List<Student> selectStudentsByCondition(String name, int age) {
        return null;
    }

    @Override
    public List<Student> selectStudentsByIf(Student student) {
        return null;
    }

    @Override
    public List<Student> selectStudentsByWhere(Student student) {
        return null;
    }

    @Override
    public List<Student> selectStudentsByChoose(Student student) {
        return null;
    }

    @Override
    public List<Student> selectStudentsByForeachArray(int[] ids) {
        return null;
    }

    @Override
    public List<Student> selectStudentsByForeachList(List<Integer> ids) {
        return null;
    }

    @Override
    public List<Student> selectStudentsByForeachStudent(List<Student> ids) {
        return null;
    }

    @Override
    public List<Student> selectStudentsByForeachStudentSql(List<Student> ids) {
        return null;
    }

}
