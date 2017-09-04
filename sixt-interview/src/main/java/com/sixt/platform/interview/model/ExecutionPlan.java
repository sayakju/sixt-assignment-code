package com.sixt.platform.interview.model;

import java.util.List;

/**
 * Created by sghosh8 on 9/3/17.
 */
public class ExecutionPlan {
    private List<Integer> executionOrder;

    public ExecutionPlan(List<Integer> executionOrder) {
        this.executionOrder = executionOrder;
    }

    public List<Integer> getExecutionOrder() {
        return executionOrder;
    }
}
