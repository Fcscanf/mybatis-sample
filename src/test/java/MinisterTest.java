import cn.fcsca.beans.Country;
import cn.fcsca.beans.Minister;
import cn.fcsca.dao.ICountryDao;
import cn.fcsca.dao.IMinisterDao;
import cn.fcsca.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

public class MinisterTest {
    private IMinisterDao iMinisterDao;
    private SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        iMinisterDao = sqlSession.getMapper(IMinisterDao.class);
    }

    @Test
    public void selectCountryById() {
        Minister minister = iMinisterDao.selectMinisterById(2);
        System.out.println(minister);
    }

    @Test
    public void selectCountryByMid() {
        Minister minister = iMinisterDao.selectMinisterByMid(2);
        System.out.println(minister);
    }
}
