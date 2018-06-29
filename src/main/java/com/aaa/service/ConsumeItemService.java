package com.aaa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ConsumeItemMapper;
import com.aaa.entity.ConsumeItem;
import com.aaa.entity.ConsumeItemExample;

@Service
public class ConsumeItemService {
	@Autowired
	ConsumeItemMapper mapper;

	public int add(ConsumeItem consumeItem) {
		consumeItem.setGmtCreate(new Date());
		return mapper.insertSelective(consumeItem);
	}

	public boolean remove(int itemId) {
		int res = mapper.deleteByPrimaryKey(itemId);
		if (res > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean remove(List<Integer> ids) {
		ConsumeItemExample exp = new ConsumeItemExample();
		exp.createCriteria().andTypeIdIn(ids);
		int res = mapper.deleteByExample(exp);
		return res > 0 ? true : false;
	}

	public int update(ConsumeItem consumeItem) {
		consumeItem.setGmtModified(new Date());
		return mapper.updateByPrimaryKeySelective(consumeItem);
	}

	public List<ConsumeItem> queryPage(Integer pageNum, Integer pageSize) {
		ConsumeItemExample exp = new ConsumeItemExample();
		if (pageNum != null) {
			exp.setOffset((pageNum - 1) * pageSize);
			exp.setLimit(pageSize);
		}
		return mapper.selectFullByExample(exp, null);
	}

	public List<ConsumeItem> queryPage(Integer pageNum, Integer pageSize,
			Integer typeId) {
		ConsumeItemExample exp = new ConsumeItemExample();
		if (pageNum != null) {
			exp.setOffset((pageNum - 1) * pageSize);
			exp.setLimit(pageSize);
		}
		return mapper.selectFullByExample(exp, typeId);
	}

	public long getCount() {
		return mapper.countByExample(null);
	}

	public long getCount(Integer typeId) {
		ConsumeItemExample exp = new ConsumeItemExample();
		exp.createCriteria().andTypeIdEqualTo(typeId);
		return mapper.countByExample(exp);
	}

	public List<ConsumeItem> list() {
		return mapper.selectByExample(null);
	}
}
