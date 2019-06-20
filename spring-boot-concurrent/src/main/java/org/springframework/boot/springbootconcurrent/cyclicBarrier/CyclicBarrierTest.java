package org.springframework.boot.springbootconcurrent.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * 栅栏类似于闭锁，它能阻塞一组线程直到某个事件的发生。栅栏与闭锁的关键区别在于，
 * 所有的线程必须同时到达栅栏位置，才能继续执行。闭锁用于等待事件，而栅栏用于等待其他线程。
 * CyclicBarrier可以使一定数量的线程反复地在栅栏位置处汇集。
 * 当线程到达栅栏位置时将调用await方法，这个方法将阻塞直到所有线程都到达栅栏位置。
 * 如果所有线程都到达栅栏位置，那么栅栏将打开，此时所有的线程都将被释放，而栅栏将被重置以便下次使用。
 */
public class CyclicBarrierTest {
	// 自定义工作线程
	private static class Worker extends Thread {
		private CyclicBarrier cyclicBarrier;
		
		public Worker(CyclicBarrier cyclicBarrier) {
			this.cyclicBarrier = cyclicBarrier;
		}
		
		@Override
		public void run() {
			// super.run();
			try {
				System.out.println(Thread.currentThread().getName() + "开始等待其他线程");
                System.out.println("等待数量" + cyclicBarrier.getNumberWaiting());
				cyclicBarrier.await();
				System.out.println(Thread.currentThread().getName() + "开始执行");
				// 工作线程开始处理，这里用Thread.sleep()来模拟业务处理
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName() + "执行完毕");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		int threadCount = 5;
		CyclicBarrier cyclicBarrier = new CyclicBarrier(threadCount);
		
		for (int i = 2; i < threadCount; i++) {
			System.out.println("创建工作线程" + i);
			Worker worker = new Worker(cyclicBarrier);
			worker.start();
		}

        try {
            Thread.sleep(2000);
            System.out.println("∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cyclicBarrier.reset();

        for (int i = 0; i < threadCount; i++) {
            System.out.println("创建工作线程----" + (i + 5));
            Worker worker = new Worker(cyclicBarrier);
            worker.start();
        }
	}
}