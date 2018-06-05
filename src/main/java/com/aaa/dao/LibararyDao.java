package com.aaa.dao;

import java.util.List;
import java.util.Map;

public interface LibararyDao {

	public List<Map<String, Object>> query(Integer parentlibid);
// 查询指定角色的全列列表
	public List<Map<String, Object>> queryByRid(Integer parentlibid, Integer rid);
}
