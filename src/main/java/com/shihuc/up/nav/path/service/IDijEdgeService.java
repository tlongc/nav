package com.shihuc.up.nav.path.service;

import com.shihuc.up.nav.path.model.DijEdge;

import java.util.List;

public interface IDijEdgeService {

    int deleteByPrimaryKey(Integer id);

    int insert(DijEdge record);

    DijEdge selectByPrimaryKey(Integer id);

    List<DijEdge> selectAll();

    int updateByPrimaryKey(DijEdge record);

    List<Integer> selectEdgeByPoint(Integer id);

    int deleteEdgeByPoint(Integer id);
}
