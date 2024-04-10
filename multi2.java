    class MyThread implements Runnable{
        @Override
        public void run(){
            System.out.print("Hello, I’m " + Thread.currentThread().getName());
        }
    }
    
    public class multi2{
        public static void main(String[] args){
            // Первый параметр: экземпляр Runnable
            // Второй параметр: своё имя (необязательно) 
            Thread myThread = new Thread(new MyThread(), "Muratkhan");
            myThread.start();
        }
    }
