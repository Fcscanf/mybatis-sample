import cn.fcsca.beans.Student;
import cn.fcsca.dao.IStudentDao;
import cn.fcsca.dao.impl.StudentDaoImpl;
import cn.fcsca.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest {
    private IStudentDao iStudentDao;
    private Student student;
    private SqlSession sqlSession;

    @Before
    public void before(){
        sqlSession = MyBatisUtils.getSqlSession();
        iStudentDao = sqlSession.getMapper(IStudentDao.class);
    }

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void testInsert() throws IOException {
        Student student = new Student("Amery", 22, 89);
        iStudentDao.insertStudent(student);
    }

    @Test
    public void testInsertCacheId() throws IOException {
        Student student = new Student("戴维超", 20, 19);
        System.out.println("插入前：student="+ student );
        iStudentDao.insertStudentCacheId(student);
        System.out.println("插入后：student="+ student );
        sqlSession.commit();
    }

    @Test
    public void deleteId() throws IOException {
        iStudentDao.deleteStudentById(13);
        sqlSession.commit();
    }

    @Test
    public void update() throws IOException {
        Student student = new Student("Awswe",12,55);
        student.setId(10);
        iStudentDao.updataStudent(student);
        sqlSession.commit();
    }

    @Test
    public void selectStudent() throws IOException {
        List<Student> students = iStudentDao.selectAllStudent();
        for (Student student : students){
            System.out.println(student);
        }
    }

    @Test
    public void selectStudentMap() throws IOException {
        Map<String,Object> map = iStudentDao.selectAllStudentsMap();
        System.out.println(map.get("ck"));
    }

    /*框架底层选择selectone，这里输出为Map所以不可用*/
    @Test
    public void selectStudentById() throws IOException {
        student = iStudentDao.selectStudentById(10);
        System.out.println(student);
    }

    @Test
    public void selectStudentByCondition() throws IOException {
//        Student student1 = new Student("wert",20,98);
//        Map<String, Object> map = new HashMap<>();
//        map.put("name", "c");
//        map.put("age", 20);
//        map.put("student1", student1);

        List<Student> students = iStudentDao.selectStudentsByCondition("c",20);
        for (Student student : students){
            System.out.println(student);
        }
    }

    @Test
    public void selectStudentsByIf() {
        /*全条件查询*/
//        Student student1 = new Student("c", 20, 80);
        /*若其他传过来的值为空则需要在where后加条件*/
//        Student student1 = new Student("", 20, 80);
        Student student1 = new Student("", 0, 80);
        List<Student> students = iStudentDao.selectStudentsByIf(student1);
        for (Student student : students){
            System.out.println(student);
        }
    }

    @Test
    public void selectStudentsByWhere() {
        Student student1 = new Student("", 20, 90);
        List<Student> students = iStudentDao.selectStudentsByWhere(student1);
        for (Student student : students){
            System.out.println(student);
        }
    }

    @Test
    public void selectStudentsByChoose() {
        Student student1 = new Student("ck", 20, 90);
        List<Student> students = iStudentDao.selectStudentsByChoose(student1);
        for (Student student : students){
            System.out.println(student);
        }
    }

    @Test
    public void selectStudentsByForeachArray() {
        int[] ids = {1, 3, 4};
        List<Student> students = iStudentDao.selectStudentsByForeachArray(ids);
        for (Student student : students){
            System.out.println(student);
        }
    }

    @Test
    public void selectStudentsByForeachList() {
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(3);
        List<Student> students = iStudentDao.selectStudentsByForeachList(ids);
        for (Student student : students){
            System.out.println(student);
        }
    }

    @Test
    public void selectStudentsByForeachStudent() {
        Student student1 = new Student();
        student1.setId(1);
        Student student2 = new Student();
        student2.setId(3);
        List<Student> students1 = new ArrayList<>();
        students1.add(student1);
        students1.add(student2);
        List<Student> students = iStudentDao.selectStudentsByForeachStudent(students1);
        for (Student student : students){
            System.out.println(student);
        }
    }

    @Test
    public void selectStudentsByForeachStudentSql() {
        Student student1 = new Student();
        student1.setId(1);
        Student student2 = new Student();
        student2.setId(3);
        List<Student> students1 = new ArrayList<>();
        students1.add(student1);
        students1.add(student2);
        List<Student> students = iStudentDao.selectStudentsByForeachStudentSql(students1);
        for (Student student : students){
            System.out.println(student);
        }
    }

    /*
    * 开启内置二级缓存的步骤
    * 1.对实体进行序列化
    * 2.在映射文件添加<cache/>标签
    * 注意：引入EhCache的二级缓存无需序列化实体类*/

}
