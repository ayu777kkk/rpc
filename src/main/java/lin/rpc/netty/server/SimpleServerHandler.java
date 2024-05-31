package lin.rpc.netty.server;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;


public class SimpleServerHandler extends ChannelInboundHandlerAdapter implements ChannelHandler {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ctx.channel().writeAndFlush("Ok\r\n");
        ctx.channel().close();
    }

}
