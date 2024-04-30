package org.jc.demo.service;

import org.jc.demo.domain.DemoBean;
import org.jc.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoRepository demoRepository;

    public DemoBean parseData() {
        DemoBean demoBean = new DemoBean();
        String data = demoRepository.getData();
        demoBean.setName(data.split(",")[0]);
        demoBean.setAge(data.split(",")[1]);
        return demoBean;
    }
}
