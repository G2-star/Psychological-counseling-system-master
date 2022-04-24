package com.pengzhen.yixinli.service;

import com.github.pagehelper.PageInfo;
import com.pengzhen.yixinli.entity.Leacot;

import java.util.List;

public interface LeacotService {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Leacot record);

    Leacot selectByPrimaryKey(Integer id);

    List<Leacot> selectAll(int page, int limit);

    List<Leacot> selectByList();

    boolean updateByPrimaryKey(Leacot record);

    int count();

    PageInfo selectByKeyWord(Integer page, Integer limit, String keyword1);
}
