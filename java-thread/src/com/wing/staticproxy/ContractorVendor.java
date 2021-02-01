package com.wing.staticproxy;

/**
 * @author memory125
 */
// 雇佣公司
public class ContractorVendor implements ContractorEmplyee {

    // 具体的雇佣者
    private Employee employee;

    public ContractorVendor(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void mission(String mission) {
        this.employee.mission(mission);
    }
}
