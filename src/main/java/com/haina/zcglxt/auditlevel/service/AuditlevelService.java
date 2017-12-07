package com.haina.zcglxt.auditlevel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haina.zcglxt.auditlevel.dao.AuditlevelMapper;
import com.haina.zcglxt.auditlevel.domain.Auditlevel;

@Service
public class AuditlevelService {
	@Autowired
	private AuditlevelMapper auditlevelMapper;
	public List<Auditlevel> findAll() {
		List<Auditlevel> list = auditlevelMapper.findAll();
		return list;
	}
}
