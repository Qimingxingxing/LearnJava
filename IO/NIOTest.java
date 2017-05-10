package LearnJava.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by qimingzhang on 2017/5/10.
 */
public class NIOTest {
    public static void copyFileUseNIO(String src,String dst) throws IOException {
        //声明源文件和目标文件
        FileInputStream fi=new FileInputStream(new File(src));
        FileOutputStream fo=new FileOutputStream(new File(dst));
        //获得传输通道channel
        FileChannel inChannel=fi.getChannel();
        FileChannel outChannel=fo.getChannel();
        //获得容器buffer
        ByteBuffer buffer=ByteBuffer.allocate(1024);
        while(true){
            //判断是否读完文件
            int eof =inChannel.read(buffer);
            if(eof==-1){
                break;
            }
            //重设一下buffer的position=0，limit=position
            buffer.flip();
            //开始写
            outChannel.write(buffer);
            //写完要重置buffer，重设position=0,limit=capacity
            buffer.clear();
        }
        inChannel.close();
        outChannel.close();
        fi.close();
        fo.close();
    }
    public void handle(SelectableChannel ... channels) throws IOException{
        Selector selector = Selector.open();
        for (SelectableChannel channel: channels){
            channel.register(selector, SelectionKey.OP_WRITE | SelectionKey.OP_READ);
        }
        while (!Thread.currentThread().isInterrupted()){
            int readyChannels = selector.select();
            if (readyChannels == 0){
                continue;
            }
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> keyIterator = selectionKeys.iterator();
            while (keyIterator.hasNext()){
                SelectionKey key = keyIterator.next();
                SelectableChannel channel = key.channel();
                if(key.isReadable()){
                    // TODO
                }else if(key.isWritable()){
                    // TODO
                }
                keyIterator.remove();
            }
        }
    }
}
