package cn.fcsca.dao;

import cn.fcsca.beans.Minister;

public interface IMinisterDao {

    Minister selectMinisterById(int mid);

    Minister selectMinisterByMid(int mid);
}
