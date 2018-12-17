import cn.fcsca.beans.Country;
import cn.fcsca.beans.NewsLabel;
import cn.fcsca.dao.ICountryDao;
import cn.fcsca.dao.INewsLabelDao;
import cn.fcsca.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class NewsLabelTest {
    private INewsLabelDao iNewsLabelDao;
    private SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
        iNewsLabelDao = sqlSession.getMapper(INewsLabelDao.class);
    }

    /*根据子节点查询父节点*/
    @Test
    public void selectChildrenByParent() {
        List<NewsLabel> children = iNewsLabelDao.selectChildrenByParent(2);
        for (NewsLabel newsLabel : children) {
            System.out.println(newsLabel);
        }
    }

    /*根据ID查询其对应的子节点*/
    @Test
    public void selectNewsLabelById() {
        NewsLabel newsLabel = iNewsLabelDao.selectNewsLabelById(7);
        System.out.println(newsLabel);
    }
}
