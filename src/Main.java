
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3); // 需要等待 3 个任务

// 资源加载任务
        Runnable loadTask = () -> {
            try {
                Thread.sleep((long) (Math.random() * 2000));
                System.out.println(Thread.currentThread().getName() + " 加载完成");
                latch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

// 启动 3 个资源加载线程
        new Thread(loadTask, "地图").start();
        new Thread(loadTask, "音效").start();
        new Thread(loadTask, "UI").start();

// 主线程等待所有资源加载完成
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("所有资源加载完成，开始游戏！");
    }
}
