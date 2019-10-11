package io.netty.bootstrap;

import io.netty.channel.EventLoop;
import io.netty.resolver.AddressResolver;

public class ZuulBootstrap extends Bootstrap {
    Bootstrap bootstrap;
    public ZuulBootstrap(Bootstrap bootstrap) {
        this.bootstrap = bootstrap;
    }
    public AddressResolver<?> getResolver(final EventLoop eventLoop) {
        System.out.println("记录一下");
        return bootstrap.resolver().getResolver(eventLoop);
    }
}