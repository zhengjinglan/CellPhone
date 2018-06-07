package com.aaa.dao;

import java.util.List;
import java.util.Map;

public interface LibararyDao {

	public List<Map<String, Object>> query(Integer parentlibid);

	public List<Map<String, Object>> queryByRid(Integer parentlibid, Integer rid);

	public List<Map<String, Object>> queryPage(Integer offset, Integer pageSize);

	public int addNode(Map<String, Object> node);

	public int updateNode(Map<String, Object> node);
}
