package com.haina.zcglxt.auditlevel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.haina.zcglxt.auditlevel.domain.Auditlevel;


@Mapper
public interface AuditlevelMapper {
	public List<Auditlevel> findAll();
   
}