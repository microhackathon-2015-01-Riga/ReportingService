package com.ofg.reporting_service.config

import org.springframework.cache.CacheManager
import org.springframework.cache.ehcache.EhCacheCacheManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CacheConfiguration {
    @Bean
    CacheManager cacheManager() {
        def cacheConfig = new net.sf.ehcache.config.CacheConfiguration()
        cacheConfig.name = 'reports'
        cacheConfig.memoryStoreEvictionPolicy = 'LRU'
        cacheConfig.maxEntriesLocalHeap = 1000
        cacheConfig.timeToLiveSeconds = 60 * 10
        def config = new net.sf.ehcache.config.Configuration()
        config.addCache(cacheConfig)
        return new EhCacheCacheManager(net.sf.ehcache.CacheManager.newInstance(config))
    }
}
