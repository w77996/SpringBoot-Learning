package com.w77996.springbootjsr003.exception;

import com.w77996.springbootjsr003.result.CodeMsg;

public class GlobalException extends RuntimeException {


    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }

}
