package com.design.mode.simple.factory;

/**
 * Created by zhangyuan on 2020/2/10 0010.
 */
public class OperationFactory {

    public static AbstractOperation createOperation(OperationEnum operationEnum){
        AbstractOperation operation = null;
        switch(operationEnum){
            case A:
                operation = new ConcreateOperationA();
                break;
            case B:
                operation = new ConcreateOperationB();
                break;
            default:
                operation = new ConcreateOperationC();
                break;
        }
        return operation;
    }
}
