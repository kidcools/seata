package com.kidcools.seataorderservice2001.service.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("seata-acount-service2003")
public interface FeignAcountService {
}
