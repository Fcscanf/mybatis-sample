import cn.fcsca.beans.FStudent;
import cn.fcsca.beans.NewsLabel;
import cn.fcsca.dao.IFStudentDao;
import cn.fcsca.dao.INewsLabelDao;
import cn.fcsca.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FStudentTest {
    private IFStudentDao ifStudentDao;
    private SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        ifStudentDao = sqlSession.getMapper(IFStudentDao.class);
    }

    @Test
    public void selectFStudentById() {
        FStudent fStudent = ifStudentDao.selectFStudentById(1);
        System.out.println(fStudent);

    }
}
