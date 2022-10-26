package xyz.mwszksnmdys.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import xyz.mwszksnmdys.entities.CommonResult;

public class CustomerBlockHandler {

    public CommonResult handleException(BlockException exception){
        return new CommonResult(444, "用户自定义");
    }
    public CommonResult handleException2(BlockException exception){
        return new CommonResult(444, "用户自定义");
    }
}
