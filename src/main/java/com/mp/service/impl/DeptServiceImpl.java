package com.mp.service.impl;

import com.mp.entity.Dept;
import com.mp.mapper.DeptMapper;
import com.mp.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chy
 * @since 2021-10-14
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
