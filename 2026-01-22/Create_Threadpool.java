/* Runnable interface: 
	The Runnable interface should be implemented by any class whose instances are intended to be executed by a 
	thread. Runnable interface have only one method named run().
	
	public void run(): is used to perform action for a thread.
 */

// public class Creating_Thread_Using_Interface implements Runnable {
//     public void run() {
//         System.out.println("Runnable thread running");
//     }

//     public static void main(String[] args) {
//     	Creating_Thread_Using_Interface ref = new Creating_Thread_Using_Interface();
//         Thread t = new Thread(ref);
//         t.start();
//     }
// }


// Daemon Thread in Java :
// 	A Daemon Thread is a background thread that runs to support user threads.
// 	When all user (non-daemon) threads finish, the JVM automatically terminates daemon threads.
// 	Daemon thread runs in background
// 	JVM does not wait for daemon threads
// 	setDaemon(true) must be called before start()
// 	It is a low priority thread.


// public class Daemon_vs_User {

//     public static void main(String[] args) {

//         Thread daemonThread = new Thread(() -> {
//             while (true) {
//                 System.out.println("Daemon thread running...");
//                 try {
//                     Thread.sleep(1000);
//                 } catch (InterruptedException e) {
//                     System.out.println("Daemon interrupted");
//                 }
//             }
//         });
//         daemonThread.setDaemon(true);

//         daemonThread.start();

//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Main thread running: " + i);
//             try {
//                 Thread.sleep(2000);
//             } catch (InterruptedException e) {
//                 System.out.println("Main thread interrupted");
//             }
//         }

//         System.out.println("Main thread finished");
//     }
// }


// Java Thread Pool :
// 	Java Thread pool represents a group of worker threads that are waiting for the job and reuse many times.
// 	In case of thread pool, a group of fixed size threads are created. A thread from the thread pool is pulled
// 	out and assigned a job by the service provider. After completion of the job, thread is contained in the 
// 	thread pool again.	
// 	Better performance It saves time because there is no need to create new thread.
// 	It is used in Servlet and JSP where container creates a thread pool to process the request.
	
// ---------------------------------------------------------------------------------------------------

// In a thread pool, we do NOT create threads directly.
// We create a pool, and the pool creates & manages threads.

// ExecutorService pool = Executors.newFixedThreadPool(3);
// Pool created
// 3 threads are created internally
// Threads are ready and waiting


// In Java thread pools, execute() is needed to submit a task to the pool so that a worker thread can run it.
// execute() sends a task to the thread pool
// The thread pool decides WHICH thread will run it
// You do not create or start threads manually

// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;

// class Task implements Runnable {

//     int taskId;

//     Task(int taskId) {
//         this.taskId = taskId;
//     }

//     @Override
//     public void run() {
//         System.out.println(
//             "Task " + taskId +
//             " executed by " +
//             Thread.currentThread().getName()
//         );
//     }
// }

// public class Create_Threadpool {

//     public static void main(String[] args) {

//         // Create thread pool of size 3
//         ExecutorService service = Executors.newFixedThreadPool(3);

//         // Submit 6 tasks
//         for (int i = 1; i <= 6; i++) {
//             service.execute(new Task(i));
//         }

//         // Shutdown pool
//         service.shutdown();
//     }
// }


// Synchronization in Java :
// 	Synchronization in java is the capability to control the access of multiple threads to any shared resource.
// 	Java Synchronization is better option where we want to allow only one thread to access the shared resource.
// 	The synchronization is mainly used to
// 		1.To prevent thread interference.
// 		2.To prevent consistency problem
	
// Concept of Lock in Java: 
// 	Synchronization is built around an internal entity known as the lock or monitor. 
// 	Every object has an lock associated with it. 
// 	By convention, a thread that needs consistent access to an object's fields has to acquire the object's 
// 	lock before accessing them, and then release the lock when it's done with them.
	
	
// Java synchronized method :	
// 	If you declare any method as synchronized, it is known as synchronized method.
// 	Synchronized method is used to lock an object for any shared resource.
// 	When a thread invokes a synchronized method, it automatically acquires the lock for that object and 
// 	releases it when the thread completes its task.
	
