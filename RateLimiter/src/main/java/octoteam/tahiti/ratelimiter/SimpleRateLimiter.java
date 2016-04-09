package octoteam.tahiti.ratelimiter;

/**
 * 所有 RateLimiter 都应该实现这个接口，使用 tryAcquire() 判断是否到达阈值
 */
public interface SimpleRateLimiter {

    /**
     * 尝试获取令牌
     *
     * @return 如果未超出阈值返回 true，否则返回 false。
     */
    boolean tryAcquire();

}