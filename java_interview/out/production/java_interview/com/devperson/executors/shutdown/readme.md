线程池的生命周期
---

- 创建一个线程池以后，在执行完毕所有的线程之后，如果不调用shutdown或者shutdownnow方法，则创建的线程池对象，将继续保留，等待新的
  线程进入
- shutdown: 线程池中，所有线程执行完毕以后，线程池销毁
- shutdownNow: 执行之后，线程池马上销毁，并且返回未执行的线程列表--> List<Runnable>
- awaitTermination(long timeout, TimeUnit unit): 查看线程池是否终止，此方法阻塞方法，调用此方法，主线最长会阻塞指定的时间（timeout）
  在调用此方法之后，如果线程池在指定时间之内执行完毕，则该方法取消阻塞，继续执行后面的操作，如果在指定时间内，线程池依然没有执行完毕，
  则此方法取消阻塞
