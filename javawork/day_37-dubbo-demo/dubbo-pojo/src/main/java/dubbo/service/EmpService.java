package dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.pojo.Emp;

import java.util.HashMap;
import java.util.List;

public interface EmpService {
    /**
     * 实现员工列表
     * @param hashMap
     * @return
     */
    List<Emp> empList(HashMap hashMap);
}
