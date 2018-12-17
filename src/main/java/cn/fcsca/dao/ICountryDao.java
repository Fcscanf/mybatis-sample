package cn.fcsca.dao;

import cn.fcsca.beans.Country;

public interface ICountryDao {

    Country selectCountryById(int cid);

    Country selectCountryByCid(int cid);

}