// Synchronized block in java :
// 	Synchronized block can be used to perform synchronization on any specific resource of the method.
// 	Suppose you have 50 lines of code in your method, but you want to synchronize only 5 lines, you can use
// 	synchronized block.
// 	If you put all the codes of the method in the synchronized block, it will work same as the synchronized method.	
// 	Synchronized block is used to lock an object for any shared resource.
// 	Scope of synchronized block is smaller than the method.
	
// -------------------------------------------------------------------------------------------------------

// Deadlock in java :
// 	Deadlock is a situation in Java where two or more threads are permanently blocked, each waiting for a 
// 	lock held by another thread.
	
	
// Inter-thread communication in Java :
// 	Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with 
// 	each other.
// 	Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in its critical 
// 	section and another thread is allowed to enter (or lock) in the same critical section to be executed.
// 	It is implemented by following methods of Object class:
// 		wait()
// 		notify()
// 		notifyAll()	
	
// wait() method :
// 	Causes current thread to release the lock and wait until either another thread invokes the notify() method 
// 	or the notifyAll() method for this object, or a specified amount of time has elapsed.
// 	The current thread must own this object's monitor, so it must be called from the synchronized method only 
// 	otherwise it will throw exception.	
	
// notify() method : 
// 	Wakes up a single thread that is waiting on this object's monitor.
// 	If any threads are waiting on this object, one of them is chosen to be awakened. 
// 	The choice is arbitrary and occurs at the discretion of the implementation.	
	
// notifyAll() method : 
// 	Wakes up all threads that are waiting on this object's monitor.


// WITHOUT SYNCHRONIZED

// class Spotify {
// 	public void playSongs(int n,String type) {
// 		for(int i=1;i<=n;i++) {
// 			System.out.println(type+i+" played");
// 		}
// 	}
// }
// class MyList1 implements Runnable {
// 	int n;
// 	String type;
// 	Spotify spotify;
// 	public MyList1(int n, String type, Spotify spotify) {
// 		this.n = n;
// 		this.type = type;
// 		this.spotify = spotify;
// 	}
// 	@Override
// 	public void run() {
// 		spotify.playSongs(n, type);
// 	}
// }
// class MyList2 implements Runnable {
// 	int n;
// 	String type;
// 	Spotify spotify;
// 	public MyList2(int n, String type, Spotify spotify) {
// 		this.n = n;
// 		this.type = type;
// 		this.spotify = spotify;
// 	}
// 	@Override
// 	public void run() {
// 		spotify.playSongs(n, type);
// 	}
// }

// public class Without_Sync_Methos {
//     public static void main(String[] args) {
//     	Spotify spotify = new Spotify();
//     	MyList1 m1 = new MyList1(4, "Sad song ", spotify);
//     	MyList2 m2 = new MyList2(4, "Love song ", spotify);
    	
//     	Thread t1 = new Thread(m1);
//     	Thread t2 = new Thread(m2);
//     	t1.start();
//     	t2.start();
    	
    
//     }
// }


// for Synchronized  make plainsongs method as synchronized


// DEADLOCK 

// public class DeadlockDemo {

//     static final Object lock1 = new Object();
//     static final Object lock2 = new Object();

//     public static void main(String[] args) {

//         Thread t1 = new Thread(() -> {
//             synchronized (lock1) {
//                 System.out.println("Thread 1 acquired lock1");

//                 try { Thread.sleep(100); } catch (InterruptedException e) {}

//                 synchronized (lock2) {
//                     System.out.println("Thread 1 acquired lock2");
//                 }
//             }
//         });

//         Thread t2 = new Thread(() -> {
//             synchronized (lock2) {
//                 System.out.println("Thread 2 acquired lock2");

//                 try { Thread.sleep(100); } catch (InterruptedException e) {}

//                 synchronized (lock1) {
//                     System.out.println("Thread 2 acquired lock1");
//                 }
//             }
//         });

//         t1.start();
//         t2.start();
//     }
// }

// Inter_Thread_Communication



// class Customer {
//     int amount = 10000;

//     synchronized void withdraw(int amt) throws Exception {
//         if(amount < amt) wait();
//         amount -= amt;
//         System.out.println("Withdraw completed");
//     }

//     synchronized void deposit(int amt) {
//         amount += amt;
//         notify();
//     }
// }

// public class Inter_Thread_Communication {
//     public static void main(String[] args) {
//         Customer c = new Customer();

//         new Thread(() -> {
//             try { c.withdraw(15000); } catch(Exception e){}
//         }).start();

//         new Thread(() -> c.deposit(10000)).start();
//     }
// }