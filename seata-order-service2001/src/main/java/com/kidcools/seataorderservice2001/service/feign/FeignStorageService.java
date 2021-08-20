package com.kidcools.seataorderservice2001.service.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("seata-storage-servive2002")
public interface FeignStorageService {

}
