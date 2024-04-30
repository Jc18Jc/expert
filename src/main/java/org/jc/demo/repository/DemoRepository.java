package org.jc.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public String getData() {
        return "jc, 26";
    }
}
