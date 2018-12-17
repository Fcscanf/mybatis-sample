import cn.fcsca.beans.Country;
import cn.fcsca.dao.ICountryDao;
import cn.fcsca.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;

public class CountryTest {
    private ICountryDao iCountryDao;
    private SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        iCountryDao = sqlSession.getMapper(ICountryDao.class);
    }

    @Test
    public void selectCountryById() {
        Country country = iCountryDao.selectCountryById(1);
        System.out.println(country.getCname());
    }

    @Test
    public void selectCountryByCid() {
        Country country = iCountryDao.selectCountryByCid(2);
        System.out.println(country);
    }
}
