package cn.fcsca.dao;

import cn.fcsca.beans.FStudent;

public interface IFStudentDao {
    FStudent selectFStudentById(int sid);
}
