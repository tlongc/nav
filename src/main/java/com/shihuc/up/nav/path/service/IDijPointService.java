package com.shihuc.up.nav.path.service;

import com.shihuc.up.nav.path.model.DijPoint;

import java.util.List;

public interface IDijPointService {

    int deleteByPrimaryKey(Integer id);

    int insert(DijPoint record);

    DijPoint selectByPrimaryKey(Integer id);

    List<DijPoint> selectAll();

    List<Integer> deletePointAndEdges(Integer id);

    int updateByPrimaryKey(DijPoint record);

    List<DijPoint> calcNearestPath(int src, int dst);

}
