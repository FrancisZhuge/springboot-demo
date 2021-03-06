package com.francis.spring_common.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author hzzhugequn
 * @date 2018/8/8
 * @since JDK 1.8
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
